
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
 *         &lt;element name="GetQueteByCarIDResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTQuote" minOccurs="0"/&gt;
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
    "getQueteByCarIDResult"
})
@XmlRootElement(name = "GetQueteByCarIDResponse")
public class GetQueteByCarIDResponse {

    @XmlElement(name = "GetQueteByCarIDResult")
    protected ResultOfListOfTQuote getQueteByCarIDResult;

    /**
     * ��ȡgetQueteByCarIDResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTQuote }
     *     
     */
    public ResultOfListOfTQuote getGetQueteByCarIDResult() {
        return getQueteByCarIDResult;
    }

    /**
     * ����getQueteByCarIDResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTQuote }
     *     
     */
    public void setGetQueteByCarIDResult(ResultOfListOfTQuote value) {
        this.getQueteByCarIDResult = value;
    }

}
