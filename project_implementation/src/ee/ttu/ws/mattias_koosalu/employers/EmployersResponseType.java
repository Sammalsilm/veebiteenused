
package ee.ttu.ws.mattias_koosalu.employers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employersResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="apiError" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}apiErrorType"/>
 *         &lt;element name="employers" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}employersResponseData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employersResponseType", propOrder = {
    "apiError",
    "employers"
})
public class EmployersResponseType {

    protected ApiErrorType apiError;
    protected EmployersResponseData employers;

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
     * Gets the value of the employers property.
     * 
     * @return
     *     possible object is
     *     {@link EmployersResponseData }
     *     
     */
    public EmployersResponseData getEmployers() {
        return employers;
    }

    /**
     * Sets the value of the employers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployersResponseData }
     *     
     */
    public void setEmployers(EmployersResponseData value) {
        this.employers = value;
    }

}
