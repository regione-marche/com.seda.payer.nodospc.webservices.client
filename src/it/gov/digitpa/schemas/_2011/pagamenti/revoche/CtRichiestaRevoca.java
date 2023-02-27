//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.03 at 06:00:03 PM CEST 
//


package it.gov.digitpa.schemas._2011.pagamenti.revoche;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctRichiestaRevoca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRichiestaRevoca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versioneOggetto" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText16"/>
 *         &lt;element name="dominio" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctDominio"/>
 *         &lt;element name="identificativoMessaggioRevoca" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText35"/>
 *         &lt;element name="dataOraMessaggioRevoca" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stISODateTime"/>
 *         &lt;element name="istitutoAttestante" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctIstitutoAttestante"/>
 *         &lt;element name="soggettoVersante" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctSoggettoVersante" minOccurs="0"/>
 *         &lt;element name="soggettoPagatore" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctSoggettoPagatore"/>
 *         &lt;element name="datiRevoca" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctDatiRevoca"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRichiestaRevoca", propOrder = {
    "versioneOggetto",
    "dominio",
    "identificativoMessaggioRevoca",
    "dataOraMessaggioRevoca",
    "istitutoAttestante",
    "soggettoVersante",
    "soggettoPagatore",
    "datiRevoca"
})
public class CtRichiestaRevoca {

    @XmlElement(required = true)
    protected String versioneOggetto;
    @XmlElement(required = true)
    protected CtDominio dominio;
    @XmlElement(required = true)
    protected String identificativoMessaggioRevoca;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraMessaggioRevoca;
    @XmlElement(required = true)
    protected CtIstitutoAttestante istitutoAttestante;
    protected CtSoggettoVersante soggettoVersante;
    @XmlElement(required = true)
    protected CtSoggettoPagatore soggettoPagatore;
    @XmlElement(required = true)
    protected CtDatiRevoca datiRevoca;

    /**
     * Gets the value of the versioneOggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersioneOggetto() {
        return versioneOggetto;
    }

    /**
     * Sets the value of the versioneOggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersioneOggetto(String value) {
        this.versioneOggetto = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link CtDominio }
     *     
     */
    public CtDominio getDominio() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDominio }
     *     
     */
    public void setDominio(CtDominio value) {
        this.dominio = value;
    }

    /**
     * Gets the value of the identificativoMessaggioRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoMessaggioRevoca() {
        return identificativoMessaggioRevoca;
    }

    /**
     * Sets the value of the identificativoMessaggioRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoMessaggioRevoca(String value) {
        this.identificativoMessaggioRevoca = value;
    }

    /**
     * Gets the value of the dataOraMessaggioRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraMessaggioRevoca() {
        return dataOraMessaggioRevoca;
    }

    /**
     * Sets the value of the dataOraMessaggioRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraMessaggioRevoca(XMLGregorianCalendar value) {
        this.dataOraMessaggioRevoca = value;
    }

    /**
     * Gets the value of the istitutoAttestante property.
     * 
     * @return
     *     possible object is
     *     {@link CtIstitutoAttestante }
     *     
     */
    public CtIstitutoAttestante getIstitutoAttestante() {
        return istitutoAttestante;
    }

    /**
     * Sets the value of the istitutoAttestante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIstitutoAttestante }
     *     
     */
    public void setIstitutoAttestante(CtIstitutoAttestante value) {
        this.istitutoAttestante = value;
    }

    /**
     * Gets the value of the soggettoVersante property.
     * 
     * @return
     *     possible object is
     *     {@link CtSoggettoVersante }
     *     
     */
    public CtSoggettoVersante getSoggettoVersante() {
        return soggettoVersante;
    }

    /**
     * Sets the value of the soggettoVersante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSoggettoVersante }
     *     
     */
    public void setSoggettoVersante(CtSoggettoVersante value) {
        this.soggettoVersante = value;
    }

    /**
     * Gets the value of the soggettoPagatore property.
     * 
     * @return
     *     possible object is
     *     {@link CtSoggettoPagatore }
     *     
     */
    public CtSoggettoPagatore getSoggettoPagatore() {
        return soggettoPagatore;
    }

    /**
     * Sets the value of the soggettoPagatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSoggettoPagatore }
     *     
     */
    public void setSoggettoPagatore(CtSoggettoPagatore value) {
        this.soggettoPagatore = value;
    }

    /**
     * Gets the value of the datiRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link CtDatiRevoca }
     *     
     */
    public CtDatiRevoca getDatiRevoca() {
        return datiRevoca;
    }

    /**
     * Sets the value of the datiRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDatiRevoca }
     *     
     */
    public void setDatiRevoca(CtDatiRevoca value) {
        this.datiRevoca = value;
    }

}
