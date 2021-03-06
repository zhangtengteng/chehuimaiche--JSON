
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>ResultOfListOfTBusiness complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResultOfListOfTBusiness"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://UserOperationService.maichetong.chehui/}ArrayOfTBusiness" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfListOfTBusiness", propOrder = {
    "success",
    "mess",
    "data"
})
public class ResultOfListOfTBusiness {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "Mess")
    protected String mess;
    @XmlElement(name = "Data")
    protected ArrayOfTBusiness data;

    /**
     * 获取success属性的值。
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * 获取mess属性的值。
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
     * 设置mess属性的值。
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
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTBusiness }
     *     
     */
    public ArrayOfTBusiness getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTBusiness }
     *     
     */
    public void setData(ArrayOfTBusiness value) {
        this.data = value;
    }

}
