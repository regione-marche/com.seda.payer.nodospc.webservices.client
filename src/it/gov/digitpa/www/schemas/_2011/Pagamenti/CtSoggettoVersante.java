/**
 * CtSoggettoVersante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.digitpa.www.schemas._2011.Pagamenti;

public class CtSoggettoVersante  implements java.io.Serializable {
    /* Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del versante. */
    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoVersante;

    /* Indica il nominativo o la ragione sociale del versante. */
    private java.lang.String anagraficaVersante;

    /* Indica l’indirizzo del versante. */
    private java.lang.String indirizzoVersante;

    /* Indica il numero civico del versante. */
    private java.lang.String civicoVersante;

    /* Indica il CAP del versante. */
    private java.lang.String capVersante;

    /* Indica la località del versante. */
    private java.lang.String localitaVersante;

    /* Indica la provincia del versante. */
    private java.lang.String provinciaVersante;

    /* Indica il codice nazione del versante secondo lo standard ISO
     * 3166. */
    private java.lang.String nazioneVersante;

    /* Indirizzo di posta elettronica del versante. */
    private java.lang.String eMailVersante;

    public CtSoggettoVersante() {
    }

    public CtSoggettoVersante(
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoVersante,
           java.lang.String anagraficaVersante,
           java.lang.String indirizzoVersante,
           java.lang.String civicoVersante,
           java.lang.String capVersante,
           java.lang.String localitaVersante,
           java.lang.String provinciaVersante,
           java.lang.String nazioneVersante,
           java.lang.String eMailVersante) {
           this.identificativoUnivocoVersante = identificativoUnivocoVersante;
           this.anagraficaVersante = anagraficaVersante;
           this.indirizzoVersante = indirizzoVersante;
           this.civicoVersante = civicoVersante;
           this.capVersante = capVersante;
           this.localitaVersante = localitaVersante;
           this.provinciaVersante = provinciaVersante;
           this.nazioneVersante = nazioneVersante;
           this.eMailVersante = eMailVersante;
    }


    /**
     * Gets the identificativoUnivocoVersante value for this CtSoggettoVersante.
     * 
     * @return identificativoUnivocoVersante   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del versante.
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG getIdentificativoUnivocoVersante() {
        return identificativoUnivocoVersante;
    }


    /**
     * Sets the identificativoUnivocoVersante value for this CtSoggettoVersante.
     * 
     * @param identificativoUnivocoVersante   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del versante.
     */
    public void setIdentificativoUnivocoVersante(it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoVersante) {
        this.identificativoUnivocoVersante = identificativoUnivocoVersante;
    }


    /**
     * Gets the anagraficaVersante value for this CtSoggettoVersante.
     * 
     * @return anagraficaVersante   * Indica il nominativo o la ragione sociale del versante.
     */
    public java.lang.String getAnagraficaVersante() {
        return anagraficaVersante;
    }


    /**
     * Sets the anagraficaVersante value for this CtSoggettoVersante.
     * 
     * @param anagraficaVersante   * Indica il nominativo o la ragione sociale del versante.
     */
    public void setAnagraficaVersante(java.lang.String anagraficaVersante) {
        this.anagraficaVersante = anagraficaVersante;
    }


    /**
     * Gets the indirizzoVersante value for this CtSoggettoVersante.
     * 
     * @return indirizzoVersante   * Indica l’indirizzo del versante.
     */
    public java.lang.String getIndirizzoVersante() {
        return indirizzoVersante;
    }


    /**
     * Sets the indirizzoVersante value for this CtSoggettoVersante.
     * 
     * @param indirizzoVersante   * Indica l’indirizzo del versante.
     */
    public void setIndirizzoVersante(java.lang.String indirizzoVersante) {
        this.indirizzoVersante = indirizzoVersante;
    }


    /**
     * Gets the civicoVersante value for this CtSoggettoVersante.
     * 
     * @return civicoVersante   * Indica il numero civico del versante.
     */
    public java.lang.String getCivicoVersante() {
        return civicoVersante;
    }


    /**
     * Sets the civicoVersante value for this CtSoggettoVersante.
     * 
     * @param civicoVersante   * Indica il numero civico del versante.
     */
    public void setCivicoVersante(java.lang.String civicoVersante) {
        this.civicoVersante = civicoVersante;
    }


    /**
     * Gets the capVersante value for this CtSoggettoVersante.
     * 
     * @return capVersante   * Indica il CAP del versante.
     */
    public java.lang.String getCapVersante() {
        return capVersante;
    }


    /**
     * Sets the capVersante value for this CtSoggettoVersante.
     * 
     * @param capVersante   * Indica il CAP del versante.
     */
    public void setCapVersante(java.lang.String capVersante) {
        this.capVersante = capVersante;
    }


    /**
     * Gets the localitaVersante value for this CtSoggettoVersante.
     * 
     * @return localitaVersante   * Indica la località del versante.
     */
    public java.lang.String getLocalitaVersante() {
        return localitaVersante;
    }


    /**
     * Sets the localitaVersante value for this CtSoggettoVersante.
     * 
     * @param localitaVersante   * Indica la località del versante.
     */
    public void setLocalitaVersante(java.lang.String localitaVersante) {
        this.localitaVersante = localitaVersante;
    }


    /**
     * Gets the provinciaVersante value for this CtSoggettoVersante.
     * 
     * @return provinciaVersante   * Indica la provincia del versante.
     */
    public java.lang.String getProvinciaVersante() {
        return provinciaVersante;
    }


    /**
     * Sets the provinciaVersante value for this CtSoggettoVersante.
     * 
     * @param provinciaVersante   * Indica la provincia del versante.
     */
    public void setProvinciaVersante(java.lang.String provinciaVersante) {
        this.provinciaVersante = provinciaVersante;
    }


    /**
     * Gets the nazioneVersante value for this CtSoggettoVersante.
     * 
     * @return nazioneVersante   * Indica il codice nazione del versante secondo lo standard ISO
     * 3166.
     */
    public java.lang.String getNazioneVersante() {
        return nazioneVersante;
    }


    /**
     * Sets the nazioneVersante value for this CtSoggettoVersante.
     * 
     * @param nazioneVersante   * Indica il codice nazione del versante secondo lo standard ISO
     * 3166.
     */
    public void setNazioneVersante(java.lang.String nazioneVersante) {
        this.nazioneVersante = nazioneVersante;
    }


    /**
     * Gets the eMailVersante value for this CtSoggettoVersante.
     * 
     * @return eMailVersante   * Indirizzo di posta elettronica del versante.
     */
    public java.lang.String getEMailVersante() {
        return eMailVersante;
    }


    /**
     * Sets the eMailVersante value for this CtSoggettoVersante.
     * 
     * @param eMailVersante   * Indirizzo di posta elettronica del versante.
     */
    public void setEMailVersante(java.lang.String eMailVersante) {
        this.eMailVersante = eMailVersante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtSoggettoVersante)) return false;
        CtSoggettoVersante other = (CtSoggettoVersante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificativoUnivocoVersante==null && other.getIdentificativoUnivocoVersante()==null) || 
             (this.identificativoUnivocoVersante!=null &&
              this.identificativoUnivocoVersante.equals(other.getIdentificativoUnivocoVersante()))) &&
            ((this.anagraficaVersante==null && other.getAnagraficaVersante()==null) || 
             (this.anagraficaVersante!=null &&
              this.anagraficaVersante.equals(other.getAnagraficaVersante()))) &&
            ((this.indirizzoVersante==null && other.getIndirizzoVersante()==null) || 
             (this.indirizzoVersante!=null &&
              this.indirizzoVersante.equals(other.getIndirizzoVersante()))) &&
            ((this.civicoVersante==null && other.getCivicoVersante()==null) || 
             (this.civicoVersante!=null &&
              this.civicoVersante.equals(other.getCivicoVersante()))) &&
            ((this.capVersante==null && other.getCapVersante()==null) || 
             (this.capVersante!=null &&
              this.capVersante.equals(other.getCapVersante()))) &&
            ((this.localitaVersante==null && other.getLocalitaVersante()==null) || 
             (this.localitaVersante!=null &&
              this.localitaVersante.equals(other.getLocalitaVersante()))) &&
            ((this.provinciaVersante==null && other.getProvinciaVersante()==null) || 
             (this.provinciaVersante!=null &&
              this.provinciaVersante.equals(other.getProvinciaVersante()))) &&
            ((this.nazioneVersante==null && other.getNazioneVersante()==null) || 
             (this.nazioneVersante!=null &&
              this.nazioneVersante.equals(other.getNazioneVersante()))) &&
            ((this.eMailVersante==null && other.getEMailVersante()==null) || 
             (this.eMailVersante!=null &&
              this.eMailVersante.equals(other.getEMailVersante())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdentificativoUnivocoVersante() != null) {
            _hashCode += getIdentificativoUnivocoVersante().hashCode();
        }
        if (getAnagraficaVersante() != null) {
            _hashCode += getAnagraficaVersante().hashCode();
        }
        if (getIndirizzoVersante() != null) {
            _hashCode += getIndirizzoVersante().hashCode();
        }
        if (getCivicoVersante() != null) {
            _hashCode += getCivicoVersante().hashCode();
        }
        if (getCapVersante() != null) {
            _hashCode += getCapVersante().hashCode();
        }
        if (getLocalitaVersante() != null) {
            _hashCode += getLocalitaVersante().hashCode();
        }
        if (getProvinciaVersante() != null) {
            _hashCode += getProvinciaVersante().hashCode();
        }
        if (getNazioneVersante() != null) {
            _hashCode += getNazioneVersante().hashCode();
        }
        if (getEMailVersante() != null) {
            _hashCode += getEMailVersante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtSoggettoVersante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctSoggettoVersante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "identificativoUnivocoVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctIdentificativoUnivocoPersonaFG"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "anagraficaVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "indirizzoVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civicoVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "civicoVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "capVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localitaVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "localitaVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "provinciaVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazioneVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "nazioneVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "e-mailVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
