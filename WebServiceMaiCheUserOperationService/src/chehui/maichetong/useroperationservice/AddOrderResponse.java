
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
 *         &lt;element name="AddOrderResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfTOrder" minOccurs="0"/&gt;
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
    "addOrderResult"
})
@XmlRootElement(name = "AddOrderResponse")
public class AddOrderResponse {

    @XmlElement(name = "AddOrderResult")
    protected ResultOfTOrder addOrderResult;

    /**
     * ��ȡaddOrderResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfTOrder }
     *     
     */
    public ResultOfTOrder getAddOrderResult() {
        return addOrderResult;
    }

    /**
     * ����addOrderResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfTOrder }
     *     
     */
    public void setAddOrderResult(ResultOfTOrder value) {
        this.addOrderResult = value;
    }

}
