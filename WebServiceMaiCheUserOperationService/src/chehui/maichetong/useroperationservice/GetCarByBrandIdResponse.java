
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlRootElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCarByBrandIdResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTSeries" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCarByBrandIdResult"
})
@XmlRootElement(name = "GetCarByBrandIdResponse")
public class GetCarByBrandIdResponse {

    @XmlElement(name = "GetCarByBrandIdResult")
    protected ResultOfListOfTSeries getCarByBrandIdResult;

    /**
     * 获取getCarByBrandIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public ResultOfListOfTSeries getGetCarByBrandIdResult() {
        return getCarByBrandIdResult;
    }

    /**
     * 设置getCarByBrandIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public void setGetCarByBrandIdResult(ResultOfListOfTSeries value) {
        this.getCarByBrandIdResult = value;
    }

}
