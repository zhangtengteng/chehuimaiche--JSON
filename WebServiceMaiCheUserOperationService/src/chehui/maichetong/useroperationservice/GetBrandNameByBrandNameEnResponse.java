
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
 *         &lt;element name="GetBrandNameByBrandNameEnResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTBrand" minOccurs="0"/&gt;
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
    "getBrandNameByBrandNameEnResult"
})
@XmlRootElement(name = "GetBrandNameByBrandNameEnResponse")
public class GetBrandNameByBrandNameEnResponse {

    @XmlElement(name = "GetBrandNameByBrandNameEnResult")
    protected ResultOfListOfTBrand getBrandNameByBrandNameEnResult;

    /**
     * ��ȡgetBrandNameByBrandNameEnResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public ResultOfListOfTBrand getGetBrandNameByBrandNameEnResult() {
        return getBrandNameByBrandNameEnResult;
    }

    /**
     * ����getBrandNameByBrandNameEnResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public void setGetBrandNameByBrandNameEnResult(ResultOfListOfTBrand value) {
        this.getBrandNameByBrandNameEnResult = value;
    }

}
