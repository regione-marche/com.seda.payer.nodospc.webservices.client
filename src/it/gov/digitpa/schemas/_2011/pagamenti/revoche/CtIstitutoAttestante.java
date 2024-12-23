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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctIstitutoAttestante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctIstitutoAttestante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoUnivocoMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}ctIdentificativoUnivoco"/>
 *         &lt;element name="denominazioneMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText70"/>
 *         &lt;element name="codiceUnitOperMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText35" minOccurs="0"/>
 *         &lt;element name="denomUnitOperMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText70" minOccurs="0"/>
 *         &lt;element name="indirizzoMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText70" minOccurs="0"/>
 *         &lt;element name="civicoMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText16" minOccurs="0"/>
 *         &lt;element name="capMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText16" minOccurs="0"/>
 *         &lt;element name="localitaMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText35" minOccurs="0"/>
 *         &lt;element name="provinciaMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText35" minOccurs="0"/>
 *         &lt;element name="nazioneMittente" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stNazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctIstitutoAttestante", propOrder = {
    "identificativoUnivocoMittente",
    "denominazioneMittente",
    "codiceUnitOperMittente",
    "denomUnitOperMittente",
    "indirizzoMittente",
    "civicoMittente",
    "capMittente",
    "localitaMittente",
    "provinciaMittente",
    "nazioneMittente"
})
public class CtIstitutoAttestante {

    @XmlElement(required = true)
    protected CtIdentificativoUnivoco identificativoUnivocoMittente;
    @XmlElement(required = true)
    protected String denominazioneMittente;
    protected String codiceUnitOperMittente;
    protected String denomUnitOperMittente;
    protected String indirizzoMittente;
    protected String civicoMittente;
    protected String capMittente;
    protected String localitaMittente;
    protected String provinciaMittente;
    protected String nazioneMittente;

    /**
     * Gets the value of the identificativoUnivocoMittente property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificativoUnivoco }
     *     
     */
    public CtIdentificativoUnivoco getIdentificativoUnivocoMittente() {
        return identificativoUnivocoMittente;
    }

    /**
     * Sets the value of the identificativoUnivocoMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificativoUnivoco }
     *     
     */
    public void setIdentificativoUnivocoMittente(CtIdentificativoUnivoco value) {
        this.identificativoUnivocoMittente = value;
    }

    /**
     * Gets the value of the denominazioneMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneMittente() {
        return denominazioneMittente;
    }

    /**
     * Sets the value of the denominazioneMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneMittente(String value) {
        this.denominazioneMittente = value;
    }

    /**
     * Gets the value of the codiceUnitOperMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUnitOperMittente() {
        return codiceUnitOperMittente;
    }

    /**
     * Sets the value of the codiceUnitOperMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUnitOperMittente(String value) {
        this.codiceUnitOperMittente = value;
    }

    /**
     * Gets the value of the denomUnitOperMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomUnitOperMittente() {
        return denomUnitOperMittente;
    }

    /**
     * Sets the value of the denomUnitOperMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomUnitOperMittente(String value) {
        this.denomUnitOperMittente = value;
    }

    /**
     * Gets the value of the indirizzoMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoMittente() {
        return indirizzoMittente;
    }

    /**
     * Sets the value of the indirizzoMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoMittente(String value) {
        this.indirizzoMittente = value;
    }

    /**
     * Gets the value of the civicoMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicoMittente() {
        return civicoMittente;
    }

    /**
     * Sets the value of the civicoMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicoMittente(String value) {
        this.civicoMittente = value;
    }

    /**
     * Gets the value of the capMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapMittente() {
        return capMittente;
    }

    /**
     * Sets the value of the capMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapMittente(String value) {
        this.capMittente = value;
    }

    /**
     * Gets the value of the localitaMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalitaMittente() {
        return localitaMittente;
    }

    /**
     * Sets the value of the localitaMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalitaMittente(String value) {
        this.localitaMittente = value;
    }

    /**
     * Gets the value of the provinciaMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaMittente() {
        return provinciaMittente;
    }

    /**
     * Sets the value of the provinciaMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaMittente(String value) {
        this.provinciaMittente = value;
    }

    /**
     * Gets the value of the nazioneMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazioneMittente() {
        return nazioneMittente;
    }

    /**
     * Sets the value of the nazioneMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazioneMittente(String value) {
        this.nazioneMittente = value;
    }

}
