
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
 *         &lt;element name="GetSeriesByMakeNameResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTSeries" minOccurs="0"/&gt;
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
    "getSeriesByMakeNameResult"
})
@XmlRootElement(name = "GetSeriesByMakeNameResponse")
public class GetSeriesByMakeNameResponse {

    @XmlElement(name = "GetSeriesByMakeNameResult")
    protected ResultOfListOfTSeries getSeriesByMakeNameResult;

    /**
     * ��ȡgetSeriesByMakeNameResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public ResultOfListOfTSeries getGetSeriesByMakeNameResult() {
        return getSeriesByMakeNameResult;
    }

    /**
     * ����getSeriesByMakeNameResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public void setGetSeriesByMakeNameResult(ResultOfListOfTSeries value) {
        this.getSeriesByMakeNameResult = value;
    }

}
