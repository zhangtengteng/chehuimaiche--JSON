
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
 *         &lt;element name="GetOrderCarNameResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTCar" minOccurs="0"/&gt;
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
    "getOrderCarNameResult"
})
@XmlRootElement(name = "GetOrderCarNameResponse")
public class GetOrderCarNameResponse {

    @XmlElement(name = "GetOrderCarNameResult")
    protected ResultOfListOfTCar getOrderCarNameResult;

    /**
     * ��ȡgetOrderCarNameResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public ResultOfListOfTCar getGetOrderCarNameResult() {
        return getOrderCarNameResult;
    }

    /**
     * ����getOrderCarNameResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public void setGetOrderCarNameResult(ResultOfListOfTCar value) {
        this.getOrderCarNameResult = value;
    }

}
