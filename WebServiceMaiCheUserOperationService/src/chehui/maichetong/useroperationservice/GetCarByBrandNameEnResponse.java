
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
 *         &lt;element name="GetCarByBrandNameEnResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTSeries" minOccurs="0"/&gt;
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
    "getCarByBrandNameEnResult"
})
@XmlRootElement(name = "GetCarByBrandNameEnResponse")
public class GetCarByBrandNameEnResponse {

    @XmlElement(name = "GetCarByBrandNameEnResult")
    protected ResultOfListOfTSeries getCarByBrandNameEnResult;

    /**
     * 获取getCarByBrandNameEnResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public ResultOfListOfTSeries getGetCarByBrandNameEnResult() {
        return getCarByBrandNameEnResult;
    }

    /**
     * 设置getCarByBrandNameEnResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public void setGetCarByBrandNameEnResult(ResultOfListOfTSeries value) {
        this.getCarByBrandNameEnResult = value;
    }

}
