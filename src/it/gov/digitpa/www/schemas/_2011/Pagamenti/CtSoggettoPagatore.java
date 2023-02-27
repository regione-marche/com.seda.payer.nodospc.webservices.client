/**
 * CtSoggettoPagatore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.digitpa.www.schemas._2011.Pagamenti;

public class CtSoggettoPagatore  implements java.io.Serializable {
    /* Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del pagatore. */
    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoPagatore;

    /* Indica il nominativo o la ragione sociale del pagatore. */
    private java.lang.String anagraficaPagatore;

    /* Indica l’indirizzo del pagatore. */
    private java.lang.String indirizzoPagatore;

    /* Indica il numero civico del pagatore. */
    private java.lang.String civicoPagatore;

    /* Indica il CAP del pagatore. */
    private java.lang.String capPagatore;

    /* Indica la località del pagatore. */
    private java.lang.String localitaPagatore;

    /* Indica la provincia del pagatore. */
    private java.lang.String provinciaPagatore;

    /* Indica il codice nazione del pagatore secondo lo standard ISO
     * 3166. */
    private java.lang.String nazionePagatore;

    /* Indirizzo di posta elettronica del pagatore. */
    private java.lang.String eMailPagatore;

    public CtSoggettoPagatore() {
    }

    public CtSoggettoPagatore(
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoPagatore,
           java.lang.String anagraficaPagatore,
           java.lang.String indirizzoPagatore,
           java.lang.String civicoPagatore,
           java.lang.String capPagatore,
           java.lang.String localitaPagatore,
           java.lang.String provinciaPagatore,
           java.lang.String nazionePagatore,
           java.lang.String eMailPagatore) {
           this.identificativoUnivocoPagatore = identificativoUnivocoPagatore;
           this.anagraficaPagatore = anagraficaPagatore;
           this.indirizzoPagatore = indirizzoPagatore;
           this.civicoPagatore = civicoPagatore;
           this.capPagatore = capPagatore;
           this.localitaPagatore = localitaPagatore;
           this.provinciaPagatore = provinciaPagatore;
           this.nazionePagatore = nazionePagatore;
           this.eMailPagatore = eMailPagatore;
    }


    /**
     * Gets the identificativoUnivocoPagatore value for this CtSoggettoPagatore.
     * 
     * @return identificativoUnivocoPagatore   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del pagatore.
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG getIdentificativoUnivocoPagatore() {
        return identificativoUnivocoPagatore;
    }


    /**
     * Sets the identificativoUnivocoPagatore value for this CtSoggettoPagatore.
     * 
     * @param identificativoUnivocoPagatore   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale del pagatore.
     */
    public void setIdentificativoUnivocoPagatore(it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaFG identificativoUnivocoPagatore) {
        this.identificativoUnivocoPagatore = identificativoUnivocoPagatore;
    }


    /**
     * Gets the anagraficaPagatore value for this CtSoggettoPagatore.
     * 
     * @return anagraficaPagatore   * Indica il nominativo o la ragione sociale del pagatore.
     */
    public java.lang.String getAnagraficaPagatore() {
        return anagraficaPagatore;
    }


    /**
     * Sets the anagraficaPagatore value for this CtSoggettoPagatore.
     * 
     * @param anagraficaPagatore   * Indica il nominativo o la ragione sociale del pagatore.
     */
    public void setAnagraficaPagatore(java.lang.String anagraficaPagatore) {
        this.anagraficaPagatore = anagraficaPagatore;
    }


    /**
     * Gets the indirizzoPagatore value for this CtSoggettoPagatore.
     * 
     * @return indirizzoPagatore   * Indica l’indirizzo del pagatore.
     */
    public java.lang.String getIndirizzoPagatore() {
        return indirizzoPagatore;
    }


    /**
     * Sets the indirizzoPagatore value for this CtSoggettoPagatore.
     * 
     * @param indirizzoPagatore   * Indica l’indirizzo del pagatore.
     */
    public void setIndirizzoPagatore(java.lang.String indirizzoPagatore) {
        this.indirizzoPagatore = indirizzoPagatore;
    }


    /**
     * Gets the civicoPagatore value for this CtSoggettoPagatore.
     * 
     * @return civicoPagatore   * Indica il numero civico del pagatore.
     */
    public java.lang.String getCivicoPagatore() {
        return civicoPagatore;
    }


    /**
     * Sets the civicoPagatore value for this CtSoggettoPagatore.
     * 
     * @param civicoPagatore   * Indica il numero civico del pagatore.
     */
    public void setCivicoPagatore(java.lang.String civicoPagatore) {
        this.civicoPagatore = civicoPagatore;
    }


    /**
     * Gets the capPagatore value for this CtSoggettoPagatore.
     * 
     * @return capPagatore   * Indica il CAP del pagatore.
     */
    public java.lang.String getCapPagatore() {
        return capPagatore;
    }


    /**
     * Sets the capPagatore value for this CtSoggettoPagatore.
     * 
     * @param capPagatore   * Indica il CAP del pagatore.
     */
    public void setCapPagatore(java.lang.String capPagatore) {
        this.capPagatore = capPagatore;
    }


    /**
     * Gets the localitaPagatore value for this CtSoggettoPagatore.
     * 
     * @return localitaPagatore   * Indica la località del pagatore.
     */
    public java.lang.String getLocalitaPagatore() {
        return localitaPagatore;
    }


    /**
     * Sets the localitaPagatore value for this CtSoggettoPagatore.
     * 
     * @param localitaPagatore   * Indica la località del pagatore.
     */
    public void setLocalitaPagatore(java.lang.String localitaPagatore) {
        this.localitaPagatore = localitaPagatore;
    }


    /**
     * Gets the provinciaPagatore value for this CtSoggettoPagatore.
     * 
     * @return provinciaPagatore   * Indica la provincia del pagatore.
     */
    public java.lang.String getProvinciaPagatore() {
        return provinciaPagatore;
    }


    /**
     * Sets the provinciaPagatore value for this CtSoggettoPagatore.
     * 
     * @param provinciaPagatore   * Indica la provincia del pagatore.
     */
    public void setProvinciaPagatore(java.lang.String provinciaPagatore) {
        this.provinciaPagatore = provinciaPagatore;
    }


    /**
     * Gets the nazionePagatore value for this CtSoggettoPagatore.
     * 
     * @return nazionePagatore   * Indica il codice nazione del pagatore secondo lo standard ISO
     * 3166.
     */
    public java.lang.String getNazionePagatore() {
        return nazionePagatore;
    }


    /**
     * Sets the nazionePagatore value for this CtSoggettoPagatore.
     * 
     * @param nazionePagatore   * Indica il codice nazione del pagatore secondo lo standard ISO
     * 3166.
     */
    public void setNazionePagatore(java.lang.String nazionePagatore) {
        this.nazionePagatore = nazionePagatore;
    }


    /**
     * Gets the eMailPagatore value for this CtSoggettoPagatore.
     * 
     * @return eMailPagatore   * Indirizzo di posta elettronica del pagatore.
     */
    public java.lang.String getEMailPagatore() {
        return eMailPagatore;
    }


    /**
     * Sets the eMailPagatore value for this CtSoggettoPagatore.
     * 
     * @param eMailPagatore   * Indirizzo di posta elettronica del pagatore.
     */
    public void setEMailPagatore(java.lang.String eMailPagatore) {
        this.eMailPagatore = eMailPagatore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtSoggettoPagatore)) return false;
        CtSoggettoPagatore other = (CtSoggettoPagatore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificativoUnivocoPagatore==null && other.getIdentificativoUnivocoPagatore()==null) || 
             (this.identificativoUnivocoPagatore!=null &&
              this.identificativoUnivocoPagatore.equals(other.getIdentificativoUnivocoPagatore()))) &&
            ((this.anagraficaPagatore==null && other.getAnagraficaPagatore()==null) || 
             (this.anagraficaPagatore!=null &&
              this.anagraficaPagatore.equals(other.getAnagraficaPagatore()))) &&
            ((this.indirizzoPagatore==null && other.getIndirizzoPagatore()==null) || 
             (this.indirizzoPagatore!=null &&
              this.indirizzoPagatore.equals(other.getIndirizzoPagatore()))) &&
            ((this.civicoPagatore==null && other.getCivicoPagatore()==null) || 
             (this.civicoPagatore!=null &&
              this.civicoPagatore.equals(other.getCivicoPagatore()))) &&
            ((this.capPagatore==null && other.getCapPagatore()==null) || 
             (this.capPagatore!=null &&
              this.capPagatore.equals(other.getCapPagatore()))) &&
            ((this.localitaPagatore==null && other.getLocalitaPagatore()==null) || 
             (this.localitaPagatore!=null &&
              this.localitaPagatore.equals(other.getLocalitaPagatore()))) &&
            ((this.provinciaPagatore==null && other.getProvinciaPagatore()==null) || 
             (this.provinciaPagatore!=null &&
              this.provinciaPagatore.equals(other.getProvinciaPagatore()))) &&
            ((this.nazionePagatore==null && other.getNazionePagatore()==null) || 
             (this.nazionePagatore!=null &&
              this.nazionePagatore.equals(other.getNazionePagatore()))) &&
            ((this.eMailPagatore==null && other.getEMailPagatore()==null) || 
             (this.eMailPagatore!=null &&
              this.eMailPagatore.equals(other.getEMailPagatore())));
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
        if (getIdentificativoUnivocoPagatore() != null) {
            _hashCode += getIdentificativoUnivocoPagatore().hashCode();
        }
        if (getAnagraficaPagatore() != null) {
            _hashCode += getAnagraficaPagatore().hashCode();
        }
        if (getIndirizzoPagatore() != null) {
            _hashCode += getIndirizzoPagatore().hashCode();
        }
        if (getCivicoPagatore() != null) {
            _hashCode += getCivicoPagatore().hashCode();
        }
        if (getCapPagatore() != null) {
            _hashCode += getCapPagatore().hashCode();
        }
        if (getLocalitaPagatore() != null) {
            _hashCode += getLocalitaPagatore().hashCode();
        }
        if (getProvinciaPagatore() != null) {
            _hashCode += getProvinciaPagatore().hashCode();
        }
        if (getNazionePagatore() != null) {
            _hashCode += getNazionePagatore().hashCode();
        }
        if (getEMailPagatore() != null) {
            _hashCode += getEMailPagatore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtSoggettoPagatore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctSoggettoPagatore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "identificativoUnivocoPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctIdentificativoUnivocoPersonaFG"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "anagraficaPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "indirizzoPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civicoPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "civicoPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "capPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localitaPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "localitaPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "provinciaPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazionePagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "nazionePagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "e-mailPagatore"));
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
