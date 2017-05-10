
package ee.ttu.ws.mattias_koosalu.employers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.ws.mattias_koosalu.employers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEmployerResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "addEmployerResponse");
    private final static QName _GetEmployeesAtEmployerRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployeesAtEmployerRequest");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "addEmployeeResponse");
    private final static QName _GetAllEmployersResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getAllEmployersResponse");
    private final static QName _FindEmployeesResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "findEmployeesResponse");
    private final static QName _GetEmployeeByIdCodeRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployeeByIdCodeRequest");
    private final static QName _GetAllEmployersRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getAllEmployersRequest");
    private final static QName _FindEmployeesRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "findEmployeesRequest");
    private final static QName _GetEmployeesAtEmployerResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployeesAtEmployerResponse");
    private final static QName _GetEmployerByIdResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployerByIdResponse");
    private final static QName _GetEmployeeByIdCodeResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployeeByIdCodeResponse");
    private final static QName _GetEmployerByIdRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getEmployerByIdRequest");
    private final static QName _AddEmployeeRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "addEmployeeRequest");
    private final static QName _GetAllEmployeesRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getAllEmployeesRequest");
    private final static QName _AddEmployerRequest_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "addEmployerRequest");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", "getAllEmployeesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.ws.mattias_koosalu.employers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeByIdCodeRequestType }
     * 
     */
    public EmployeeByIdCodeRequestType createEmployeeByIdCodeRequestType() {
        return new EmployeeByIdCodeRequestType();
    }

    /**
     * Create an instance of {@link EmployersRequestType }
     * 
     */
    public EmployersRequestType createEmployersRequestType() {
        return new EmployersRequestType();
    }

    /**
     * Create an instance of {@link EmployerResponseType }
     * 
     */
    public EmployerResponseType createEmployerResponseType() {
        return new EmployerResponseType();
    }

    /**
     * Create an instance of {@link EmployeesAtEmployerRequestType }
     * 
     */
    public EmployeesAtEmployerRequestType createEmployeesAtEmployerRequestType() {
        return new EmployeesAtEmployerRequestType();
    }

    /**
     * Create an instance of {@link EmployeeResponseType }
     * 
     */
    public EmployeeResponseType createEmployeeResponseType() {
        return new EmployeeResponseType();
    }

    /**
     * Create an instance of {@link EmployersResponseType }
     * 
     */
    public EmployersResponseType createEmployersResponseType() {
        return new EmployersResponseType();
    }

    /**
     * Create an instance of {@link EmployeesResponseType }
     * 
     */
    public EmployeesResponseType createEmployeesResponseType() {
        return new EmployeesResponseType();
    }

    /**
     * Create an instance of {@link AddEmployeeRequestType }
     * 
     */
    public AddEmployeeRequestType createAddEmployeeRequestType() {
        return new AddEmployeeRequestType();
    }

    /**
     * Create an instance of {@link EmployeesRequestType }
     * 
     */
    public EmployeesRequestType createEmployeesRequestType() {
        return new EmployeesRequestType();
    }

    /**
     * Create an instance of {@link AddEmployerRequestType }
     * 
     */
    public AddEmployerRequestType createAddEmployerRequestType() {
        return new AddEmployerRequestType();
    }

    /**
     * Create an instance of {@link FindEmployeesRequestType }
     * 
     */
    public FindEmployeesRequestType createFindEmployeesRequestType() {
        return new FindEmployeesRequestType();
    }

    /**
     * Create an instance of {@link EmployerByIdRequestType }
     * 
     */
    public EmployerByIdRequestType createEmployerByIdRequestType() {
        return new EmployerByIdRequestType();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link EmployersResponseData }
     * 
     */
    public EmployersResponseData createEmployersResponseData() {
        return new EmployersResponseData();
    }

    /**
     * Create an instance of {@link NewEmployer }
     * 
     */
    public NewEmployer createNewEmployer() {
        return new NewEmployer();
    }

    /**
     * Create an instance of {@link Employer }
     * 
     */
    public Employer createEmployer() {
        return new Employer();
    }

    /**
     * Create an instance of {@link ApiErrorType }
     * 
     */
    public ApiErrorType createApiErrorType() {
        return new ApiErrorType();
    }

    /**
     * Create an instance of {@link EmployeesType }
     * 
     */
    public EmployeesType createEmployeesType() {
        return new EmployeesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "addEmployerResponse")
    public JAXBElement<EmployerResponseType> createAddEmployerResponse(EmployerResponseType value) {
        return new JAXBElement<EmployerResponseType>(_AddEmployerResponse_QNAME, EmployerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesAtEmployerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployeesAtEmployerRequest")
    public JAXBElement<EmployeesAtEmployerRequestType> createGetEmployeesAtEmployerRequest(EmployeesAtEmployerRequestType value) {
        return new JAXBElement<EmployeesAtEmployerRequestType>(_GetEmployeesAtEmployerRequest_QNAME, EmployeesAtEmployerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "addEmployeeResponse")
    public JAXBElement<EmployeeResponseType> createAddEmployeeResponse(EmployeeResponseType value) {
        return new JAXBElement<EmployeeResponseType>(_AddEmployeeResponse_QNAME, EmployeeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getAllEmployersResponse")
    public JAXBElement<EmployersResponseType> createGetAllEmployersResponse(EmployersResponseType value) {
        return new JAXBElement<EmployersResponseType>(_GetAllEmployersResponse_QNAME, EmployersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "findEmployeesResponse")
    public JAXBElement<EmployeesResponseType> createFindEmployeesResponse(EmployeesResponseType value) {
        return new JAXBElement<EmployeesResponseType>(_FindEmployeesResponse_QNAME, EmployeesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeByIdCodeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployeeByIdCodeRequest")
    public JAXBElement<EmployeeByIdCodeRequestType> createGetEmployeeByIdCodeRequest(EmployeeByIdCodeRequestType value) {
        return new JAXBElement<EmployeeByIdCodeRequestType>(_GetEmployeeByIdCodeRequest_QNAME, EmployeeByIdCodeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getAllEmployersRequest")
    public JAXBElement<EmployersRequestType> createGetAllEmployersRequest(EmployersRequestType value) {
        return new JAXBElement<EmployersRequestType>(_GetAllEmployersRequest_QNAME, EmployersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "findEmployeesRequest")
    public JAXBElement<FindEmployeesRequestType> createFindEmployeesRequest(FindEmployeesRequestType value) {
        return new JAXBElement<FindEmployeesRequestType>(_FindEmployeesRequest_QNAME, FindEmployeesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployeesAtEmployerResponse")
    public JAXBElement<EmployeesResponseType> createGetEmployeesAtEmployerResponse(EmployeesResponseType value) {
        return new JAXBElement<EmployeesResponseType>(_GetEmployeesAtEmployerResponse_QNAME, EmployeesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployerByIdResponse")
    public JAXBElement<EmployerResponseType> createGetEmployerByIdResponse(EmployerResponseType value) {
        return new JAXBElement<EmployerResponseType>(_GetEmployerByIdResponse_QNAME, EmployerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployeeByIdCodeResponse")
    public JAXBElement<EmployeeResponseType> createGetEmployeeByIdCodeResponse(EmployeeResponseType value) {
        return new JAXBElement<EmployeeResponseType>(_GetEmployeeByIdCodeResponse_QNAME, EmployeeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerByIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getEmployerByIdRequest")
    public JAXBElement<EmployerByIdRequestType> createGetEmployerByIdRequest(EmployerByIdRequestType value) {
        return new JAXBElement<EmployerByIdRequestType>(_GetEmployerByIdRequest_QNAME, EmployerByIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "addEmployeeRequest")
    public JAXBElement<AddEmployeeRequestType> createAddEmployeeRequest(AddEmployeeRequestType value) {
        return new JAXBElement<AddEmployeeRequestType>(_AddEmployeeRequest_QNAME, AddEmployeeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getAllEmployeesRequest")
    public JAXBElement<EmployeesRequestType> createGetAllEmployeesRequest(EmployeesRequestType value) {
        return new JAXBElement<EmployeesRequestType>(_GetAllEmployeesRequest_QNAME, EmployeesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "addEmployerRequest")
    public JAXBElement<AddEmployerRequestType> createAddEmployerRequest(AddEmployerRequestType value) {
        return new JAXBElement<AddEmployerRequestType>(_AddEmployerRequest_QNAME, AddEmployerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB", name = "getAllEmployeesResponse")
    public JAXBElement<EmployeesResponseType> createGetAllEmployeesResponse(EmployeesResponseType value) {
        return new JAXBElement<EmployeesResponseType>(_GetAllEmployeesResponse_QNAME, EmployeesResponseType.class, null, value);
    }

}
