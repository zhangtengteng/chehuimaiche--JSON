
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
 *         &lt;element name="GetallQueteByUserResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTQuote" minOccurs="0"/&gt;
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
    "getallQueteByUserResult"
})
@XmlRootElement(name = "GetallQueteByUserResponse")
public class GetallQueteByUserResponse {

    @XmlElement(name = "GetallQueteByUserResult")
    protected ResultOfListOfTQuote getallQueteByUserResult;

    /**
     * 获取getallQueteByUserResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTQuote }
     *     
     */
    public ResultOfListOfTQuote getGetallQueteByUserResult() {
        return getallQueteByUserResult;
    }

    /**
     * 设置getallQueteByUserResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTQuote }
     *     
     */
    public void setGetallQueteByUserResult(ResultOfListOfTQuote value) {
        this.getallQueteByUserResult = value;
    }

}
