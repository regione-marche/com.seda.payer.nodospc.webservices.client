/**
 * PaaInviaRT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.telematici.pagamenti.ws;

public class PaaInviaEsitoStorno  implements java.io.Serializable {
    private java.lang.String identificativoIntermediarioPA;
    
    private java.lang.String identificativoStazioneIntermediarioPA;
    
    private java.lang.String identificativoDominio;
    
    private java.lang.String identificativoUnivocoVersamento;
    
    private java.lang.String codiceContestoPagamento;
    
    private byte[] er;

    public PaaInviaEsitoStorno() {
    }

    public PaaInviaEsitoStorno(String identificativoIntermediarioPA,
			String identificativoStazioneIntermediarioPA,
			String identificativoDominio,
			String identificativoUnivocoVersamento,
			String codiceContestoPagamento, byte[] er) {
		super();
		this.identificativoIntermediarioPA = identificativoIntermediarioPA;
		this.identificativoStazioneIntermediarioPA = identificativoStazioneIntermediarioPA;
		this.identificativoDominio = identificativoDominio;
		this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
		this.codiceContestoPagamento = codiceContestoPagamento;
		this.er = er;
	}

    

	public java.lang.String getIdentificativoIntermediarioPA() {
		return identificativoIntermediarioPA;
	}

	public void setIdentificativoIntermediarioPA(
			java.lang.String identificativoIntermediarioPA) {
		this.identificativoIntermediarioPA = identificativoIntermediarioPA;
	}

	public java.lang.String getIdentificativoStazioneIntermediarioPA() {
		return identificativoStazioneIntermediarioPA;
	}

	public void setIdentificativoStazioneIntermediarioPA(
			java.lang.String identificativoStazioneIntermediarioPA) {
		this.identificativoStazioneIntermediarioPA = identificativoStazioneIntermediarioPA;
	}

	public java.lang.String getIdentificativoDominio() {
		return identificativoDominio;
	}

	public void setIdentificativoDominio(java.lang.String identificativoDominio) {
		this.identificativoDominio = identificativoDominio;
	}

	public java.lang.String getIdentificativoUnivocoVersamento() {
		return identificativoUnivocoVersamento;
	}

	public void setIdentificativoUnivocoVersamento(
			java.lang.String identificativoUnivocoVersamento) {
		this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
	}

	public java.lang.String getCodiceContestoPagamento() {
		return codiceContestoPagamento;
	}

	public void setCodiceContestoPagamento(java.lang.String codiceContestoPagamento) {
		this.codiceContestoPagamento = codiceContestoPagamento;
	}

	public byte[] getEr() {
		return er;
	}

	public void setEr(byte[] er) {
		this.er = er;
	}



	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaaInviaEsitoStorno)) return false;
        PaaInviaEsitoStorno other = (PaaInviaEsitoStorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificativoIntermediarioPA==null && other.getIdentificativoIntermediarioPA()==null) || 
             (this.identificativoIntermediarioPA!=null &&
              this.identificativoIntermediarioPA.equals(other.getIdentificativoIntermediarioPA()))) &&
             ((this.identificativoStazioneIntermediarioPA==null && other.getIdentificativoStazioneIntermediarioPA()==null) || 
                  (this.identificativoStazioneIntermediarioPA!=null &&
                   this.identificativoStazioneIntermediarioPA.equals(other.getIdentificativoStazioneIntermediarioPA()))) &&  
             ((this.identificativoDominio==null && other.getIdentificativoDominio()==null) || 
                   (this.identificativoDominio!=null &&
                    this.identificativoDominio.equals(other.getIdentificativoDominio()))) &&       
             ((this.identificativoUnivocoVersamento==null && other.getIdentificativoUnivocoVersamento()==null) || 
                    (this.identificativoUnivocoVersamento!=null &&
                     this.identificativoUnivocoVersamento.equals(other.getIdentificativoUnivocoVersamento()))) &&
             ((this.codiceContestoPagamento==null && other.getCodiceContestoPagamento()==null) || 
                     (this.codiceContestoPagamento!=null &&
                      this.codiceContestoPagamento.equals(other.getCodiceContestoPagamento()))) &&
            ((this.er==null && other.getEr()==null) || 
             (this.er!=null &&
              java.util.Arrays.equals(this.er, other.getEr())));
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
        if (getIdentificativoIntermediarioPA() != null) {
            _hashCode += getIdentificativoIntermediarioPA().hashCode();
        }
        if (getIdentificativoStazioneIntermediarioPA() != null) {
            _hashCode += getIdentificativoStazioneIntermediarioPA().hashCode();
        }
        if (getIdentificativoDominio() != null) {
            _hashCode += getIdentificativoDominio().hashCode();
        }
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        if (getCodiceContestoPagamento() != null) {
            _hashCode += getCodiceContestoPagamento().hashCode();
        }
        if (getEr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaaInviaEsitoStorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pagamenti.telematici.gov/", "paaInviaEsitoStorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoIntermediarioPA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoIntermediarioPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoStazioneIntermediarioPA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoStazioneIntermediarioPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoDominio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoDominio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificativoUnivocoVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceContestoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceContestoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("er");
        elemField.setXmlName(new javax.xml.namespace.QName("", "er"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
