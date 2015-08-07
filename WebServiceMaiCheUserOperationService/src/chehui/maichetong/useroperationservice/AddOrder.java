
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
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="carID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cityname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurancePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicensePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZhuangHuang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kehuqw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "userID",
    "carID",
    "cityname",
    "expectPrice",
    "insurancePrice",
    "licensePrice",
    "description",
    "carColor",
    "carPlan",
    "payMode",
    "carAddress",
    "zhuangHuang",
    "kehuqw"
})
@XmlRootElement(name = "AddOrder")
public class AddOrder {

    protected int userID;
    protected int carID;
    protected String cityname;
    @XmlElement(name = "ExpectPrice")
    protected String expectPrice;
    @XmlElement(name = "InsurancePrice")
    protected String insurancePrice;
    @XmlElement(name = "LicensePrice")
    protected String licensePrice;
    @XmlElement(name = "Description")
    protected String description;
    protected String carColor;
    @XmlElement(name = "CarPlan")
    protected String carPlan;
    @XmlElement(name = "PayMode")
    protected String payMode;
    @XmlElement(name = "CarAddress")
    protected String carAddress;
    @XmlElement(name = "ZhuangHuang")
    protected String zhuangHuang;
    protected String kehuqw;

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
     * ��ȡcarID���Ե�ֵ��
     * 
     */
    public int getCarID() {
        return carID;
    }

    /**
     * ����carID���Ե�ֵ��
     * 
     */
    public void setCarID(int value) {
        this.carID = value;
    }

    /**
     * ��ȡcityname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * ����cityname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityname(String value) {
        this.cityname = value;
    }

    /**
     * ��ȡexpectPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectPrice() {
        return expectPrice;
    }

    /**
     * ����expectPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectPrice(String value) {
        this.expectPrice = value;
    }

    /**
     * ��ȡinsurancePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePrice() {
        return insurancePrice;
    }

    /**
     * ����insurancePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePrice(String value) {
        this.insurancePrice = value;
    }

    /**
     * ��ȡlicensePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePrice() {
        return licensePrice;
    }

    /**
     * ����licensePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePrice(String value) {
        this.licensePrice = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡcarColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * ����carColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarColor(String value) {
        this.carColor = value;
    }

    /**
     * ��ȡcarPlan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPlan() {
        return carPlan;
    }

    /**
     * ����carPlan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPlan(String value) {
        this.carPlan = value;
    }

    /**
     * ��ȡpayMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * ����payMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * ��ȡcarAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAddress() {
        return carAddress;
    }

    /**
     * ����carAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAddress(String value) {
        this.carAddress = value;
    }

    /**
     * ��ȡzhuangHuang���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhuangHuang() {
        return zhuangHuang;
    }

    /**
     * ����zhuangHuang���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhuangHuang(String value) {
        this.zhuangHuang = value;
    }

    /**
     * ��ȡkehuqw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKehuqw() {
        return kehuqw;
    }

    /**
     * ����kehuqw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKehuqw(String value) {
        this.kehuqw = value;
    }

}
