
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlSchemaType;
import org.jinouts.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TQuote complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cityname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FloorPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FloorPriceCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurancePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicensePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guideprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BegindateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreateDateCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StateCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DingPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarDecoration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarGift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sellername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ddbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZongJia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QitaZafei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesFace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellerVipLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsUserPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TQuote", propOrder = {
    "quoteID",
    "sellerID",
    "carID",
    "carDetail",
    "cityname",
    "floorPrice",
    "floorPriceCN",
    "insurancePrice",
    "licensePrice",
    "purchaseTax",
    "prize",
    "guideprice",
    "beginDate",
    "begindateStr",
    "endDate",
    "effectiveTime",
    "createDate",
    "createDateCN",
    "state",
    "stateCN",
    "dingPrice",
    "registrationFee",
    "carDecoration",
    "carColor",
    "carGift",
    "carPlan",
    "payMode",
    "carAddress",
    "sellername",
    "brandName",
    "seriesName",
    "carName",
    "tel",
    "ddbh",
    "userID",
    "orderNumber",
    "zongJia",
    "qitaZafei",
    "carYear",
    "clientID",
    "clientType",
    "seriesFace",
    "sellerVipLevel",
    "carImage",
    "orderID",
    "isUserPay",
    "userName"
})
public class TQuote {

    @XmlElement(name = "QuoteID")
    protected int quoteID;
    @XmlElement(name = "SellerID")
    protected int sellerID;
    @XmlElement(name = "CarID")
    protected int carID;
    @XmlElement(name = "CarDetail")
    protected String carDetail;
    @XmlElement(name = "Cityname")
    protected String cityname;
    @XmlElement(name = "FloorPrice")
    protected String floorPrice;
    @XmlElement(name = "FloorPriceCN")
    protected String floorPriceCN;
    @XmlElement(name = "InsurancePrice")
    protected String insurancePrice;
    @XmlElement(name = "LicensePrice")
    protected String licensePrice;
    @XmlElement(name = "PurchaseTax")
    protected String purchaseTax;
    @XmlElement(name = "Prize")
    protected String prize;
    @XmlElement(name = "Guideprice")
    protected String guideprice;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "BegindateStr")
    protected String begindateStr;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EffectiveTime")
    protected String effectiveTime;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CreateDateCN")
    protected String createDateCN;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "StateCN")
    protected String stateCN;
    @XmlElement(name = "DingPrice")
    protected String dingPrice;
    @XmlElement(name = "RegistrationFee")
    protected String registrationFee;
    @XmlElement(name = "CarDecoration")
    protected String carDecoration;
    @XmlElement(name = "CarColor")
    protected String carColor;
    @XmlElement(name = "CarGift")
    protected String carGift;
    @XmlElement(name = "CarPlan")
    protected String carPlan;
    @XmlElement(name = "PayMode")
    protected String payMode;
    @XmlElement(name = "CarAddress")
    protected String carAddress;
    @XmlElement(name = "Sellername")
    protected String sellername;
    @XmlElement(name = "BrandName")
    protected String brandName;
    @XmlElement(name = "SeriesName")
    protected String seriesName;
    @XmlElement(name = "CarName")
    protected String carName;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Ddbh")
    protected String ddbh;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "ZongJia")
    protected String zongJia;
    @XmlElement(name = "QitaZafei")
    protected String qitaZafei;
    @XmlElement(name = "CarYear")
    protected String carYear;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClientType")
    protected String clientType;
    @XmlElement(name = "SeriesFace")
    protected String seriesFace;
    @XmlElement(name = "SellerVipLevel")
    protected int sellerVipLevel;
    @XmlElement(name = "CarImage")
    protected String carImage;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "IsUserPay")
    protected boolean isUserPay;
    @XmlElement(name = "UserName")
    protected String userName;

    /**
     * ��ȡquoteID���Ե�ֵ��
     * 
     */
    public int getQuoteID() {
        return quoteID;
    }

    /**
     * ����quoteID���Ե�ֵ��
     * 
     */
    public void setQuoteID(int value) {
        this.quoteID = value;
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
     * ��ȡfloorPriceCN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorPriceCN() {
        return floorPriceCN;
    }

    /**
     * ����floorPriceCN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorPriceCN(String value) {
        this.floorPriceCN = value;
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
     * ��ȡeffectiveTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * ����effectiveTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
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
     * ��ȡcreateDateCN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateCN() {
        return createDateCN;
    }

    /**
     * ����createDateCN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateCN(String value) {
        this.createDateCN = value;
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
     * ��ȡstateCN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCN() {
        return stateCN;
    }

    /**
     * ����stateCN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCN(String value) {
        this.stateCN = value;
    }

    /**
     * ��ȡdingPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDingPrice() {
        return dingPrice;
    }

    /**
     * ����dingPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDingPrice(String value) {
        this.dingPrice = value;
    }

    /**
     * ��ȡregistrationFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationFee() {
        return registrationFee;
    }

    /**
     * ����registrationFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationFee(String value) {
        this.registrationFee = value;
    }

    /**
     * ��ȡcarDecoration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarDecoration() {
        return carDecoration;
    }

    /**
     * ����carDecoration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarDecoration(String value) {
        this.carDecoration = value;
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
     * ��ȡcarGift���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarGift() {
        return carGift;
    }

    /**
     * ����carGift���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarGift(String value) {
        this.carGift = value;
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
     * ��ȡsellername���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellername() {
        return sellername;
    }

    /**
     * ����sellername���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellername(String value) {
        this.sellername = value;
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
     * ��ȡuserID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * ����userID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * ��ȡorderNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * ����orderNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * ��ȡzongJia���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZongJia() {
        return zongJia;
    }

    /**
     * ����zongJia���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZongJia(String value) {
        this.zongJia = value;
    }

    /**
     * ��ȡqitaZafei���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQitaZafei() {
        return qitaZafei;
    }

    /**
     * ����qitaZafei���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQitaZafei(String value) {
        this.qitaZafei = value;
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
     * ��ȡclientID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * ����clientID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * ��ȡclientType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * ����clientType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * ��ȡseriesFace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesFace() {
        return seriesFace;
    }

    /**
     * ����seriesFace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesFace(String value) {
        this.seriesFace = value;
    }

    /**
     * ��ȡsellerVipLevel���Ե�ֵ��
     * 
     */
    public int getSellerVipLevel() {
        return sellerVipLevel;
    }

    /**
     * ����sellerVipLevel���Ե�ֵ��
     * 
     */
    public void setSellerVipLevel(int value) {
        this.sellerVipLevel = value;
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
     * ��ȡorderID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * ��ȡisUserPay���Ե�ֵ��
     * 
     */
    public boolean isIsUserPay() {
        return isUserPay;
    }

    /**
     * ����isUserPay���Ե�ֵ��
     * 
     */
    public void setIsUserPay(boolean value) {
        this.isUserPay = value;
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

}
