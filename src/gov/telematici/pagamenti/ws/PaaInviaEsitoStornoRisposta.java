package gov.telematici.pagamenti.ws;

public class PaaInviaEsitoStornoRisposta  implements java.io.Serializable {
    private gov.telematici.pagamenti.ws.TipoInviaEsitoStornoRisposta paaInviaEsitoStornoRisposta;

    public PaaInviaEsitoStornoRisposta() {
    }

    public PaaInviaEsitoStornoRisposta(
           gov.telematici.pagamenti.ws.TipoInviaEsitoStornoRisposta paaInviaEsitoStornoRisposta) {
           this.paaInviaEsitoStornoRisposta = paaInviaEsitoStornoRisposta;
    }
   
    public gov.telematici.pagamenti.ws.TipoInviaEsitoStornoRisposta getPaaInviaEsitoStornoRisposta() {
		return paaInviaEsitoStornoRisposta;
	}

	public void setPaaInviaEsitoStornoRisposta(
			gov.telematici.pagamenti.ws.TipoInviaEsitoStornoRisposta paaInviaEsitoStornoRisposta) {
		this.paaInviaEsitoStornoRisposta = paaInviaEsitoStornoRisposta;
	}

	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaInviaEsitoStornoRisposta)) return false;
        PaaInviaEsitoStornoRisposta other = (PaaInviaEsitoStornoRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paaInviaEsitoStornoRisposta==null && other.getPaaInviaEsitoStornoRisposta()==null) || 
             (this.paaInviaEsitoStornoRisposta!=null &&
              this.paaInviaEsitoStornoRisposta.equals(other.getPaaInviaEsitoStornoRisposta())));
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
        if (getPaaInviaEsitoStornoRisposta() != null) {
            _hashCode += getPaaInviaEsitoStornoRisposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaInviaEsitoStornoRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaInviaEsitoStornoRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paaInviaEsitoStornoRisposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaInviaEsitoStornoRisposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "tipoInviaEsitoStornoRisposta"));
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
