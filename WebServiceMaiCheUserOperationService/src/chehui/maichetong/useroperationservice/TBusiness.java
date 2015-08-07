
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlSchemaType;
import org.jinouts.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TBusiness complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TBusiness"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QueteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBusiness", propOrder = {
    "id",
    "businessID",
    "userID",
    "queteID",
    "state",
    "createDate",
    "sellerID",
    "returnMoney"
})
public class TBusiness {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "BusinessID")
    protected String businessID;
    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "QueteID")
    protected int queteID;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "SellerID")
    protected int sellerID;
    @XmlElement(name = "ReturnMoney")
    protected String returnMoney;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡbusinessID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessID() {
        return businessID;
    }

    /**
     * ����businessID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessID(String value) {
        this.businessID = value;
    }

    /**
     * ��ȡuserID���Ե�ֵ��
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * ����userID���Ե�ֵ��
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * ��ȡqueteID���Ե�ֵ��
     * 
     */
    public int getQueteID() {
        return queteID;
    }

    /**
     * ����queteID���Ե�ֵ��
     * 
     */
    public void setQueteID(int value) {
        this.queteID = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * ��ȡcreateDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * ����createDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * ��ȡsellerID���Ե�ֵ��
     * 
     */
    public int getSellerID() {
        return sellerID;
    }

    /**
     * ����sellerID���Ե�ֵ��
     * 
     */
    public void setSellerID(int value) {
        this.sellerID = value;
    }

    /**
     * ��ȡreturnMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMoney() {
        return returnMoney;
    }

    /**
     * ����returnMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMoney(String value) {
        this.returnMoney = value;
    }

}
