
package ee.ttu.ws.mattias_koosalu.employers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="apiError" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}apiErrorType"/>
 *         &lt;element name="employer" type="{http://www.ttu.ee/vt_projekt/mattias_koosalu/134911IAPB}employer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employerResponseType", propOrder = {
    "apiError",
    "employer"
})
public class EmployerResponseType {

    protected ApiErrorType apiError;
    protected Employer employer;

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
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link Employer }
     *     
     */
    public Employer getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employer }
     *     
     */
    public void setEmployer(Employer value) {
        this.employer = value;
    }

}
