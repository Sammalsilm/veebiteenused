
package ee.ttu.ws.mattias_koosalu.employers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="apiError" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}apiErrorType"/>
 *         &lt;element name="employee" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}employee"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeResponseType", propOrder = {
    "apiError",
    "employee"
})
public class EmployeeResponseType {

    protected ApiErrorType apiError;
    protected Employee employee;

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
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

}
