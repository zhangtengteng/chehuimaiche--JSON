
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
 *         &lt;element name="GetCarByseriesIdResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTCar" minOccurs="0"/&gt;
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
    "getCarByseriesIdResult"
})
@XmlRootElement(name = "GetCarByseriesIdResponse")
public class GetCarByseriesIdResponse {

    @XmlElement(name = "GetCarByseriesIdResult")
    protected ResultOfListOfTCar getCarByseriesIdResult;

    /**
     * ��ȡgetCarByseriesIdResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public ResultOfListOfTCar getGetCarByseriesIdResult() {
        return getCarByseriesIdResult;
    }

    /**
     * ����getCarByseriesIdResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public void setGetCarByseriesIdResult(ResultOfListOfTCar value) {
        this.getCarByseriesIdResult = value;
    }

}
