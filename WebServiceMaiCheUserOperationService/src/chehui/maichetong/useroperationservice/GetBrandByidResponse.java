
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
 *         &lt;element name="GetBrandByidResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTBrand" minOccurs="0"/&gt;
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
    "getBrandByidResult"
})
@XmlRootElement(name = "GetBrandByidResponse")
public class GetBrandByidResponse {

    @XmlElement(name = "GetBrandByidResult")
    protected ResultOfListOfTBrand getBrandByidResult;

    /**
     * ��ȡgetBrandByidResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public ResultOfListOfTBrand getGetBrandByidResult() {
        return getBrandByidResult;
    }

    /**
     * ����getBrandByidResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public void setGetBrandByidResult(ResultOfListOfTBrand value) {
        this.getBrandByidResult = value;
    }

}
