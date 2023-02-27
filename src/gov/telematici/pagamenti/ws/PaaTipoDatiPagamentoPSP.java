/**
 * PaaTipoDatiPagamentoPSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaTipoDatiPagamentoPSP  implements java.io.Serializable {
    private java.math.BigDecimal importoSingoloVersamento;

    private java.lang.String ibanAppoggio;

    private java.lang.String bicAppoggio;

    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoVersante soggettoVersante;

    private java.lang.String ibanAddebito;

    private java.lang.String bicAddebito;

    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoPagatore soggettoPagatore;

    public PaaTipoDatiPagamentoPSP() {
    }

    public PaaTipoDatiPagamentoPSP(
           java.math.BigDecimal importoSingoloVersamento,
           java.lang.String ibanAppoggio,
           java.lang.String bicAppoggio,
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoVersante soggettoVersante,
           java.lang.String ibanAddebito,
           java.lang.String bicAddebito,
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoPagatore soggettoPagatore) {
           this.importoSingoloVersamento = importoSingoloVersamento;
           this.ibanAppoggio = ibanAppoggio;
           this.bicAppoggio = bicAppoggio;
           this.soggettoVersante = soggettoVersante;
           this.ibanAddebito = ibanAddebito;
           this.bicAddebito = bicAddebito;
           this.soggettoPagatore = soggettoPagatore;
    }


    /**
     * Gets the importoSingoloVersamento value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return importoSingoloVersamento
     */
    public java.math.BigDecimal getImportoSingoloVersamento() {
        return importoSingoloVersamento;
    }


    /**
     * Sets the importoSingoloVersamento value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param importoSingoloVersamento
     */
    public void setImportoSingoloVersamento(java.math.BigDecimal importoSingoloVersamento) {
        this.importoSingoloVersamento = importoSingoloVersamento;
    }


    /**
     * Gets the ibanAppoggio value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return ibanAppoggio
     */
    public java.lang.String getIbanAppoggio() {
        return ibanAppoggio;
    }


    /**
     * Sets the ibanAppoggio value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param ibanAppoggio
     */
    public void setIbanAppoggio(java.lang.String ibanAppoggio) {
        this.ibanAppoggio = ibanAppoggio;
    }


    /**
     * Gets the bicAppoggio value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return bicAppoggio
     */
    public java.lang.String getBicAppoggio() {
        return bicAppoggio;
    }


    /**
     * Sets the bicAppoggio value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param bicAppoggio
     */
    public void setBicAppoggio(java.lang.String bicAppoggio) {
        this.bicAppoggio = bicAppoggio;
    }


    /**
     * Gets the soggettoVersante value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return soggettoVersante
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoVersante getSoggettoVersante() {
        return soggettoVersante;
    }


    /**
     * Sets the soggettoVersante value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param soggettoVersante
     */
    public void setSoggettoVersante(it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoVersante soggettoVersante) {
        this.soggettoVersante = soggettoVersante;
    }


    /**
     * Gets the ibanAddebito value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return ibanAddebito
     */
    public java.lang.String getIbanAddebito() {
        return ibanAddebito;
    }


    /**
     * Sets the ibanAddebito value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param ibanAddebito
     */
    public void setIbanAddebito(java.lang.String ibanAddebito) {
        this.ibanAddebito = ibanAddebito;
    }


    /**
     * Gets the bicAddebito value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return bicAddebito
     */
    public java.lang.String getBicAddebito() {
        return bicAddebito;
    }


    /**
     * Sets the bicAddebito value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param bicAddebito
     */
    public void setBicAddebito(java.lang.String bicAddebito) {
        this.bicAddebito = bicAddebito;
    }


    /**
     * Gets the soggettoPagatore value for this PaaTipoDatiPagamentoPSP.
     * 
     * @return soggettoPagatore
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoPagatore getSoggettoPagatore() {
        return soggettoPagatore;
    }


    /**
     * Sets the soggettoPagatore value for this PaaTipoDatiPagamentoPSP.
     * 
     * @param soggettoPagatore
     */
    public void setSoggettoPagatore(it.gov.digitpa.www.schemas._2011.Pagamenti.CtSoggettoPagatore soggettoPagatore) {
        this.soggettoPagatore = soggettoPagatore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaTipoDatiPagamentoPSP)) return false;
        PaaTipoDatiPagamentoPSP other = (PaaTipoDatiPagamentoPSP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importoSingoloVersamento==null && other.getImportoSingoloVersamento()==null) || 
             (this.importoSingoloVersamento!=null &&
              this.importoSingoloVersamento.equals(other.getImportoSingoloVersamento()))) &&
            ((this.ibanAppoggio==null && other.getIbanAppoggio()==null) || 
             (this.ibanAppoggio!=null &&
              this.ibanAppoggio.equals(other.getIbanAppoggio()))) &&
            ((this.bicAppoggio==null && other.getBicAppoggio()==null) || 
             (this.bicAppoggio!=null &&
              this.bicAppoggio.equals(other.getBicAppoggio()))) &&
            ((this.soggettoVersante==null && other.getSoggettoVersante()==null) || 
             (this.soggettoVersante!=null &&
              this.soggettoVersante.equals(other.getSoggettoVersante()))) &&
            ((this.ibanAddebito==null && other.getIbanAddebito()==null) || 
             (this.ibanAddebito!=null &&
              this.ibanAddebito.equals(other.getIbanAddebito()))) &&
            ((this.bicAddebito==null && other.getBicAddebito()==null) || 
             (this.bicAddebito!=null &&
              this.bicAddebito.equals(other.getBicAddebito()))) &&
            ((this.soggettoPagatore==null && other.getSoggettoPagatore()==null) || 
             (this.soggettoPagatore!=null &&
              this.soggettoPagatore.equals(other.getSoggettoPagatore())));
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
        if (getImportoSingoloVersamento() != null) {
            _hashCode += getImportoSingoloVersamento().hashCode();
        }
        if (getIbanAppoggio() != null) {
            _hashCode += getIbanAppoggio().hashCode();
        }
        if (getBicAppoggio() != null) {
            _hashCode += getBicAppoggio().hashCode();
        }
        if (getSoggettoVersante() != null) {
            _hashCode += getSoggettoVersante().hashCode();
        }
        if (getIbanAddebito() != null) {
            _hashCode += getIbanAddebito().hashCode();
        }
        if (getBicAddebito() != null) {
            _hashCode += getBicAddebito().hashCode();
        }
        if (getSoggettoPagatore() != null) {
            _hashCode += getSoggettoPagatore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaTipoDatiPagamentoPSP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaTipoDatiPagamentoPSP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoSingoloVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importoSingoloVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanAppoggio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanAppoggio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bicAppoggio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bicAppoggio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soggettoVersante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soggettoVersante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctSoggettoVersante"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanAddebito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanAddebito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bicAddebito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bicAddebito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soggettoPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soggettoPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctSoggettoPagatore"));
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
