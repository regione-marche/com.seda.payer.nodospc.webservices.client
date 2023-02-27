/**
 * PaaAttivaRPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaAttivaRPT  implements java.io.Serializable {
    private java.lang.String identificativoPSP;

    private gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPSP datiPagamentoPSP;

    private java.lang.String identificativoIntermediarioPSP;

    private java.lang.String identificativoCanalePSP;

    public PaaAttivaRPT() {
    }

    public PaaAttivaRPT(
           java.lang.String identificativoPSP,
           gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPSP datiPagamentoPSP,
           java.lang.String identificativoIntermediarioPSP,
           java.lang.String identificativoCanalePSP) {
           this.identificativoPSP = identificativoPSP;
           this.datiPagamentoPSP = datiPagamentoPSP;
           this.identificativoIntermediarioPSP = identificativoIntermediarioPSP;
           this.identificativoCanalePSP = identificativoCanalePSP;
    }


    /**
     * Gets the identificativoPSP value for this PaaAttivaRPT.
     * 
     * @return identificativoPSP
     */
    public java.lang.String getIdentificativoPSP() {
        return identificativoPSP;
    }


    /**
     * Sets the identificativoPSP value for this PaaAttivaRPT.
     * 
     * @param identificativoPSP
     */
    public void setIdentificativoPSP(java.lang.String identificativoPSP) {
        this.identificativoPSP = identificativoPSP;
    }


    /**
     * Gets the datiPagamentoPSP value for this PaaAttivaRPT.
     * 
     * @return datiPagamentoPSP
     */
    public gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPSP getDatiPagamentoPSP() {
        return datiPagamentoPSP;
    }


    /**
     * Sets the datiPagamentoPSP value for this PaaAttivaRPT.
     * 
     * @param datiPagamentoPSP
     */
    public void setDatiPagamentoPSP(gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPSP datiPagamentoPSP) {
        this.datiPagamentoPSP = datiPagamentoPSP;
    }


    /**
     * Gets the identificativoIntermediarioPSP value for this PaaAttivaRPT.
     * 
     * @return identificativoIntermediarioPSP
     */
    public java.lang.String getIdentificativoIntermediarioPSP() {
        return identificativoIntermediarioPSP;
    }


    /**
     * Sets the identificativoIntermediarioPSP value for this PaaAttivaRPT.
     * 
     * @param identificativoIntermediarioPSP
     */
    public void setIdentificativoIntermediarioPSP(java.lang.String identificativoIntermediarioPSP) {
        this.identificativoIntermediarioPSP = identificativoIntermediarioPSP;
    }


    /**
     * Gets the identificativoCanalePSP value for this PaaAttivaRPT.
     * 
     * @return identificativoCanalePSP
     */
    public java.lang.String getIdentificativoCanalePSP() {
        return identificativoCanalePSP;
    }


    /**
     * Sets the identificativoCanalePSP value for this PaaAttivaRPT.
     * 
     * @param identificativoCanalePSP
     */
    public void setIdentificativoCanalePSP(java.lang.String identificativoCanalePSP) {
        this.identificativoCanalePSP = identificativoCanalePSP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaAttivaRPT)) return false;
        PaaAttivaRPT other = (PaaAttivaRPT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificativoPSP==null && other.getIdentificativoPSP()==null) || 
             (this.identificativoPSP!=null &&
              this.identificativoPSP.equals(other.getIdentificativoPSP()))) &&
            ((this.datiPagamentoPSP==null && other.getDatiPagamentoPSP()==null) || 
             (this.datiPagamentoPSP!=null &&
              this.datiPagamentoPSP.equals(other.getDatiPagamentoPSP()))) &&
            ((this.identificativoIntermediarioPSP==null && other.getIdentificativoIntermediarioPSP()==null) || 
             (this.identificativoIntermediarioPSP!=null &&
              this.identificativoIntermediarioPSP.equals(other.getIdentificativoIntermediarioPSP()))) &&
            ((this.identificativoCanalePSP==null && other.getIdentificativoCanalePSP()==null) || 
             (this.identificativoCanalePSP!=null &&
              this.identificativoCanalePSP.equals(other.getIdentificativoCanalePSP())));
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
        if (getIdentificativoPSP() != null) {
            _hashCode += getIdentificativoPSP().hashCode();
        }
        if (getDatiPagamentoPSP() != null) {
            _hashCode += getDatiPagamentoPSP().hashCode();
        }
        if (getIdentificativoIntermediarioPSP() != null) {
            _hashCode += getIdentificativoIntermediarioPSP().hashCode();
        }
        if (getIdentificativoCanalePSP() != null) {
            _hashCode += getIdentificativoCanalePSP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaAttivaRPT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaAttivaRPT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoPSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoPSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datiPagamentoPSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datiPagamentoPSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaTipoDatiPagamentoPSP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoIntermediarioPSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoIntermediarioPSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoCanalePSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoCanalePSP"));
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
