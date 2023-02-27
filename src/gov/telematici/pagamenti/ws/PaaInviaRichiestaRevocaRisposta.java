/**
 * PaaInviaRichiestaRevocaRisposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class PaaInviaRichiestaRevocaRisposta  implements java.io.Serializable {
    private gov.telematici.pagamenti.ws.TipoInviaRichiestaRevocaRisposta paaInviaRichiestaRevocaRisposta;

    public PaaInviaRichiestaRevocaRisposta() {
    	super(); //inserito per utilizzare jaxb
    }

    public PaaInviaRichiestaRevocaRisposta(
           gov.telematici.pagamenti.ws.TipoInviaRichiestaRevocaRisposta paaInviaRichiestaRevocaRisposta) {
           this.paaInviaRichiestaRevocaRisposta = paaInviaRichiestaRevocaRisposta;
    }


    /**
     * Gets the paaInviaRichiestaRevocaRisposta value for this PaaInviaRichiestaRevocaRisposta.
     * 
     * @return paaInviaRichiestaRevocaRisposta
     */
    public gov.telematici.pagamenti.ws.TipoInviaRichiestaRevocaRisposta getPaaInviaRichiestaRevocaRisposta() {
        return paaInviaRichiestaRevocaRisposta;
    }


    /**
     * Sets the paaInviaRichiestaRevocaRisposta value for this PaaInviaRichiestaRevocaRisposta.
     * 
     * @param paaInviaRichiestaRevocaRisposta
     */
    public void setPaaInviaRichiestaRevocaRisposta(gov.telematici.pagamenti.ws.TipoInviaRichiestaRevocaRisposta paaInviaRichiestaRevocaRisposta) {
        this.paaInviaRichiestaRevocaRisposta = paaInviaRichiestaRevocaRisposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaInviaRichiestaRevocaRisposta)) return false;
        PaaInviaRichiestaRevocaRisposta other = (PaaInviaRichiestaRevocaRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paaInviaRichiestaRevocaRisposta==null && other.getPaaInviaRichiestaRevocaRisposta()==null) || 
             (this.paaInviaRichiestaRevocaRisposta!=null &&
              this.paaInviaRichiestaRevocaRisposta.equals(other.getPaaInviaRichiestaRevocaRisposta())));
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
        if (getPaaInviaRichiestaRevocaRisposta() != null) {
            _hashCode += getPaaInviaRichiestaRevocaRisposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaInviaRichiestaRevocaRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaInviaRichiestaRevocaRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paaInviaRichiestaRevocaRisposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paaInviaRichiestaRevocaRisposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "tipoInviaRichiestaRevocaRisposta"));
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
