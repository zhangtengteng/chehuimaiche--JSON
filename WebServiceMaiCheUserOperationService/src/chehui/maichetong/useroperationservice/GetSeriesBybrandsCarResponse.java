
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
 *         &lt;element name="GetSeriesBybrandsCarResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTCar" minOccurs="0"/&gt;
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
    "getSeriesBybrandsCarResult"
})
@XmlRootElement(name = "GetSeriesBybrandsCarResponse")
public class GetSeriesBybrandsCarResponse {

    @XmlElement(name = "GetSeriesBybrandsCarResult")
    protected ResultOfListOfTCar getSeriesBybrandsCarResult;

    /**
     * ��ȡgetSeriesBybrandsCarResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public ResultOfListOfTCar getGetSeriesBybrandsCarResult() {
        return getSeriesBybrandsCarResult;
    }

    /**
     * ����getSeriesBybrandsCarResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTCar }
     *     
     */
    public void setGetSeriesBybrandsCarResult(ResultOfListOfTCar value) {
        this.getSeriesBybrandsCarResult = value;
    }

}
