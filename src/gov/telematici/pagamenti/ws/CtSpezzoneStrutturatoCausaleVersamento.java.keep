/**
 * CtSpezzoneStrutturatoCausaleVersamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class CtSpezzoneStrutturatoCausaleVersamento  implements java.io.Serializable {
    private java.lang.String causaleSpezzone;

    private java.math.BigDecimal importoSpezzone;

    public CtSpezzoneStrutturatoCausaleVersamento() {
    }

    public CtSpezzoneStrutturatoCausaleVersamento(
           java.lang.String causaleSpezzone,
           java.math.BigDecimal importoSpezzone) {
           this.causaleSpezzone = causaleSpezzone;
           this.importoSpezzone = importoSpezzone;
    }


    /**
     * Gets the causaleSpezzone value for this CtSpezzoneStrutturatoCausaleVersamento.
     * 
     * @return causaleSpezzone
     */
    public java.lang.String getCausaleSpezzone() {
        return causaleSpezzone;
    }


    /**
     * Sets the causaleSpezzone value for this CtSpezzoneStrutturatoCausaleVersamento.
     * 
     * @param causaleSpezzone
     */
    public void setCausaleSpezzone(java.lang.String causaleSpezzone) {
        this.causaleSpezzone = causaleSpezzone;
    }


    /**
     * Gets the importoSpezzone value for this CtSpezzoneStrutturatoCausaleVersamento.
     * 
     * @return importoSpezzone
     */
    public java.math.BigDecimal getImportoSpezzone() {
        return importoSpezzone;
    }


    /**
     * Sets the importoSpezzone value for this CtSpezzoneStrutturatoCausaleVersamento.
     * 
     * @param importoSpezzone
     */
    public void setImportoSpezzone(java.math.BigDecimal importoSpezzone) {
        this.importoSpezzone = importoSpezzone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtSpezzoneStrutturatoCausaleVersamento)) return false;
        CtSpezzoneStrutturatoCausaleVersamento other = (CtSpezzoneStrutturatoCausaleVersamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causaleSpezzone==null && other.getCausaleSpezzone()==null) || 
             (this.causaleSpezzone!=null &&
              this.causaleSpezzone.equals(other.getCausaleSpezzone()))) &&
            ((this.importoSpezzone==null && other.getImportoSpezzone()==null) || 
             (this.importoSpezzone!=null &&
              this.importoSpezzone.equals(other.getImportoSpezzone())));
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
        if (getCausaleSpezzone() != null) {
            _hashCode += getCausaleSpezzone().hashCode();
        }
        if (getImportoSpezzone() != null) {
            _hashCode += getImportoSpezzone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtSpezzoneStrutturatoCausaleVersamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "ctSpezzoneStrutturatoCausaleVersamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleSpezzone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causaleSpezzone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoSpezzone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importoSpezzone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
