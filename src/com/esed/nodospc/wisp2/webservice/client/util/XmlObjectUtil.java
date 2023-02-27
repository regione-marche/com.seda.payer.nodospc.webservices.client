package com.esed.nodospc.wisp2.webservice.client.util;

import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtDatiEsitoRevoca;
import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtDatiRevoca;
import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtDatiSingolaRevoca;
import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtDatiSingoloEsitoRevoca;
import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtEsitoRevoca;
import it.gov.digitpa.schemas._2011.pagamenti.revoche.CtRichiestaRevoca;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XmlObjectUtil {
	
	public static String getStringXMLofObject(Object obj) {
		String out = "";
	 	try {
	        if (obj instanceof CtRichiestaRevoca) {
	        	CtRichiestaRevoca in = (CtRichiestaRevoca) obj;
	        	it.gov.digitpa.schemas._2011.pagamenti.revoche.ObjectFactory objf = new it.gov.digitpa.schemas._2011.pagamenti.revoche.ObjectFactory();
	        	JAXBContext jc = JAXBContext.newInstance(CtRichiestaRevoca.class);
	        	JAXBElement<CtRichiestaRevoca> root = objf.createRR(in);
		    	Marshaller marsh = jc.createMarshaller();
		    	marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    	StringWriter sw = new StringWriter();
		    	marsh.marshal(root, sw);
		    	out = sw.toString();
	        } else if (obj instanceof CtEsitoRevoca) {
	        	CtEsitoRevoca in = (CtEsitoRevoca) obj;
	        	it.gov.digitpa.schemas._2011.pagamenti.revoche.ObjectFactory objf = new it.gov.digitpa.schemas._2011.pagamenti.revoche.ObjectFactory();
	        	JAXBContext jc = JAXBContext.newInstance(CtEsitoRevoca.class);
	        	JAXBElement<CtEsitoRevoca> root = objf.createER(in);
		    	Marshaller marsh = jc.createMarshaller();
		    	marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    	StringWriter sw = new StringWriter();
		    	marsh.marshal(root, sw);
		    	out = sw.toString();
 	        }
	 	} catch (Exception e) {
	 		System.out.println("getStringXMLofObject: " + e.getMessage());
	 	}
	    System.out.println("getStringXMLofObject: " + out);
	    return out;
	}

    public static Object setObjectGovOfStringXMLRevoche(String xml)
    {
		Object obj = null;
		try {
			JAXBContext jc = JAXBContext.newInstance("it.gov.digitpa.schemas._2011.pagamenti.revoche");    		 
			Unmarshaller umarsh = jc.createUnmarshaller();
			//BUG se arrivano dati senza tag "<?xml ...."
		    //xml = xml.substring(xml.indexOf("<?xml")); 
			int ik = xml.indexOf("<?xml");
			if(ik != -1) {
				xml = xml.substring(ik);
			} else {
				xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + xml;
			}
			//fine BUG
			StringBuffer buffer = new StringBuffer(xml);
			StringReader reader = new StringReader(buffer.toString());
			obj = umarsh.unmarshal(reader);
			return obj;
		} catch (Exception e) {
			String messOut ="setObjectGovOfStringXMLRevoche: (" + e.getMessage() + ")";
			System.out.println(messOut);
			return null;			
		} finally {
			if(obj != null) {
				System.out.println("setObjectGovOfStringXMLRevoche: OK");
			}
		}
    }
    
	static XMLGregorianCalendar Now() {
		TimeZone tm = TimeZone.getDefault(); 
		Calendar d = Calendar.getInstance(tm);
		XMLGregorianCalendar dd = null;
    	GregorianCalendar gcalCurrenDate = new GregorianCalendar();		
    	gcalCurrenDate.setTime(d.getTime());

		try {
			dd = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalCurrenDate);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return dd;
    }

    public static String convertRRToERxml(CtRichiestaRevoca RR) {
    	String ERxml = "";
    	CtEsitoRevoca ER = new CtEsitoRevoca();
    	ER.setDominio(RR.getDominio());
    	ER.setIstitutoAttestante(RR.getIstitutoAttestante());
    	ER.setSoggettoPagatore(RR.getSoggettoPagatore());
    	ER.setSoggettoVersante(RR.getSoggettoVersante());
    	ER.setVersioneOggetto(RR.getVersioneOggetto());
		CtDatiRevoca datiRevoca = RR.getDatiRevoca();
		CtDatiEsitoRevoca datiEsitoRevoca = new CtDatiEsitoRevoca();
		datiEsitoRevoca.setCodiceContestoPagamento(datiRevoca.getCodiceContestoPagamento());
		datiEsitoRevoca.setIdentificativoUnivocoVersamento(datiRevoca.getIdentificativoUnivocoVersamento());
		datiEsitoRevoca.setImportoTotaleRevocato(datiRevoca.getImportoTotaleRevocato());
		List<CtDatiSingolaRevoca> lstIn = datiRevoca.getDatiSingolaRevoca();
		List<CtDatiSingoloEsitoRevoca> lstOut = datiEsitoRevoca.getDatiSingolaRevoca();
		for(int ik = 0; ik < lstIn.size(); ik++) {
			CtDatiSingoloEsitoRevoca cOut = new CtDatiSingoloEsitoRevoca();
			cOut.setSingoloImportoRevocato(lstIn.get(ik).getSingoloImportoRevocato());
			cOut.setIdentificativoUnivocoRiscossione(lstIn.get(ik).getIdentificativoUnivocoRiscossione());
			cOut.setCausaleEsito("OK");
			lstOut.add(cOut);
		}
		ER.setDatiRevoca(datiEsitoRevoca);
		ER.setRiferimentoMessaggioRevoca(RR.getIdentificativoMessaggioRevoca());
		ER.setRiferimentoDataRevoca(RR.getDataOraMessaggioRevoca());
    	
		String ime = String.valueOf(System.currentTimeMillis());
		ER.setIdentificativoMessaggioEsito(ime);
    	XMLGregorianCalendar dataAdesso = Now();
		ER.setDataOraMessaggioEsito(dataAdesso);
		
		ERxml = getStringXMLofObject(ER);
    	
    	return ERxml;
    }
/*
	static String convertRRxmlToERxml(String RRxml) {
    	String ERxml = "";
    	CtRichiestaRevoca RR = (CtRichiestaRevoca) setObjectGovOfStringXML(RRxml);
    	CtEsitoRevoca ER = new CtEsitoRevoca();
    	ER.setDominio(RR.getDominio());
    	ER.setIstitutoAttestante(RR.getIstitutoAttestante());
    	ER.setSoggettoPagatore(RR.getSoggettoPagatore());
    	ER.setSoggettoVersante(RR.getSoggettoVersante());
    	ER.setVersioneOggetto(RR.getVersioneOggetto());
		ER.setRiferimentoDataRevoca(RR.getDataOraMessaggioRevoca());
		CtDatiRevoca datiRevoca = RR.getDatiRevoca();
		CtDatiEsitoRevoca datiEsitoRevoca = new CtDatiEsitoRevoca();
		datiEsitoRevoca.setCodiceContestoPagamento(datiRevoca.getCodiceContestoPagamento());
		datiEsitoRevoca.setIdentificativoUnivocoVersamento(datiRevoca.getIdentificativoUnivocoVersamento());
		datiEsitoRevoca.setImportoTotaleRevocato(datiRevoca.getImportoTotaleRevocato());
		ER.setDatiRevoca(datiEsitoRevoca);
    	
		String ime = String.valueOf(System.currentTimeMillis());
		ER.setIdentificativoMessaggioEsito(ime);
    	XMLGregorianCalendar dataAdesso = Now();
		ER.setDataOraMessaggioEsito(dataAdesso);
    	
		ERxml = getStringXMLofObject(ER);

		return ERxml;
    }

	static CtEsitoRevoca convertRRToER(CtRichiestaRevoca RR) {
    	CtEsitoRevoca ER = new CtEsitoRevoca();
    	ER.setDominio(RR.getDominio());
    	ER.setIstitutoAttestante(RR.getIstitutoAttestante());
    	ER.setSoggettoPagatore(RR.getSoggettoPagatore());
    	ER.setSoggettoVersante(RR.getSoggettoVersante());
    	ER.setVersioneOggetto(RR.getVersioneOggetto());
		ER.setRiferimentoDataRevoca(RR.getDataOraMessaggioRevoca());
		CtDatiRevoca datiRevoca = RR.getDatiRevoca();
		CtDatiEsitoRevoca datiEsitoRevoca = new CtDatiEsitoRevoca();
		datiEsitoRevoca.setCodiceContestoPagamento(datiRevoca.getCodiceContestoPagamento());
		datiEsitoRevoca.setIdentificativoUnivocoVersamento(datiRevoca.getIdentificativoUnivocoVersamento());
		datiEsitoRevoca.setImportoTotaleRevocato(datiRevoca.getImportoTotaleRevocato());
		ER.setDatiRevoca(datiEsitoRevoca);
    	
		String ime = String.valueOf(System.currentTimeMillis());
		ER.setIdentificativoMessaggioEsito(ime);
    	XMLGregorianCalendar dataAdesso = Now();
		ER.setDataOraMessaggioEsito(dataAdesso);
		
    	return ER;
    }
*/
}
