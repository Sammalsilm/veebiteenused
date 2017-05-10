
package ee.ttu.ws.mattias_koosalu.employers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="apiError" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}apiErrorType"/>
 *         &lt;element name="employees" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}employeesType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeesResponseType", propOrder = {
    "apiError",
    "employees"
})
public class EmployeesResponseType {

    protected ApiErrorType apiError;
    protected EmployeesType employees;

    /**
     * Gets the value of the apiError property.
     * 
     * @return
     *     possible object is
     *     {@link ApiErrorType }
     *     
     */
    public ApiErrorType getApiError() {
        return apiError;
    }

    /**
     * Sets the value of the apiError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiErrorType }
     *     
     */
    public void setApiError(ApiErrorType value) {
        this.apiError = value;
    }

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeesType }
     *     
     */
    public EmployeesType getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeesType }
     *     
     */
    public void setEmployees(EmployeesType value) {
        this.employees = value;
    }

}
