//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.03 at 06:00:03 PM CEST 
//


package it.gov.digitpa.schemas._2011.pagamenti.revoche;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctDatiSingolaRevoca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctDatiSingolaRevoca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singoloImportoRevocato" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stImporto"/>
 *         &lt;element name="identificativoUnivocoRiscossione" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText35"/>
 *         &lt;element name="causaleRevoca" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText140"/>
 *         &lt;element name="datiAggiuntiviRevoca" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/Revoche/}stText140"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctDatiSingolaRevoca", propOrder = {
    "singoloImportoRevocato",
    "identificativoUnivocoRiscossione",
    "causaleRevoca",
    "datiAggiuntiviRevoca"
})
public class CtDatiSingolaRevoca {

    @XmlElement(required = true)
    protected BigDecimal singoloImportoRevocato;
    @XmlElement(required = true)
    protected String identificativoUnivocoRiscossione;
    @XmlElement(required = true)
    protected String causaleRevoca;
    @XmlElement(required = true)
    protected String datiAggiuntiviRevoca;

    /**
     * Gets the value of the singoloImportoRevocato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSingoloImportoRevocato() {
        return singoloImportoRevocato;
    }

    /**
     * Sets the value of the singoloImportoRevocato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSingoloImportoRevocato(BigDecimal value) {
        this.singoloImportoRevocato = value;
    }

    /**
     * Gets the value of the identificativoUnivocoRiscossione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoUnivocoRiscossione() {
        return identificativoUnivocoRiscossione;
    }

    /**
     * Sets the value of the identificativoUnivocoRiscossione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoUnivocoRiscossione(String value) {
        this.identificativoUnivocoRiscossione = value;
    }

    /**
     * Gets the value of the causaleRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaleRevoca() {
        return causaleRevoca;
    }

    /**
     * Sets the value of the causaleRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaleRevoca(String value) {
        this.causaleRevoca = value;
    }

    /**
     * Gets the value of the datiAggiuntiviRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatiAggiuntiviRevoca() {
        return datiAggiuntiviRevoca;
    }

    /**
     * Sets the value of the datiAggiuntiviRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatiAggiuntiviRevoca(String value) {
        this.datiAggiuntiviRevoca = value;
    }

}
