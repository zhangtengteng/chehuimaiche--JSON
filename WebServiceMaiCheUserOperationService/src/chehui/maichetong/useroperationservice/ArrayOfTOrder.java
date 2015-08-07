
package chehui.maichetong.useroperationservice;

import java.util.ArrayList;
import java.util.List;
import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOrder" type="{http://UserOperationService.maichetong.chehui/}TOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTOrder", propOrder = {
    "tOrder"
})
public class ArrayOfTOrder {

    @XmlElement(name = "TOrder", nillable = true)
    protected List<TOrder> tOrder;

    /**
     * Gets the value of the tOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOrder }
     * 
     * 
     */
    public List<TOrder> getTOrder() {
        if (tOrder == null) {
            tOrder = new ArrayList<TOrder>();
        }
        return this.tOrder;
    }

}
