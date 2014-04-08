//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ��ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ���ʱ��: 2014.04.08 ʱ�� 01:43:58 PM CST 
//


package org.me.data.movie;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="IMDBUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posterImgUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="simplePlot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="criticsConsensus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runtime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="countries" type="{http://assignment.lf.org/movieapi}countries"/>
 *         &lt;element name="directors" type="{http://assignment.lf.org/movieapi}directors"/>
 *         &lt;element name="writers" type="{http://assignment.lf.org/movieapi}writers"/>
 *         &lt;element name="casts" type="{http://assignment.lf.org/movieapi}casts"/>
 *         &lt;element name="genres" type="{http://assignment.lf.org/movieapi}genres"/>
 *         &lt;element name="languages" type="{http://assignment.lf.org/movieapi}languages"/>
 *         &lt;element name="trailers" type="{http://assignment.lf.org/movieapi}trailers"/>
 *         &lt;element name="reviews" type="{http://assignment.lf.org/movieapi}reviews"/>
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
    "imdbUrl",
    "title",
    "originalTitle",
    "homepage",
    "posterImgUrl",
    "plot",
    "simplePlot",
    "year",
    "releaseDate",
    "criticsConsensus",
    "runtime",
    "countries",
    "directors",
    "writers",
    "casts",
    "genres",
    "languages",
    "trailers",
    "reviews"
})
@XmlRootElement
public class Movie {

    @XmlElement(name = "TMDId", required = true)
    protected BigInteger tmdId;
    @XmlElement(name = "IMDBId", required = true)
    protected String imdbId;
    @XmlElement(name = "IMDBUrl", required = true, nillable = true)
    protected String imdbUrl;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String originalTitle;
    @XmlElement(required = true, nillable = true)
    protected String homepage;
    @XmlElement(required = true, nillable = true)
    protected String posterImgUrl;
    @XmlElement(required = true, nillable = true)
    protected String plot;
    @XmlElement(required = true, nillable = true)
    protected String simplePlot;
    @XmlElement(required = true, nillable = true)
    protected BigInteger year;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(org.me.config.DateAdapter.class)
    protected Date releaseDate;
    @XmlElement(required = true)
    protected String criticsConsensus;
    @XmlElement(required = true)
    protected BigInteger runtime;
    @XmlElement(required = true)
    protected Countries countries;
    @XmlElement(required = true)
    protected Directors directors;
    @XmlElement(required = true)
    protected Writers writers;
    @XmlElement(required = true)
    protected Casts casts;
    @XmlElement(required = true)
    protected Genres genres;
    @XmlElement(required = true)
    protected Languages languages;
    @XmlElement(required = true)
    protected Trailers trailers;
    @XmlElement(required = true)
    protected Reviews reviews;

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
     * ��ȡimdbUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDBUrl() {
        return imdbUrl;
    }

    /**
     * ����imdbUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDBUrl(String value) {
        this.imdbUrl = value;
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
     * ��ȡhomepage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * ����homepage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(String value) {
        this.homepage = value;
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

    /**
     * ��ȡplot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlot() {
        return plot;
    }

    /**
     * ����plot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlot(String value) {
        this.plot = value;
    }

    /**
     * ��ȡsimplePlot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimplePlot() {
        return simplePlot;
    }

    /**
     * ����simplePlot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimplePlot(String value) {
        this.simplePlot = value;
    }

    /**
     * ��ȡyear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * ����year���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * ��ȡreleaseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public  Date getReleaseDate() {
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
     * ��ȡcriticsConsensus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriticsConsensus() {
        return criticsConsensus;
    }

    /**
     * ����criticsConsensus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriticsConsensus(String value) {
        this.criticsConsensus = value;
    }

    /**
     * ��ȡruntime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRuntime() {
        return runtime;
    }

    /**
     * ����runtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRuntime(BigInteger value) {
        this.runtime = value;
    }

    /**
     * ��ȡcountries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Countries }
     *     
     */
    public Countries getCountries() {
        return countries;
    }

    /**
     * ����countries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Countries }
     *     
     */
    public void setCountries(Countries value) {
        this.countries = value;
    }

    /**
     * ��ȡdirectors���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Directors }
     *     
     */
    public Directors getDirectors() {
        return directors;
    }

    /**
     * ����directors���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Directors }
     *     
     */
    public void setDirectors(Directors value) {
        this.directors = value;
    }

    /**
     * ��ȡwriters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Writers }
     *     
     */
    public Writers getWriters() {
        return writers;
    }

    /**
     * ����writers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Writers }
     *     
     */
    public void setWriters(Writers value) {
        this.writers = value;
    }

    /**
     * ��ȡcasts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Casts }
     *     
     */
    public Casts getCasts() {
        return casts;
    }

    /**
     * ����casts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Casts }
     *     
     */
    public void setCasts(Casts value) {
        this.casts = value;
    }

    /**
     * ��ȡgenres���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Genres }
     *     
     */
    public Genres getGenres() {
        return genres;
    }

    /**
     * ����genres���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Genres }
     *     
     */
    public void setGenres(Genres value) {
        this.genres = value;
    }

    /**
     * ��ȡlanguages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * ����languages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * ��ȡtrailers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Trailers }
     *     
     */
    public Trailers getTrailers() {
        return trailers;
    }

    /**
     * ����trailers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Trailers }
     *     
     */
    public void setTrailers(Trailers value) {
        this.trailers = value;
    }

    /**
     * ��ȡreviews���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Reviews }
     *     
     */
    public Reviews getReviews() {
        return reviews;
    }

    /**
     * ����reviews���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Reviews }
     *     
     */
    public void setReviews(Reviews value) {
        this.reviews = value;
    }

}
