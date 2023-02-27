/**
 * CtEnteBeneficiario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.digitpa.www.schemas._2011.Pagamenti;

public class CtEnteBeneficiario  implements java.io.Serializable {
    /* Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale dell’ente beneficiario. */
    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaG identificativoUnivocoBeneficiario;

    /* Contiene la denominazione della PA. */
    private java.lang.String denominazioneBeneficiario;

    /* Indica il codice dell’unità operativa destinataria. */
    private java.lang.String codiceUnitOperBeneficiario;

    /* Contiene la denominazione dell’unità operativa destinataria. */
    private java.lang.String denomUnitOperBeneficiario;

    /* Indica l’indirizzo dell’ente beneficiario. */
    private java.lang.String indirizzoBeneficiario;

    /* Indica il numero civico del beneficiario. */
    private java.lang.String civicoBeneficiario;

    /* Indica il CAP dell’ente beneficiario. */
    private java.lang.String capBeneficiario;

    /* Indica la località dell’ente beneficiario. */
    private java.lang.String localitaBeneficiario;

    /* Indica la provincia del beneficiario. */
    private java.lang.String provinciaBeneficiario;

    /* Indica il codice nazione dell’ente beneficiario secondo lo
     * standard ISO 3166. */
    private java.lang.String nazioneBeneficiario;

    public CtEnteBeneficiario() {
    }

    public CtEnteBeneficiario(
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaG identificativoUnivocoBeneficiario,
           java.lang.String denominazioneBeneficiario,
           java.lang.String codiceUnitOperBeneficiario,
           java.lang.String denomUnitOperBeneficiario,
           java.lang.String indirizzoBeneficiario,
           java.lang.String civicoBeneficiario,
           java.lang.String capBeneficiario,
           java.lang.String localitaBeneficiario,
           java.lang.String provinciaBeneficiario,
           java.lang.String nazioneBeneficiario) {
           this.identificativoUnivocoBeneficiario = identificativoUnivocoBeneficiario;
           this.denominazioneBeneficiario = denominazioneBeneficiario;
           this.codiceUnitOperBeneficiario = codiceUnitOperBeneficiario;
           this.denomUnitOperBeneficiario = denomUnitOperBeneficiario;
           this.indirizzoBeneficiario = indirizzoBeneficiario;
           this.civicoBeneficiario = civicoBeneficiario;
           this.capBeneficiario = capBeneficiario;
           this.localitaBeneficiario = localitaBeneficiario;
           this.provinciaBeneficiario = provinciaBeneficiario;
           this.nazioneBeneficiario = nazioneBeneficiario;
    }


    /**
     * Gets the identificativoUnivocoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return identificativoUnivocoBeneficiario   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale dell’ente beneficiario.
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaG getIdentificativoUnivocoBeneficiario() {
        return identificativoUnivocoBeneficiario;
    }


    /**
     * Sets the identificativoUnivocoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param identificativoUnivocoBeneficiario   * Aggregazione che riporta le informazioni concernenti l’identificazione
     * fiscale dell’ente beneficiario.
     */
    public void setIdentificativoUnivocoBeneficiario(it.gov.digitpa.www.schemas._2011.Pagamenti.CtIdentificativoUnivocoPersonaG identificativoUnivocoBeneficiario) {
        this.identificativoUnivocoBeneficiario = identificativoUnivocoBeneficiario;
    }


    /**
     * Gets the denominazioneBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return denominazioneBeneficiario   * Contiene la denominazione della PA.
     */
    public java.lang.String getDenominazioneBeneficiario() {
        return denominazioneBeneficiario;
    }


    /**
     * Sets the denominazioneBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param denominazioneBeneficiario   * Contiene la denominazione della PA.
     */
    public void setDenominazioneBeneficiario(java.lang.String denominazioneBeneficiario) {
        this.denominazioneBeneficiario = denominazioneBeneficiario;
    }


    /**
     * Gets the codiceUnitOperBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return codiceUnitOperBeneficiario   * Indica il codice dell’unità operativa destinataria.
     */
    public java.lang.String getCodiceUnitOperBeneficiario() {
        return codiceUnitOperBeneficiario;
    }


    /**
     * Sets the codiceUnitOperBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param codiceUnitOperBeneficiario   * Indica il codice dell’unità operativa destinataria.
     */
    public void setCodiceUnitOperBeneficiario(java.lang.String codiceUnitOperBeneficiario) {
        this.codiceUnitOperBeneficiario = codiceUnitOperBeneficiario;
    }


    /**
     * Gets the denomUnitOperBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return denomUnitOperBeneficiario   * Contiene la denominazione dell’unità operativa destinataria.
     */
    public java.lang.String getDenomUnitOperBeneficiario() {
        return denomUnitOperBeneficiario;
    }


    /**
     * Sets the denomUnitOperBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param denomUnitOperBeneficiario   * Contiene la denominazione dell’unità operativa destinataria.
     */
    public void setDenomUnitOperBeneficiario(java.lang.String denomUnitOperBeneficiario) {
        this.denomUnitOperBeneficiario = denomUnitOperBeneficiario;
    }


    /**
     * Gets the indirizzoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return indirizzoBeneficiario   * Indica l’indirizzo dell’ente beneficiario.
     */
    public java.lang.String getIndirizzoBeneficiario() {
        return indirizzoBeneficiario;
    }


    /**
     * Sets the indirizzoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param indirizzoBeneficiario   * Indica l’indirizzo dell’ente beneficiario.
     */
    public void setIndirizzoBeneficiario(java.lang.String indirizzoBeneficiario) {
        this.indirizzoBeneficiario = indirizzoBeneficiario;
    }


    /**
     * Gets the civicoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return civicoBeneficiario   * Indica il numero civico del beneficiario.
     */
    public java.lang.String getCivicoBeneficiario() {
        return civicoBeneficiario;
    }


    /**
     * Sets the civicoBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param civicoBeneficiario   * Indica il numero civico del beneficiario.
     */
    public void setCivicoBeneficiario(java.lang.String civicoBeneficiario) {
        this.civicoBeneficiario = civicoBeneficiario;
    }


    /**
     * Gets the capBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return capBeneficiario   * Indica il CAP dell’ente beneficiario.
     */
    public java.lang.String getCapBeneficiario() {
        return capBeneficiario;
    }


    /**
     * Sets the capBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param capBeneficiario   * Indica il CAP dell’ente beneficiario.
     */
    public void setCapBeneficiario(java.lang.String capBeneficiario) {
        this.capBeneficiario = capBeneficiario;
    }


    /**
     * Gets the localitaBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return localitaBeneficiario   * Indica la località dell’ente beneficiario.
     */
    public java.lang.String getLocalitaBeneficiario() {
        return localitaBeneficiario;
    }


    /**
     * Sets the localitaBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param localitaBeneficiario   * Indica la località dell’ente beneficiario.
     */
    public void setLocalitaBeneficiario(java.lang.String localitaBeneficiario) {
        this.localitaBeneficiario = localitaBeneficiario;
    }


    /**
     * Gets the provinciaBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return provinciaBeneficiario   * Indica la provincia del beneficiario.
     */
    public java.lang.String getProvinciaBeneficiario() {
        return provinciaBeneficiario;
    }


    /**
     * Sets the provinciaBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param provinciaBeneficiario   * Indica la provincia del beneficiario.
     */
    public void setProvinciaBeneficiario(java.lang.String provinciaBeneficiario) {
        this.provinciaBeneficiario = provinciaBeneficiario;
    }


    /**
     * Gets the nazioneBeneficiario value for this CtEnteBeneficiario.
     * 
     * @return nazioneBeneficiario   * Indica il codice nazione dell’ente beneficiario secondo lo
     * standard ISO 3166.
     */
    public java.lang.String getNazioneBeneficiario() {
        return nazioneBeneficiario;
    }


    /**
     * Sets the nazioneBeneficiario value for this CtEnteBeneficiario.
     * 
     * @param nazioneBeneficiario   * Indica il codice nazione dell’ente beneficiario secondo lo
     * standard ISO 3166.
     */
    public void setNazioneBeneficiario(java.lang.String nazioneBeneficiario) {
        this.nazioneBeneficiario = nazioneBeneficiario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtEnteBeneficiario)) return false;
        CtEnteBeneficiario other = (CtEnteBeneficiario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificativoUnivocoBeneficiario==null && other.getIdentificativoUnivocoBeneficiario()==null) || 
             (this.identificativoUnivocoBeneficiario!=null &&
              this.identificativoUnivocoBeneficiario.equals(other.getIdentificativoUnivocoBeneficiario()))) &&
            ((this.denominazioneBeneficiario==null && other.getDenominazioneBeneficiario()==null) || 
             (this.denominazioneBeneficiario!=null &&
              this.denominazioneBeneficiario.equals(other.getDenominazioneBeneficiario()))) &&
            ((this.codiceUnitOperBeneficiario==null && other.getCodiceUnitOperBeneficiario()==null) || 
             (this.codiceUnitOperBeneficiario!=null &&
              this.codiceUnitOperBeneficiario.equals(other.getCodiceUnitOperBeneficiario()))) &&
            ((this.denomUnitOperBeneficiario==null && other.getDenomUnitOperBeneficiario()==null) || 
             (this.denomUnitOperBeneficiario!=null &&
              this.denomUnitOperBeneficiario.equals(other.getDenomUnitOperBeneficiario()))) &&
            ((this.indirizzoBeneficiario==null && other.getIndirizzoBeneficiario()==null) || 
             (this.indirizzoBeneficiario!=null &&
              this.indirizzoBeneficiario.equals(other.getIndirizzoBeneficiario()))) &&
            ((this.civicoBeneficiario==null && other.getCivicoBeneficiario()==null) || 
             (this.civicoBeneficiario!=null &&
              this.civicoBeneficiario.equals(other.getCivicoBeneficiario()))) &&
            ((this.capBeneficiario==null && other.getCapBeneficiario()==null) || 
             (this.capBeneficiario!=null &&
              this.capBeneficiario.equals(other.getCapBeneficiario()))) &&
            ((this.localitaBeneficiario==null && other.getLocalitaBeneficiario()==null) || 
             (this.localitaBeneficiario!=null &&
              this.localitaBeneficiario.equals(other.getLocalitaBeneficiario()))) &&
            ((this.provinciaBeneficiario==null && other.getProvinciaBeneficiario()==null) || 
             (this.provinciaBeneficiario!=null &&
              this.provinciaBeneficiario.equals(other.getProvinciaBeneficiario()))) &&
            ((this.nazioneBeneficiario==null && other.getNazioneBeneficiario()==null) || 
             (this.nazioneBeneficiario!=null &&
              this.nazioneBeneficiario.equals(other.getNazioneBeneficiario())));
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
        if (getIdentificativoUnivocoBeneficiario() != null) {
            _hashCode += getIdentificativoUnivocoBeneficiario().hashCode();
        }
        if (getDenominazioneBeneficiario() != null) {
            _hashCode += getDenominazioneBeneficiario().hashCode();
        }
        if (getCodiceUnitOperBeneficiario() != null) {
            _hashCode += getCodiceUnitOperBeneficiario().hashCode();
        }
        if (getDenomUnitOperBeneficiario() != null) {
            _hashCode += getDenomUnitOperBeneficiario().hashCode();
        }
        if (getIndirizzoBeneficiario() != null) {
            _hashCode += getIndirizzoBeneficiario().hashCode();
        }
        if (getCivicoBeneficiario() != null) {
            _hashCode += getCivicoBeneficiario().hashCode();
        }
        if (getCapBeneficiario() != null) {
            _hashCode += getCapBeneficiario().hashCode();
        }
        if (getLocalitaBeneficiario() != null) {
            _hashCode += getLocalitaBeneficiario().hashCode();
        }
        if (getProvinciaBeneficiario() != null) {
            _hashCode += getProvinciaBeneficiario().hashCode();
        }
        if (getNazioneBeneficiario() != null) {
            _hashCode += getNazioneBeneficiario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtEnteBeneficiario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctEnteBeneficiario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "identificativoUnivocoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctIdentificativoUnivocoPersonaG"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazioneBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "denominazioneBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUnitOperBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "codiceUnitOperBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomUnitOperBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "denomUnitOperBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "indirizzoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civicoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "civicoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "capBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localitaBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "localitaBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "provinciaBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazioneBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "nazioneBeneficiario"));
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
