
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>ResultOfListOfTCar complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResultOfListOfTCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://UserOperationService.maichetong.chehui/}ArrayOfTCar" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfListOfTCar", propOrder = {
    "success",
    "mess",
    "data"
})
public class ResultOfListOfTCar {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "Mess")
    protected String mess;
    @XmlElement(name = "Data")
    protected ArrayOfTCar data;

    /**
     * ��ȡsuccess���Ե�ֵ��
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * ����success���Ե�ֵ��
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * ��ȡmess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMess() {
        return mess;
    }

    /**
     * ����mess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMess(String value) {
        this.mess = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTCar }
     *     
     */
    public ArrayOfTCar getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTCar }
     *     
     */
    public void setData(ArrayOfTCar value) {
        this.data = value;
    }

}
