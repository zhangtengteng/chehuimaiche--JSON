
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
 *         &lt;element name="GetBrandABCResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTBrand" minOccurs="0"/&gt;
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
    "getBrandABCResult"
})
@XmlRootElement(name = "GetBrandABCResponse")
public class GetBrandABCResponse {

    @XmlElement(name = "GetBrandABCResult")
    protected ResultOfListOfTBrand getBrandABCResult;

    /**
     * ��ȡgetBrandABCResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public ResultOfListOfTBrand getGetBrandABCResult() {
        return getBrandABCResult;
    }

    /**
     * ����getBrandABCResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTBrand }
     *     
     */
    public void setGetBrandABCResult(ResultOfListOfTBrand value) {
        this.getBrandABCResult = value;
    }

}
