/**
 * PaaTipoDatiPagamentoPA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaTipoDatiPagamentoPA  implements java.io.Serializable {
    private java.math.BigDecimal importoSingoloVersamento;

    private java.lang.String ibanAccredito;

    private java.lang.String bicAccredito;

    private it.gov.digitpa.www.schemas._2011.Pagamenti.CtEnteBeneficiario enteBeneficiario;

    private java.lang.String credenzialiPagatore;

    private java.lang.String causaleVersamento;

    private gov.telematici.pagamenti.ws.CtSpezzoniCausaleVersamento spezzoniCausaleVersamento;

    public PaaTipoDatiPagamentoPA() {
    }

    public PaaTipoDatiPagamentoPA(
           java.math.BigDecimal importoSingoloVersamento,
           java.lang.String ibanAccredito,
           java.lang.String bicAccredito,
           it.gov.digitpa.www.schemas._2011.Pagamenti.CtEnteBeneficiario enteBeneficiario,
           java.lang.String credenzialiPagatore,
           java.lang.String causaleVersamento,
           gov.telematici.pagamenti.ws.CtSpezzoniCausaleVersamento spezzoniCausaleVersamento) {
           this.importoSingoloVersamento = importoSingoloVersamento;
           this.ibanAccredito = ibanAccredito;
           this.bicAccredito = bicAccredito;
           this.enteBeneficiario = enteBeneficiario;
           this.credenzialiPagatore = credenzialiPagatore;
           this.causaleVersamento = causaleVersamento;
           this.spezzoniCausaleVersamento = spezzoniCausaleVersamento;
    }


    /**
     * Gets the importoSingoloVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @return importoSingoloVersamento
     */
    public java.math.BigDecimal getImportoSingoloVersamento() {
        return importoSingoloVersamento;
    }


    /**
     * Sets the importoSingoloVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @param importoSingoloVersamento
     */
    public void setImportoSingoloVersamento(java.math.BigDecimal importoSingoloVersamento) {
        this.importoSingoloVersamento = importoSingoloVersamento;
    }


    /**
     * Gets the ibanAccredito value for this PaaTipoDatiPagamentoPA.
     * 
     * @return ibanAccredito
     */
    public java.lang.String getIbanAccredito() {
        return ibanAccredito;
    }


    /**
     * Sets the ibanAccredito value for this PaaTipoDatiPagamentoPA.
     * 
     * @param ibanAccredito
     */
    public void setIbanAccredito(java.lang.String ibanAccredito) {
        this.ibanAccredito = ibanAccredito;
    }


    /**
     * Gets the bicAccredito value for this PaaTipoDatiPagamentoPA.
     * 
     * @return bicAccredito
     */
    public java.lang.String getBicAccredito() {
        return bicAccredito;
    }


    /**
     * Sets the bicAccredito value for this PaaTipoDatiPagamentoPA.
     * 
     * @param bicAccredito
     */
    public void setBicAccredito(java.lang.String bicAccredito) {
        this.bicAccredito = bicAccredito;
    }


    /**
     * Gets the enteBeneficiario value for this PaaTipoDatiPagamentoPA.
     * 
     * @return enteBeneficiario
     */
    public it.gov.digitpa.www.schemas._2011.Pagamenti.CtEnteBeneficiario getEnteBeneficiario() {
        return enteBeneficiario;
    }


    /**
     * Sets the enteBeneficiario value for this PaaTipoDatiPagamentoPA.
     * 
     * @param enteBeneficiario
     */
    public void setEnteBeneficiario(it.gov.digitpa.www.schemas._2011.Pagamenti.CtEnteBeneficiario enteBeneficiario) {
        this.enteBeneficiario = enteBeneficiario;
    }


    /**
     * Gets the credenzialiPagatore value for this PaaTipoDatiPagamentoPA.
     * 
     * @return credenzialiPagatore
     */
    public java.lang.String getCredenzialiPagatore() {
        return credenzialiPagatore;
    }


    /**
     * Sets the credenzialiPagatore value for this PaaTipoDatiPagamentoPA.
     * 
     * @param credenzialiPagatore
     */
    public void setCredenzialiPagatore(java.lang.String credenzialiPagatore) {
        this.credenzialiPagatore = credenzialiPagatore;
    }


    /**
     * Gets the causaleVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @return causaleVersamento
     */
    public java.lang.String getCausaleVersamento() {
        return causaleVersamento;
    }


    /**
     * Sets the causaleVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @param causaleVersamento
     */
    public void setCausaleVersamento(java.lang.String causaleVersamento) {
        this.causaleVersamento = causaleVersamento;
    }


    /**
     * Gets the spezzoniCausaleVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @return spezzoniCausaleVersamento
     */
    public gov.telematici.pagamenti.ws.CtSpezzoniCausaleVersamento getSpezzoniCausaleVersamento() {
        return spezzoniCausaleVersamento;
    }


    /**
     * Sets the spezzoniCausaleVersamento value for this PaaTipoDatiPagamentoPA.
     * 
     * @param spezzoniCausaleVersamento
     */
    public void setSpezzoniCausaleVersamento(gov.telematici.pagamenti.ws.CtSpezzoniCausaleVersamento spezzoniCausaleVersamento) {
        this.spezzoniCausaleVersamento = spezzoniCausaleVersamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaTipoDatiPagamentoPA)) return false;
        PaaTipoDatiPagamentoPA other = (PaaTipoDatiPagamentoPA) obj;
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
            ((this.ibanAccredito==null && other.getIbanAccredito()==null) || 
             (this.ibanAccredito!=null &&
              this.ibanAccredito.equals(other.getIbanAccredito()))) &&
            ((this.bicAccredito==null && other.getBicAccredito()==null) || 
             (this.bicAccredito!=null &&
              this.bicAccredito.equals(other.getBicAccredito()))) &&
            ((this.enteBeneficiario==null && other.getEnteBeneficiario()==null) || 
             (this.enteBeneficiario!=null &&
              this.enteBeneficiario.equals(other.getEnteBeneficiario()))) &&
            ((this.credenzialiPagatore==null && other.getCredenzialiPagatore()==null) || 
             (this.credenzialiPagatore!=null &&
              this.credenzialiPagatore.equals(other.getCredenzialiPagatore()))) &&
            ((this.causaleVersamento==null && other.getCausaleVersamento()==null) || 
             (this.causaleVersamento!=null &&
              this.causaleVersamento.equals(other.getCausaleVersamento()))) &&
            ((this.spezzoniCausaleVersamento==null && other.getSpezzoniCausaleVersamento()==null) || 
             (this.spezzoniCausaleVersamento!=null &&
              this.spezzoniCausaleVersamento.equals(other.getSpezzoniCausaleVersamento())));
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
        if (getIbanAccredito() != null) {
            _hashCode += getIbanAccredito().hashCode();
        }
        if (getBicAccredito() != null) {
            _hashCode += getBicAccredito().hashCode();
        }
        if (getEnteBeneficiario() != null) {
            _hashCode += getEnteBeneficiario().hashCode();
        }
        if (getCredenzialiPagatore() != null) {
            _hashCode += getCredenzialiPagatore().hashCode();
        }
        if (getCausaleVersamento() != null) {
            _hashCode += getCausaleVersamento().hashCode();
        }
        if (getSpezzoniCausaleVersamento() != null) {
            _hashCode += getSpezzoniCausaleVersamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaTipoDatiPagamentoPA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaTipoDatiPagamentoPA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoSingoloVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importoSingoloVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanAccredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanAccredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bicAccredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bicAccredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enteBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enteBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "ctEnteBeneficiario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenzialiPagatore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenzialiPagatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causaleVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spezzoniCausaleVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spezzoniCausaleVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "ctSpezzoniCausaleVersamento"));
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
