
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlRootElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetUserTelResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTUSER" minOccurs="0"/&gt;
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
    "getUserTelResult"
})
@XmlRootElement(name = "GetUserTelResponse")
public class GetUserTelResponse {

    @XmlElement(name = "GetUserTelResult")
    protected ResultOfListOfTUSER getUserTelResult;

    /**
     * ��ȡgetUserTelResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTUSER }
     *     
     */
    public ResultOfListOfTUSER getGetUserTelResult() {
        return getUserTelResult;
    }

    /**
     * ����getUserTelResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTUSER }
     *     
     */
    public void setGetUserTelResult(ResultOfListOfTUSER value) {
        this.getUserTelResult = value;
    }

}
