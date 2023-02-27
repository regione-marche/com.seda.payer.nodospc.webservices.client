/**
 * CtSpezzoniCausaleVersamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class CtSpezzoniCausaleVersamento  implements java.io.Serializable {
    private java.lang.String spezzoneCausaleVersamento;

    private gov.telematici.pagamenti.ws.CtSpezzoneStrutturatoCausaleVersamento spezzoneStrutturatoCausaleVersamento;

    public CtSpezzoniCausaleVersamento() {
    }

    public CtSpezzoniCausaleVersamento(
           java.lang.String spezzoneCausaleVersamento,
           gov.telematici.pagamenti.ws.CtSpezzoneStrutturatoCausaleVersamento spezzoneStrutturatoCausaleVersamento) {
           this.spezzoneCausaleVersamento = spezzoneCausaleVersamento;
           this.spezzoneStrutturatoCausaleVersamento = spezzoneStrutturatoCausaleVersamento;
    }


    /**
     * Gets the spezzoneCausaleVersamento value for this CtSpezzoniCausaleVersamento.
     * 
     * @return spezzoneCausaleVersamento
     */
    public java.lang.String getSpezzoneCausaleVersamento() {
        return spezzoneCausaleVersamento;
    }


    /**
     * Sets the spezzoneCausaleVersamento value for this CtSpezzoniCausaleVersamento.
     * 
     * @param spezzoneCausaleVersamento
     */
    public void setSpezzoneCausaleVersamento(java.lang.String spezzoneCausaleVersamento) {
        this.spezzoneCausaleVersamento = spezzoneCausaleVersamento;
    }


    /**
     * Gets the spezzoneStrutturatoCausaleVersamento value for this CtSpezzoniCausaleVersamento.
     * 
     * @return spezzoneStrutturatoCausaleVersamento
     */
    public gov.telematici.pagamenti.ws.CtSpezzoneStrutturatoCausaleVersamento getSpezzoneStrutturatoCausaleVersamento() {
        return spezzoneStrutturatoCausaleVersamento;
    }


    /**
     * Sets the spezzoneStrutturatoCausaleVersamento value for this CtSpezzoniCausaleVersamento.
     * 
     * @param spezzoneStrutturatoCausaleVersamento
     */
    public void setSpezzoneStrutturatoCausaleVersamento(gov.telematici.pagamenti.ws.CtSpezzoneStrutturatoCausaleVersamento spezzoneStrutturatoCausaleVersamento) {
        this.spezzoneStrutturatoCausaleVersamento = spezzoneStrutturatoCausaleVersamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtSpezzoniCausaleVersamento)) return false;
        CtSpezzoniCausaleVersamento other = (CtSpezzoniCausaleVersamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.spezzoneCausaleVersamento==null && other.getSpezzoneCausaleVersamento()==null) || 
             (this.spezzoneCausaleVersamento!=null &&
              this.spezzoneCausaleVersamento.equals(other.getSpezzoneCausaleVersamento()))) &&
            ((this.spezzoneStrutturatoCausaleVersamento==null && other.getSpezzoneStrutturatoCausaleVersamento()==null) || 
             (this.spezzoneStrutturatoCausaleVersamento!=null &&
              this.spezzoneStrutturatoCausaleVersamento.equals(other.getSpezzoneStrutturatoCausaleVersamento())));
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
        if (getSpezzoneCausaleVersamento() != null) {
            _hashCode += getSpezzoneCausaleVersamento().hashCode();
        }
        if (getSpezzoneStrutturatoCausaleVersamento() != null) {
            _hashCode += getSpezzoneStrutturatoCausaleVersamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtSpezzoniCausaleVersamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "ctSpezzoniCausaleVersamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spezzoneCausaleVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spezzoneCausaleVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spezzoneStrutturatoCausaleVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spezzoneStrutturatoCausaleVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "ctSpezzoneStrutturatoCausaleVersamento"));
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
