
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlSchemaType;
import org.jinouts.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DJPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cityname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ddbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurancePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guideprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicensePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PurchaseTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FloorPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BegindateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CarPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZhuangHuang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kehuqw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBaojia" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoBaojiaNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOrder", propOrder = {
    "orderID",
    "userID",
    "djPrice",
    "tel",
    "userName",
    "brandName",
    "seriesName",
    "carName",
    "carID",
    "cityname",
    "expectPrice",
    "ddbh",
    "insurancePrice",
    "name",
    "guideprice",
    "licensePrice",
    "description",
    "state",
    "purchaseTax",
    "carDetail",
    "floorPrice",
    "prize",
    "beginDate",
    "begindateStr",
    "endDate",
    "createDate",
    "carPlan",
    "payMode",
    "carColor",
    "carAddress",
    "zhuangHuang",
    "carImage",
    "kehuqw",
    "carYear",
    "isBaojia",
    "noBaojiaNum"
})
public class TOrder {

    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "DJPrice")
    protected String djPrice;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "BrandName")
    protected String brandName;
    @XmlElement(name = "SeriesName")
    protected String seriesName;
    @XmlElement(name = "CarName")
    protected String carName;
    @XmlElement(name = "CarID")
    protected int carID;
    @XmlElement(name = "Cityname")
    protected String cityname;
    @XmlElement(name = "ExpectPrice")
    protected String expectPrice;
    @XmlElement(name = "Ddbh")
    protected String ddbh;
    @XmlElement(name = "InsurancePrice")
    protected String insurancePrice;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Guideprice")
    protected String guideprice;
    @XmlElement(name = "LicensePrice")
    protected String licensePrice;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "PurchaseTax")
    protected String purchaseTax;
    @XmlElement(name = "CarDetail")
    protected String carDetail;
    @XmlElement(name = "FloorPrice")
    protected String floorPrice;
    @XmlElement(name = "Prize")
    protected String prize;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "BegindateStr")
    protected String begindateStr;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CarPlan")
    protected String carPlan;
    @XmlElement(name = "PayMode")
    protected String payMode;
    @XmlElement(name = "CarColor")
    protected String carColor;
    @XmlElement(name = "CarAddress")
    protected String carAddress;
    @XmlElement(name = "ZhuangHuang")
    protected String zhuangHuang;
    @XmlElement(name = "CarImage")
    protected String carImage;
    protected String kehuqw;
    @XmlElement(name = "CarYear")
    protected String carYear;
    @XmlElement(name = "IsBaojia")
    protected boolean isBaojia;
    @XmlElement(name = "NoBaojiaNum")
    protected int noBaojiaNum;

    /**
     * 获取orderID属性的值。
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * 获取userID属性的值。
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * 获取djPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDJPrice() {
        return djPrice;
    }

    /**
     * 设置djPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDJPrice(String value) {
        this.djPrice = value;
    }

    /**
     * 获取tel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置tel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取brandName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置brandName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * 获取seriesName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * 设置seriesName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * 获取carName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 设置carName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarName(String value) {
        this.carName = value;
    }

    /**
     * 获取carID属性的值。
     * 
     */
    public int getCarID() {
        return carID;
    }

    /**
     * 设置carID属性的值。
     * 
     */
    public void setCarID(int value) {
        this.carID = value;
    }

    /**
     * 获取cityname属性的值。
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
     * 设置cityname属性的值。
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
     * 获取expectPrice属性的值。
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
     * 设置expectPrice属性的值。
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
     * 获取ddbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdbh() {
        return ddbh;
    }

    /**
     * 设置ddbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdbh(String value) {
        this.ddbh = value;
    }

    /**
     * 获取insurancePrice属性的值。
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
     * 设置insurancePrice属性的值。
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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取guideprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuideprice() {
        return guideprice;
    }

    /**
     * 设置guideprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuideprice(String value) {
        this.guideprice = value;
    }

    /**
     * 获取licensePrice属性的值。
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
     * 设置licensePrice属性的值。
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
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取state属性的值。
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * 获取purchaseTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseTax() {
        return purchaseTax;
    }

    /**
     * 设置purchaseTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseTax(String value) {
        this.purchaseTax = value;
    }

    /**
     * 获取carDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarDetail() {
        return carDetail;
    }

    /**
     * 设置carDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarDetail(String value) {
        this.carDetail = value;
    }

    /**
     * 获取floorPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorPrice() {
        return floorPrice;
    }

    /**
     * 设置floorPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorPrice(String value) {
        this.floorPrice = value;
    }

    /**
     * 获取prize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrize() {
        return prize;
    }

    /**
     * 设置prize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrize(String value) {
        this.prize = value;
    }

    /**
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * 获取begindateStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegindateStr() {
        return begindateStr;
    }

    /**
     * 设置begindateStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegindateStr(String value) {
        this.begindateStr = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取createDate属性的值。
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
     * 设置createDate属性的值。
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
     * 获取carPlan属性的值。
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
     * 设置carPlan属性的值。
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
     * 获取payMode属性的值。
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
     * 设置payMode属性的值。
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
     * 获取carColor属性的值。
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
     * 设置carColor属性的值。
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
     * 获取carAddress属性的值。
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
     * 设置carAddress属性的值。
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
     * 获取zhuangHuang属性的值。
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
     * 设置zhuangHuang属性的值。
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
     * 获取carImage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarImage() {
        return carImage;
    }

    /**
     * 设置carImage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarImage(String value) {
        this.carImage = value;
    }

    /**
     * 获取kehuqw属性的值。
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
     * 设置kehuqw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKehuqw(String value) {
        this.kehuqw = value;
    }

    /**
     * 获取carYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarYear() {
        return carYear;
    }

    /**
     * 设置carYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarYear(String value) {
        this.carYear = value;
    }

    /**
     * 获取isBaojia属性的值。
     * 
     */
    public boolean isIsBaojia() {
        return isBaojia;
    }

    /**
     * 设置isBaojia属性的值。
     * 
     */
    public void setIsBaojia(boolean value) {
        this.isBaojia = value;
    }

    /**
     * 获取noBaojiaNum属性的值。
     * 
     */
    public int getNoBaojiaNum() {
        return noBaojiaNum;
    }

    /**
     * 设置noBaojiaNum属性的值。
     * 
     */
    public void setNoBaojiaNum(int value) {
        this.noBaojiaNum = value;
    }

}
