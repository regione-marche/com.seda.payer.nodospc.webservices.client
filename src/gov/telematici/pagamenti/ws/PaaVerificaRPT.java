/**
 * PaaVerificaRPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaVerificaRPT  implements java.io.Serializable {
    private java.lang.String identificativoPSP;

    public PaaVerificaRPT() {
    }

    public PaaVerificaRPT(
           java.lang.String identificativoPSP) {
           this.identificativoPSP = identificativoPSP;
    }


    /**
     * Gets the identificativoPSP value for this PaaVerificaRPT.
     * 
     * @return identificativoPSP
     */
    public java.lang.String getIdentificativoPSP() {
        return identificativoPSP;
    }


    /**
     * Sets the identificativoPSP value for this PaaVerificaRPT.
     * 
     * @param identificativoPSP
     */
    public void setIdentificativoPSP(java.lang.String identificativoPSP) {
        this.identificativoPSP = identificativoPSP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaVerificaRPT)) return false;
        PaaVerificaRPT other = (PaaVerificaRPT) obj;
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
              this.identificativoPSP.equals(other.getIdentificativoPSP())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaVerificaRPT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaVerificaRPT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoPSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoPSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
