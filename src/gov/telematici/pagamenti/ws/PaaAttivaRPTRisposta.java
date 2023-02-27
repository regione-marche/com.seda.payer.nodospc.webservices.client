/**
 * PaaAttivaRPTRisposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaAttivaRPTRisposta  implements java.io.Serializable {
    private gov.telematici.pagamenti.ws.EsitoAttivaRPT paaAttivaRPTRisposta;

    public PaaAttivaRPTRisposta() {
    }

    public PaaAttivaRPTRisposta(
           gov.telematici.pagamenti.ws.EsitoAttivaRPT paaAttivaRPTRisposta) {
           this.paaAttivaRPTRisposta = paaAttivaRPTRisposta;
    }


    /**
     * Gets the paaAttivaRPTRisposta value for this PaaAttivaRPTRisposta.
     * 
     * @return paaAttivaRPTRisposta
     */
    public gov.telematici.pagamenti.ws.EsitoAttivaRPT getPaaAttivaRPTRisposta() {
        return paaAttivaRPTRisposta;
    }


    /**
     * Sets the paaAttivaRPTRisposta value for this PaaAttivaRPTRisposta.
     * 
     * @param paaAttivaRPTRisposta
     */
    public void setPaaAttivaRPTRisposta(gov.telematici.pagamenti.ws.EsitoAttivaRPT paaAttivaRPTRisposta) {
        this.paaAttivaRPTRisposta = paaAttivaRPTRisposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaAttivaRPTRisposta)) return false;
        PaaAttivaRPTRisposta other = (PaaAttivaRPTRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paaAttivaRPTRisposta==null && other.getPaaAttivaRPTRisposta()==null) || 
             (this.paaAttivaRPTRisposta!=null &&
              this.paaAttivaRPTRisposta.equals(other.getPaaAttivaRPTRisposta())));
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
        if (getPaaAttivaRPTRisposta() != null) {
            _hashCode += getPaaAttivaRPTRisposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaAttivaRPTRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaAttivaRPTRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paaAttivaRPTRisposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paaAttivaRPTRisposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "esitoAttivaRPT"));
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
