
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
 *         &lt;element name="GetSeriesByBrandidResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTSeries" minOccurs="0"/&gt;
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
    "getSeriesByBrandidResult"
})
@XmlRootElement(name = "GetSeriesByBrandidResponse")
public class GetSeriesByBrandidResponse {

    @XmlElement(name = "GetSeriesByBrandidResult")
    protected ResultOfListOfTSeries getSeriesByBrandidResult;

    /**
     * ��ȡgetSeriesByBrandidResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public ResultOfListOfTSeries getGetSeriesByBrandidResult() {
        return getSeriesByBrandidResult;
    }

    /**
     * ����getSeriesByBrandidResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTSeries }
     *     
     */
    public void setGetSeriesByBrandidResult(ResultOfListOfTSeries value) {
        this.getSeriesByBrandidResult = value;
    }

}
