
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>TSeries complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡseriesID���Ե�ֵ��
     * 
     */
    public int getSeriesID() {
        return seriesID;
    }

    /**
     * ����seriesID���Ե�ֵ��
     * 
     */
    public void setSeriesID(int value) {
        this.seriesID = value;
    }

    /**
     * ��ȡseriesABC���Ե�ֵ��
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
     * ����seriesABC���Ե�ֵ��
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
     * ��ȡseriesType���Ե�ֵ��
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
     * ����seriesType���Ե�ֵ��
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
     * ��ȡbrandID���Ե�ֵ��
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
     * ����brandID���Ե�ֵ��
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
     * ��ȡmakeName���Ե�ֵ��
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
     * ����makeName���Ե�ֵ��
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
     * ��ȡstate���Ե�ֵ��
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
     * ����state���Ե�ֵ��
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
     * ��ȡseriesCar���Ե�ֵ��
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
     * ����seriesCar���Ե�ֵ��
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

}
