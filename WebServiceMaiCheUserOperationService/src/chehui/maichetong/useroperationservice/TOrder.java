
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlSchemaType;
import org.jinouts.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TOrder complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorderID���Ե�ֵ��
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
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
     * ��ȡdjPrice���Ե�ֵ��
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
     * ����djPrice���Ե�ֵ��
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
     * ��ȡtel���Ե�ֵ��
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
     * ����tel���Ե�ֵ��
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
     * ��ȡuserName���Ե�ֵ��
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
     * ����userName���Ե�ֵ��
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
     * ��ȡbrandName���Ե�ֵ��
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
     * ����brandName���Ե�ֵ��
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
     * ��ȡseriesName���Ե�ֵ��
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
     * ����seriesName���Ե�ֵ��
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
     * ��ȡcarName���Ե�ֵ��
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
     * ����carName���Ե�ֵ��
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
     * ��ȡddbh���Ե�ֵ��
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
     * ����ddbh���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡguideprice���Ե�ֵ��
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
     * ����guideprice���Ե�ֵ��
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
     * ��ȡpurchaseTax���Ե�ֵ��
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
     * ����purchaseTax���Ե�ֵ��
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
     * ��ȡcarDetail���Ե�ֵ��
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
     * ����carDetail���Ե�ֵ��
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
     * ��ȡfloorPrice���Ե�ֵ��
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
     * ����floorPrice���Ե�ֵ��
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
     * ��ȡprize���Ե�ֵ��
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
     * ����prize���Ե�ֵ��
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
     * ��ȡbeginDate���Ե�ֵ��
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
     * ����beginDate���Ե�ֵ��
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
     * ��ȡbegindateStr���Ե�ֵ��
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
     * ����begindateStr���Ե�ֵ��
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
     * ��ȡendDate���Ե�ֵ��
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
     * ����endDate���Ե�ֵ��
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
     * ��ȡcarImage���Ե�ֵ��
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
     * ����carImage���Ե�ֵ��
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

    /**
     * ��ȡcarYear���Ե�ֵ��
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
     * ����carYear���Ե�ֵ��
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
     * ��ȡisBaojia���Ե�ֵ��
     * 
     */
    public boolean isIsBaojia() {
        return isBaojia;
    }

    /**
     * ����isBaojia���Ե�ֵ��
     * 
     */
    public void setIsBaojia(boolean value) {
        this.isBaojia = value;
    }

    /**
     * ��ȡnoBaojiaNum���Ե�ֵ��
     * 
     */
    public int getNoBaojiaNum() {
        return noBaojiaNum;
    }

    /**
     * ����noBaojiaNum���Ե�ֵ��
     * 
     */
    public void setNoBaojiaNum(int value) {
        this.noBaojiaNum = value;
    }

}
