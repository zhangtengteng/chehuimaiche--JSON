
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>TCar complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SeriesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Guideprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarPaiLiang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarMinGuideprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarMaxGuideprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCar", propOrder = {
    "carID",
    "seriesID",
    "carYear",
    "carName",
    "state",
    "guideprice",
    "seriesName",
    "brandName",
    "carImage",
    "carPaiLiang",
    "carMinGuideprice",
    "carMaxGuideprice",
    "quateNum"
})
public class TCar {

    @XmlElement(name = "CarID")
    protected int carID;
    @XmlElement(name = "SeriesID")
    protected String seriesID;
    @XmlElement(name = "CarYear")
    protected String carYear;
    @XmlElement(name = "CarName")
    protected String carName;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "Guideprice")
    protected String guideprice;
    @XmlElement(name = "SeriesName")
    protected String seriesName;
    @XmlElement(name = "BrandName")
    protected String brandName;
    @XmlElement(name = "CarImage")
    protected String carImage;
    @XmlElement(name = "CarPaiLiang")
    protected String carPaiLiang;
    @XmlElement(name = "CarMinGuideprice")
    protected String carMinGuideprice;
    @XmlElement(name = "CarMaxGuideprice")
    protected String carMaxGuideprice;
    @XmlElement(name = "QuateNum")
    protected String quateNum;

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
     * 获取seriesID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesID() {
        return seriesID;
    }

    /**
     * 设置seriesID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesID(String value) {
        this.seriesID = value;
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
     * 获取carPaiLiang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPaiLiang() {
        return carPaiLiang;
    }

    /**
     * 设置carPaiLiang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPaiLiang(String value) {
        this.carPaiLiang = value;
    }

    /**
     * 获取carMinGuideprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMinGuideprice() {
        return carMinGuideprice;
    }

    /**
     * 设置carMinGuideprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMinGuideprice(String value) {
        this.carMinGuideprice = value;
    }

    /**
     * 获取carMaxGuideprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMaxGuideprice() {
        return carMaxGuideprice;
    }

    /**
     * 设置carMaxGuideprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMaxGuideprice(String value) {
        this.carMaxGuideprice = value;
    }

    /**
     * 获取quateNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuateNum() {
        return quateNum;
    }

    /**
     * 设置quateNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuateNum(String value) {
        this.quateNum = value;
    }

}
