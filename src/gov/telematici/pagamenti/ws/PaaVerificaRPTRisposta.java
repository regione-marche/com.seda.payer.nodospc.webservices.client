/**
 * PaaVerificaRPTRisposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaVerificaRPTRisposta  implements java.io.Serializable {
    private gov.telematici.pagamenti.ws.EsitoVerificaRPT paaVerificaRPTRisposta;

    public PaaVerificaRPTRisposta() {
    }

    public PaaVerificaRPTRisposta(
           gov.telematici.pagamenti.ws.EsitoVerificaRPT paaVerificaRPTRisposta) {
           this.paaVerificaRPTRisposta = paaVerificaRPTRisposta;
    }


    /**
     * Gets the paaVerificaRPTRisposta value for this PaaVerificaRPTRisposta.
     * 
     * @return paaVerificaRPTRisposta
     */
    public gov.telematici.pagamenti.ws.EsitoVerificaRPT getPaaVerificaRPTRisposta() {
        return paaVerificaRPTRisposta;
    }


    /**
     * Sets the paaVerificaRPTRisposta value for this PaaVerificaRPTRisposta.
     * 
     * @param paaVerificaRPTRisposta
     */
    public void setPaaVerificaRPTRisposta(gov.telematici.pagamenti.ws.EsitoVerificaRPT paaVerificaRPTRisposta) {
        this.paaVerificaRPTRisposta = paaVerificaRPTRisposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaVerificaRPTRisposta)) return false;
        PaaVerificaRPTRisposta other = (PaaVerificaRPTRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paaVerificaRPTRisposta==null && other.getPaaVerificaRPTRisposta()==null) || 
             (this.paaVerificaRPTRisposta!=null &&
              this.paaVerificaRPTRisposta.equals(other.getPaaVerificaRPTRisposta())));
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
        if (getPaaVerificaRPTRisposta() != null) {
            _hashCode += getPaaVerificaRPTRisposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaVerificaRPTRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaVerificaRPTRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paaVerificaRPTRisposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paaVerificaRPTRisposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "esitoVerificaRPT"));
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
