
package chehui.maichetong.useroperationservice;

import java.util.ArrayList;
import java.util.List;
import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTQuote complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TQuote" type="{http://UserOperationService.maichetong.chehui/}TQuote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTQuote", propOrder = {
    "tQuote"
})
public class ArrayOfTQuote {

    @XmlElement(name = "TQuote", nillable = true)
    protected List<TQuote> tQuote;

    /**
     * Gets the value of the tQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TQuote }
     * 
     * 
     */
    public List<TQuote> getTQuote() {
        if (tQuote == null) {
            tQuote = new ArrayList<TQuote>();
        }
        return this.tQuote;
    }

}
