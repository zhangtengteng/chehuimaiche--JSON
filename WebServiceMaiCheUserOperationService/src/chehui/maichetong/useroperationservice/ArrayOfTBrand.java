
package chehui.maichetong.useroperationservice;

import java.util.ArrayList;
import java.util.List;
import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTBrand complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTBrand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TBrand" type="{http://UserOperationService.maichetong.chehui/}TBrand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTBrand", propOrder = {
    "tBrand"
})
public class ArrayOfTBrand {

    @XmlElement(name = "TBrand", nillable = true)
    protected List<TBrand> tBrand;

    /**
     * Gets the value of the tBrand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tBrand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TBrand }
     * 
     * 
     */
    public List<TBrand> getTBrand() {
        if (tBrand == null) {
            tBrand = new ArrayList<TBrand>();
        }
        return this.tBrand;
    }

}
