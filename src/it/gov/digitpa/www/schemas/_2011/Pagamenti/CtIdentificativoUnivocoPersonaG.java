/**
 * CtIdentificativoUnivocoPersonaG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.digitpa.www.schemas._2011.Pagamenti;

public class CtIdentificativoUnivocoPersonaG  implements java.io.Serializable {
    /* Campo alfanumerico che indica la natura del soggetto,  può
     * assumere i seguenti valori: */
    private it.gov.digitpa.www.schemas._2011.Pagamenti.StTipoIdentificativoUnivocoPersG tipoIdentificativoUnivoco;

    /* Campo alfanumerico che può contenere il codice fiscale o, in
     * alternativa, la partita IVA del soggetto. */
    private java.lang.String codiceIdentificativoUnivoco;

    public CtIdentificativoUnivocoPersonaG() {
    }

    public CtIdentificativoUnivocoPersonaG(
           it.gov.digitpa.www.schemas._2011.Pagamenti.StTipoIdentificativoUnivocoPersG tipoIdentificativoUnivoco,
           java.lang.String codiceIdentificativoUnivoco) {
           this.tipoIdentificativoUnivoco = tipoIdentificativoUnivoco;
           this.codiceIdentificativoUnivoco = codiceIdentificativoUnivoco;
    }


    /**
     * Gets the tipoIdentificativoUnivoco value for this CtIdentificativoUnivocoPersonaG.
     * 
     * @return tipoIdentificativoUnivoco   * Campo alfanumerico che indica la natura del soggetto,  può
     * assumere i seguenti valori:
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.StTipoIdentificativoUnivocoPersG getTipoIdentificativoUnivoco() {
        return tipoIdentificativoUnivoco;
    }


    /**
     * Sets the tipoIdentificativoUnivoco value for this CtIdentificativoUnivocoPersonaG.
     * 
     * @param tipoIdentificativoUnivoco   * Campo alfanumerico che indica la natura del soggetto,  può
     * assumere i seguenti valori:
     */
    public void setTipoIdentificativoUnivoco(it.gov.digitpa.www.schemas._2011.Pagamenti.StTipoIdentificativoUnivocoPersG tipoIdentificativoUnivoco) {
        this.tipoIdentificativoUnivoco = tipoIdentificativoUnivoco;
    }


    /**
     * Gets the codiceIdentificativoUnivoco value for this CtIdentificativoUnivocoPersonaG.
     * 
     * @return codiceIdentificativoUnivoco   * Campo alfanumerico che può contenere il codice fiscale o, in
     * alternativa, la partita IVA del soggetto.
     */
    public java.lang.String getCodiceIdentificativoUnivoco() {
        return codiceIdentificativoUnivoco;
    }


    /**
     * Sets the codiceIdentificativoUnivoco value for this CtIdentificativoUnivocoPersonaG.
     * 
     * @param codiceIdentificativoUnivoco   * Campo alfanumerico che può contenere il codice fiscale o, in
     * alternativa, la partita IVA del soggetto.
     */
    public void setCodiceIdentificativoUnivoco(java.lang.String codiceIdentificativoUnivoco) {
        this.codiceIdentificativoUnivoco = codiceIdentificativoUnivoco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtIdentificativoUnivocoPersonaG)) return false;
        CtIdentificativoUnivocoPersonaG other = (CtIdentificativoUnivocoPersonaG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoIdentificativoUnivoco==null && other.getTipoIdentificativoUnivoco()==null) || 
             (this.tipoIdentificativoUnivoco!=null &&
              this.tipoIdentificativoUnivoco.equals(other.getTipoIdentificativoUnivoco()))) &&
            ((this.codiceIdentificativoUnivoco==null && other.getCodiceIdentificativoUnivoco()==null) || 
             (this.codiceIdentificativoUnivoco!=null &&
              this.codiceIdentificativoUnivoco.equals(other.getCodiceIdentificativoUnivoco())));
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
        if (getTipoIdentificativoUnivoco() != null) {
            _hashCode += getTipoIdentificativoUnivoco().hashCode();
        }
        if (getCodiceIdentificativoUnivoco() != null) {
            _hashCode += getCodiceIdentificativoUnivoco().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtIdentificativoUnivocoPersonaG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctIdentificativoUnivocoPersonaG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificativoUnivoco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "tipoIdentificativoUnivoco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "stTipoIdentificativoUnivocoPersG"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIdentificativoUnivoco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "codiceIdentificativoUnivoco"));
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
