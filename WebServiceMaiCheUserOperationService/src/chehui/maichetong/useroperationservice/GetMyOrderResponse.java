
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
 *         &lt;element name="GetMyOrderResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTOrder" minOccurs="0"/&gt;
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
    "getMyOrderResult"
})
@XmlRootElement(name = "GetMyOrderResponse")
public class GetMyOrderResponse {

    @XmlElement(name = "GetMyOrderResult")
    protected ResultOfListOfTOrder getMyOrderResult;

    /**
     * ��ȡgetMyOrderResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTOrder }
     *     
     */
    public ResultOfListOfTOrder getGetMyOrderResult() {
        return getMyOrderResult;
    }

    /**
     * ����getMyOrderResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTOrder }
     *     
     */
    public void setGetMyOrderResult(ResultOfListOfTOrder value) {
        this.getMyOrderResult = value;
    }

}
