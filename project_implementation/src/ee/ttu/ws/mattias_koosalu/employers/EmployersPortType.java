
package ee.ttu.ws.mattias_koosalu.employers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "employersPortType", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployersPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployeeResponseType
     */
    @WebMethod
    @WebResult(name = "addEmployeeResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployeeResponseType addEmployee(
        @WebParam(name = "addEmployeeRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        AddEmployeeRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployerResponseType
     */
    @WebMethod
    @WebResult(name = "addEmployerResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployerResponseType addEmployer(
        @WebParam(name = "addEmployerRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        AddEmployerRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployeeResponseType
     */
    @WebMethod
    @WebResult(name = "getEmployeeByIdCodeResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployeeResponseType getEmployeeByIdCode(
        @WebParam(name = "getEmployeeByIdCodeRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        EmployeeByIdCodeRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployerResponseType
     */
    @WebMethod
    @WebResult(name = "getEmployerByIdResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployerResponseType getEmployerById(
        @WebParam(name = "getEmployerByIdRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        EmployerByIdRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployeesResponseType
     */
    @WebMethod
    @WebResult(name = "getAllEmployeesResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployeesResponseType getAllEmployees(
        @WebParam(name = "getAllEmployeesRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        EmployeesRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployersResponseType
     */
    @WebMethod
    @WebResult(name = "getAllEmployersResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployersResponseType getAllEmployers(
        @WebParam(name = "getAllEmployersRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        EmployersRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployeesResponseType
     */
    @WebMethod
    @WebResult(name = "findEmployeesResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployeesResponseType findEmployees(
        @WebParam(name = "findEmployeesRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        FindEmployeesRequestType parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.ws.mattias_koosalu.employers.EmployeesResponseType
     */
    @WebMethod
    @WebResult(name = "getEmployeesAtEmployerResponse", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
    public EmployeesResponseType getEmployeesAtEmployer(
        @WebParam(name = "getEmployeesAtEmployerRequest", targetNamespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", partName = "parameter")
        EmployeesAtEmployerRequestType parameter);

}
