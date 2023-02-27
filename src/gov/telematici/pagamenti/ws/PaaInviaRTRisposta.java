/**
 * PaaInviaRTRisposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaInviaRTRisposta  implements java.io.Serializable {
    private gov.telematici.pagamenti.ws.EsitoPaaInviaRT paaInviaRTRisposta;

    public PaaInviaRTRisposta() {
    }

    public PaaInviaRTRisposta(
           gov.telematici.pagamenti.ws.EsitoPaaInviaRT paaInviaRTRisposta) {
           this.paaInviaRTRisposta = paaInviaRTRisposta;
    }


    /**
     * Gets the paaInviaRTRisposta value for this PaaInviaRTRisposta.
     * 
     * @return paaInviaRTRisposta
     */
    public gov.telematici.pagamenti.ws.EsitoPaaInviaRT getPaaInviaRTRisposta() {
        return paaInviaRTRisposta;
    }


    /**
     * Sets the paaInviaRTRisposta value for this PaaInviaRTRisposta.
     * 
     * @param paaInviaRTRisposta
     */
    public void setPaaInviaRTRisposta(gov.telematici.pagamenti.ws.EsitoPaaInviaRT paaInviaRTRisposta) {
        this.paaInviaRTRisposta = paaInviaRTRisposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaInviaRTRisposta)) return false;
        PaaInviaRTRisposta other = (PaaInviaRTRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paaInviaRTRisposta==null && other.getPaaInviaRTRisposta()==null) || 
             (this.paaInviaRTRisposta!=null &&
              this.paaInviaRTRisposta.equals(other.getPaaInviaRTRisposta())));
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
        if (getPaaInviaRTRisposta() != null) {
            _hashCode += getPaaInviaRTRisposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaInviaRTRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaInviaRTRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paaInviaRTRisposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paaInviaRTRisposta"));	//19062019 GG - eliminato namespace per distinzione tra nodi paaInviaRTRisposta interno ed esterno
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "esitoPaaInviaRT"));
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
