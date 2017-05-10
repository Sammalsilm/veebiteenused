
package ee.ttu.ws.mattias_koosalu.employersservice;

import ee.ttu.ws.mattias_koosalu.employers.*;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.*;

@WebService(serviceName = "employers", portName = "employersPort",
        endpointInterface = "ee.ttu.ws.mattias_koosalu.employers.EmployersPortType",
        targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB")
public class Employers {
    private static final String TOKEN = "?";
    private static final ApiErrorType INCORRECT_TOKEN_ERROR = new ApiErrorType("bad_token", "incorrect token");
    private static final ApiErrorType MISSING_DATA_ERROR = new ApiErrorType("missing_data", "a required field was not found in the request");

    private List<Employer> employers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Employee> unemployed = new ArrayList<>();

    private HashMap<String, EmployeeResponseType> addEmployeeOperations = new HashMap<>();
    private HashMap<String, EmployerResponseType> addEmployerOperations = new HashMap<>();
    private HashMap<String, EmployeeResponseType> getEmployeeOperations = new HashMap<>();
    private HashMap<String, EmployerResponseType> getEmployerOperations = new HashMap<>();
    private HashMap<String, EmployeesResponseType> getEmployeesOperations = new HashMap<>();
    private HashMap<String, EmployersResponseType> getEmployersOperations = new HashMap<>();
    private HashMap<String, EmployeesResponseType> findEmployeesOperations = new HashMap<>();
    private HashMap<String, EmployeesResponseType> getEmployeesAtEmployerOperations = new HashMap<>();

    public EmployeeResponseType addEmployee(AddEmployeeRequestType parameter) {
        EmployeeResponseType response = new EmployeeResponseType();

        if (TOKEN.equals(parameter.getToken())) {
            if (parameter.getOperationId() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (addEmployeeOperations.containsKey(parameter.getOperationId())) {
                return addEmployeeOperations.get(parameter.getOperationId());
            }

            Employee employee = parameter.getEmployee();
            int age = employee.getAge();

            if (employee.getEyeColor() == null ||
                    employee.getHairColor() == null ||
                    employee.getAge() == 0 ||
                    employee.getIdCode() == null ||
                    employee.getName() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                addEmployeeOperations.put(parameter.getOperationId(), response);
                return response;
            }

            if (age < 1 || age > 150) {
                response.setApiError(new ApiErrorType("validation_error",
                        "suggested age " + age + " is not a valid age for an employee"));
                addEmployeeOperations.put(parameter.getOperationId(), response);
                return response;
            }

            if (getEmployeeByIdCode(employee.getIdCode()) != null) {
                response.setApiError(new ApiErrorType("duplicate_employee",
                        "employee with id code " + employee.getIdCode() + " already exists, cannot add employee"));
            } else if (employee.getEmployer() == null) {
                unemployed.add(employee);
                response.setEmployee(employee);
            } else {
                Employer employer = getEmployer(employee);

                if (employer != null) {
                    employees.add(employee);
                    employer.getEmployees().getEmployee().add(employee);
                    response.setEmployee(employee);
                } else {
                    response.setApiError(new ApiErrorType("employer_not_found",
                            "employer with id " + employee.getEmployer() + " not found"));
                }
            }
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        addEmployeeOperations.put(parameter.getOperationId(), response);
        return response;
    }

    public EmployerResponseType addEmployer(AddEmployerRequestType parameter) {
        EmployerResponseType response = new EmployerResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (addEmployerOperations.containsKey(operationId)) {
                return addEmployerOperations.get(operationId);
            }

            NewEmployer newEmployer = parameter.getEmployer();
            if (newEmployer.getCompanyId() == null ||
                    newEmployer.getAddress() == null ||
                    newEmployer.getCompanyName() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                addEmployerOperations.put(operationId, response);
                return response;
            }

            if (getEmployerById(newEmployer.getCompanyId()) != null) {
                response.setApiError(new ApiErrorType("duplicate_employer",
                        "employer with id " + newEmployer.getCompanyId() + " already exists"));
                return response;
            }

            Employer employer = new Employer();

            employer.setCompanyId(newEmployer.getCompanyId());
            employer.setCompanyName(newEmployer.getCompanyName());
            employer.setAddress(newEmployer.getAddress());
            employer.setCountry(newEmployer.getCountry());
            employer.setEmployees(new EmployeesType());

            employers.add(employer);
            response.setEmployer(employer);
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        addEmployerOperations.put(operationId, response);
        return response;
    }

    public EmployeeResponseType getEmployeeByIdCode(EmployeeByIdCodeRequestType parameter) {
        EmployeeResponseType response = new EmployeeResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (getEmployeeOperations.containsKey(operationId)) {
                return getEmployeeOperations.get(operationId);
            }
            if (parameter.getIdCode() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                getEmployeeOperations.put(operationId, response);
                return response;
            }

            String idCode = parameter.getIdCode();
            Employee employee = getEmployeeByIdCode(idCode);

            if (employee != null) {
                response.setEmployee(employee);
            } else {
                response.setApiError(new ApiErrorType("employee_not_found",
                        "empoyee with id code " + idCode + " not found"));
            }
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        getEmployeeOperations.put(operationId, response);
        return response;
    }

    public EmployerResponseType getEmployerById(EmployerByIdRequestType parameter) {
        EmployerResponseType response = new EmployerResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (getEmployerOperations.containsKey(operationId)) {
                return getEmployerOperations.get(operationId);
            }

            if (parameter.getEmployerId() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                getEmployerOperations.put(operationId, response);
                return response;
            }

            String id = parameter.getEmployerId();
            Employer employer = getEmployerById(id);

            if (employer != null) {
                response.setEmployer(employer);
            } else {
                response.setApiError(new ApiErrorType("employer_not_found",
                        "employer with id " + id + " not found"));
            }
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        getEmployerOperations.put(operationId, response);
        return response;
    }

    public EmployeesResponseType getAllEmployees(EmployeesRequestType parameter) {
        EmployeesResponseType response = new EmployeesResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (getEmployeesOperations.containsKey(operationId)) {
                return getEmployeesOperations.get(operationId);
            }

            response.setEmployees(new EmployeesType());
            response.getEmployees().getEmployee().addAll(employees);
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        getEmployeesOperations.put(operationId, response);
        return response;
    }

    public EmployersResponseType getAllEmployers(EmployersRequestType parameter) {
        EmployersResponseType response = new EmployersResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (getEmployersOperations.containsKey(operationId)) {
                getEmployersOperations.get(operationId);
            }

            response.setEmployers(new EmployersResponseData());
            response.getEmployers().getEmployer().addAll(employers);
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        getEmployersOperations.put(operationId, response);
        return response;
    }

    public EmployeesResponseType findEmployees(FindEmployeesRequestType parameter) {
        EmployeesResponseType response = new EmployeesResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }

            if (findEmployeesOperations.containsKey(operationId)) {
                return findEmployeesOperations.get(operationId);
            }

            if (parameter.getAge() == 0 ||
                    parameter.getHairColor() == null ||
                    parameter.getName() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                findEmployeesOperations.put(operationId, response);
                return response;
            }

            int age = parameter.getAge();
            if (age < 1 || age > 150) {
                response.setApiError(new ApiErrorType("validation_error",
                        "age " + age + " is not a valid age for an employee"));
            }

            List<Employee> filterEmployees = new ArrayList<>();

            for (Employee employee : employees) {
                if (employee.getName().equals(parameter.getName()) &&
                        employee.getAge() == parameter.getAge() &&
                        employee.getHairColor().equals(parameter.getHairColor()) &&
                        (parameter.getEyeColor() == null || parameter.getEyeColor().equals(employee.getEyeColor()))) {
                    filterEmployees.add(employee);
                }
            }

            response.setEmployees(new EmployeesType());
            response.getEmployees().getEmployee().addAll(filterEmployees);
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        findEmployeesOperations.put(operationId, response);
        return response;
    }

    public EmployeesResponseType getEmployeesAtEmployer(EmployeesAtEmployerRequestType parameter) {
        EmployeesResponseType response = new EmployeesResponseType();
        String operationId = parameter.getOperationId();

        if (TOKEN.equals(parameter.getToken())) {
            if (operationId == null) {
                response.setApiError(MISSING_DATA_ERROR);
                return response;
            }
            if (getEmployeesAtEmployerOperations.containsKey(operationId)) {
                return getEmployeesAtEmployerOperations.get(operationId);
            }

            if (parameter.getEmployerId() == null) {
                response.setApiError(MISSING_DATA_ERROR);
                getEmployeesAtEmployerOperations.put(operationId, response);
                return response;
            }
            Employer employer = getEmployerById(parameter.getEmployerId());

            if (employer != null) {
                response.setEmployees(employer.getEmployees());
            } else {
                response.setApiError(new ApiErrorType("employer_not_found",
                        "employer with id " + parameter.getEmployerId() + " not found"));
            }
        } else {
            response.setApiError(INCORRECT_TOKEN_ERROR);
            return response;
        }

        getEmployeesAtEmployerOperations.put(operationId, response);
        return response;
    }

    private Employer getEmployer(Employee employee) {
        for (Employer employer : employers) {
            if (Objects.equals(employee.getEmployer(), employer.getCompanyId())) {
                return employer;
            }
        }
        return null;
    }

    private Employee getEmployeeByIdCode(String idCode) {
        for (Employee employee : employees) {
            if (employee.getIdCode().equals(idCode)) {
                return employee;
            }
        }
        return null;
    }

    private Employer getEmployerById(String id) {
        for (Employer employer : employers) {
            if (employer.getCompanyId().equals(id)) {
                return employer;
            }
        }
        return null;
    }

    /* package */ void initializeTestData() {
        employers.addAll(Arrays.asList(
                makeEmployer("1", "first", "adsf", "qwe"),
                makeEmployer("ads", "second", "rgh", "dsv"),
                makeEmployer("123", "third", "ewqdrfg", "re"),
                makeEmployer("2", "fourth", "4trhg", "poidfsg"),
                makeEmployer(".", "fifth", "ogkstd", null)
        ));

        employees.addAll(Arrays.asList(
                makeEmployee("123", "hello", 1, "blue", "blonde", "1"),
                makeEmployee("1234", "hello", 1, "blue", "blonde", "1"),
                makeEmployee("12345", "hello", 1, "blue", "something else", "1"),
                makeEmployee("one", "one", 1, "one", "one", "ads"),
                makeEmployee("asd", "ret", 123, "", "", "."),
                makeEmployee("123123", "123", 111, "asd", "ads", ".")
        ));
    }

    private Employer makeEmployer(String companyId, String name, String address, String country) {
        Employer result = new Employer();

        result.setCompanyId(companyId);
        result.setCompanyName(name);
        result.setAddress(address);
        result.setCountry(country);
        result.setEmployees(new EmployeesType());

        return result;
    }

    private Employee makeEmployee(String idCode, String name, int age, String hairColor, String eyeColor, String employer) {
        Employee result = new Employee();

        result.setIdCode(idCode);
        result.setName(name);
        result.setAge(age);
        result.setHairColor(hairColor);
        result.setEyeColor(eyeColor);
        result.setEmployer(employer);

        Employer employerOptional = getEmployerById(employer);
        if (employerOptional != null) {
            employerOptional.getEmployees().getEmployee().add(result);
        } else {
            unemployed.add(result);
        }

        return result;
    }

    public static void main(String[] args) {
        Employers implementor = new Employers();
        implementor.initializeTestData();
        String address = "http://localhost:9000/Employers";
        Endpoint.publish(address, implementor);
    }
}
