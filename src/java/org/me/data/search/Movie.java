//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ��ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ���ʱ��: 2014.04.07 ʱ�� 06:28:15 PM CST 
//


package org.me.data.search;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>movie complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMDId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="IMDBId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="posterImgUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
    "tmdId",
    "imdbId",
    "title",
    "originalTitle",
    "releaseDate",
    "posterImgUrl"
})
public class Movie {

    @XmlElement(name = "TMDId", required = true)
    protected BigInteger tmdId;
    @XmlElement(name = "IMDBId", required = true)
    protected String imdbId;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String originalTitle;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(org.me.config.DateAdapter.class)
    protected Date releaseDate;
    @XmlElement(required = true, nillable = true)
    protected String posterImgUrl;

    /**
     * ��ȡtmdId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTMDId() {
        return tmdId;
    }

    /**
     * ����tmdId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTMDId(BigInteger value) {
        this.tmdId = value;
    }

    /**
     * ��ȡimdbId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDBId() {
        return imdbId;
    }

    /**
     * ����imdbId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDBId(String value) {
        this.imdbId = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * ��ȡoriginalTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * ����originalTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTitle(String value) {
        this.originalTitle = value;
    }

    /**
     * ��ȡreleaseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * ����releaseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(Date value) {
        this.releaseDate = value;
    }

    /**
     * ��ȡposterImgUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosterImgUrl() {
        return posterImgUrl;
    }

    /**
     * ����posterImgUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosterImgUrl(String value) {
        this.posterImgUrl = value;
    }

}
