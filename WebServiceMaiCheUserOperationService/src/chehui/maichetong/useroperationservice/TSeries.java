
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>TSeries complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TSeries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeriesID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SeriesABC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesFace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MakeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSeries", propOrder = {
    "seriesID",
    "seriesABC",
    "seriesName",
    "seriesType",
    "seriesFace",
    "brandID",
    "makeName",
    "state",
    "seriesCar",
    "carImage",
    "carColor"
})
public class TSeries {

    @XmlElement(name = "SeriesID")
    protected int seriesID;
    @XmlElement(name = "SeriesABC")
    protected String seriesABC;
    @XmlElement(name = "SeriesName")
    protected String seriesName;
    @XmlElement(name = "SeriesType")
    protected String seriesType;
    @XmlElement(name = "SeriesFace")
    protected String seriesFace;
    @XmlElement(name = "BrandID")
    protected String brandID;
    @XmlElement(name = "MakeName")
    protected String makeName;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SeriesCar")
    protected String seriesCar;
    @XmlElement(name = "CarImage")
    protected String carImage;
    @XmlElement(name = "CarColor")
    protected String carColor;

    /**
     * 获取seriesID属性的值。
     * 
     */
    public int getSeriesID() {
        return seriesID;
    }

    /**
     * 设置seriesID属性的值。
     * 
     */
    public void setSeriesID(int value) {
        this.seriesID = value;
    }

    /**
     * 获取seriesABC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesABC() {
        return seriesABC;
    }

    /**
     * 设置seriesABC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesABC(String value) {
        this.seriesABC = value;
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
     * 获取seriesType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesType() {
        return seriesType;
    }

    /**
     * 设置seriesType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesType(String value) {
        this.seriesType = value;
    }

    /**
     * 获取seriesFace属性的值。
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
     * 设置seriesFace属性的值。
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
     * 获取brandID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * 设置brandID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * 获取makeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeName() {
        return makeName;
    }

    /**
     * 设置makeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeName(String value) {
        this.makeName = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取seriesCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesCar() {
        return seriesCar;
    }

    /**
     * 设置seriesCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesCar(String value) {
        this.seriesCar = value;
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

}
