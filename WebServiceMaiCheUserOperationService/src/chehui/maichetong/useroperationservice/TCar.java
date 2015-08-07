
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>TCar complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡseriesID���Ե�ֵ��
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
     * ����seriesID���Ե�ֵ��
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
     * ��ȡcarPaiLiang���Ե�ֵ��
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
     * ����carPaiLiang���Ե�ֵ��
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
     * ��ȡcarMinGuideprice���Ե�ֵ��
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
     * ����carMinGuideprice���Ե�ֵ��
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
     * ��ȡcarMaxGuideprice���Ե�ֵ��
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
     * ����carMaxGuideprice���Ե�ֵ��
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
     * ��ȡquateNum���Ե�ֵ��
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
     * ����quateNum���Ե�ֵ��
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
