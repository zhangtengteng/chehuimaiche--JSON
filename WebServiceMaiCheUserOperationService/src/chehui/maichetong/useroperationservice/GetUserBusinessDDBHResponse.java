
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
 *         &lt;element name="GetUserBusinessDDBHResult" type="{http://UserOperationService.maichetong.chehui/}ResultOfListOfTBusiness" minOccurs="0"/&gt;
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
    "getUserBusinessDDBHResult"
})
@XmlRootElement(name = "GetUserBusinessDDBHResponse")
public class GetUserBusinessDDBHResponse {

    @XmlElement(name = "GetUserBusinessDDBHResult")
    protected ResultOfListOfTBusiness getUserBusinessDDBHResult;

    /**
     * ��ȡgetUserBusinessDDBHResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfTBusiness }
     *     
     */
    public ResultOfListOfTBusiness getGetUserBusinessDDBHResult() {
        return getUserBusinessDDBHResult;
    }

    /**
     * ����getUserBusinessDDBHResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfTBusiness }
     *     
     */
    public void setGetUserBusinessDDBHResult(ResultOfListOfTBusiness value) {
        this.getUserBusinessDDBHResult = value;
    }

}
