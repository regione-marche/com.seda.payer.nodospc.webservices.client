/**
 * EsitoVerificaRPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class EsitoVerificaRPT  extends gov.telematici.pagamenti.ws.Risposta  implements java.io.Serializable {
    private java.lang.String esito;

    private gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPA datiPagamentoPA;

    public EsitoVerificaRPT() {
    }

    public EsitoVerificaRPT(
           gov.telematici.pagamenti.ws.FaultBean fault,
           java.lang.String esito,
           gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPA datiPagamentoPA) {
        super(
            fault);
        this.esito = esito;
        this.datiPagamentoPA = datiPagamentoPA;
    }


    /**
     * Gets the esito value for this EsitoVerificaRPT.
     * 
     * @return esito
     */
    public java.lang.String getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this EsitoVerificaRPT.
     * 
     * @param esito
     */
    public void setEsito(java.lang.String esito) {
        this.esito = esito;
    }


    /**
     * Gets the datiPagamentoPA value for this EsitoVerificaRPT.
     * 
     * @return datiPagamentoPA
     */
    public gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPA getDatiPagamentoPA() {
        return datiPagamentoPA;
    }


    /**
     * Sets the datiPagamentoPA value for this EsitoVerificaRPT.
     * 
     * @param datiPagamentoPA
     */
    public void setDatiPagamentoPA(gov.telematici.pagamenti.ws.PaaTipoDatiPagamentoPA datiPagamentoPA) {
        this.datiPagamentoPA = datiPagamentoPA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EsitoVerificaRPT)) return false;
        EsitoVerificaRPT other = (EsitoVerificaRPT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.datiPagamentoPA==null && other.getDatiPagamentoPA()==null) || 
             (this.datiPagamentoPA!=null &&
              this.datiPagamentoPA.equals(other.getDatiPagamentoPA())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getDatiPagamentoPA() != null) {
            _hashCode += getDatiPagamentoPA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EsitoVerificaRPT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "esitoVerificaRPT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datiPagamentoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datiPagamentoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaTipoDatiPagamentoPA"));
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
