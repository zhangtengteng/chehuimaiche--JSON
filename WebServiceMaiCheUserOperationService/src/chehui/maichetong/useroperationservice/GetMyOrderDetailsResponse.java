
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
 *         &lt;element name="GetMyOrderDetailsResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTOrder" minOccurs="0"/&gt;
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
    "getMyOrderDetailsResult"
})
@XmlRootElement(name = "GetMyOrderDetailsResponse")
public class GetMyOrderDetailsResponse {

    @XmlElement(name = "GetMyOrderDetailsResult")
    protected ResultOfListOfTOrder getMyOrderDetailsResult;

    /**
     * ��ȡgetMyOrderDetailsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTOrder }
     *     
     */
    public ResultOfListOfTOrder getGetMyOrderDetailsResult() {
        return getMyOrderDetailsResult;
    }

    /**
     * ����getMyOrderDetailsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTOrder }
     *     
     */
    public void setGetMyOrderDetailsResult(ResultOfListOfTOrder value) {
        this.getMyOrderDetailsResult = value;
    }

}
