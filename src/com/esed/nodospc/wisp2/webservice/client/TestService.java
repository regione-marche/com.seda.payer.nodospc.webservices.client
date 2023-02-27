package com.esed.nodospc.wisp2.webservice.client;

import gov.telematici.pagamenti.ws.NodoChiediCopiaRT;
import gov.telematici.pagamenti.ws.NodoChiediCopiaRTRisposta;
import gov.telematici.pagamenti.ws.NodoChiediInformativaPSP;
import gov.telematici.pagamenti.ws.NodoChiediInformativaPSPRisposta;
import gov.telematici.pagamenti.ws.NodoInviaCarrelloRPT;
import gov.telematici.pagamenti.ws.NodoInviaCarrelloRPTRisposta;
import gov.telematici.pagamenti.ws.NodoInviaRPT;
import gov.telematici.pagamenti.ws.NodoInviaRPTRisposta;
import gov.telematici.pagamenti.ws.TipoElementoListaRPT;
import gov.telematici.pagamenti.ws.ppthead.IntestazioneCarrelloPPT;
import gov.telematici.pagamenti.ws.ppthead.IntestazionePPT;
import it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciRPT.PagamentiTelematiciRPT;
import it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciRPT.PagamentiTelematiciRPTbindingStub;
import it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciRPT.PagamentiTelematiciRPTserviceLocator;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.axis.types.URI;
import org.apache.commons.codec.binary.Base64;


public class TestService {

	public static void main(String[] args) {
		String messaggio = "done";
		try {
			
			
			System.getProperties().put("http.proxyHost", "10.10.9.20");
			System.getProperties().put("http.proxyPort", "8080");
			System.getProperties().put("http.proxyUser", "seda/christian.tranquilli");
			System.getProperties().put("http.proxyPassword", "imprimis@#2014");
			
			PagamentiTelematiciRPTserviceLocator pagamentiTelematiciRPTserviceLocator = new PagamentiTelematiciRPTserviceLocator();

			HandlerRegistry hr = pagamentiTelematiciRPTserviceLocator.getHandlerRegistry();
			pagamentiTelematiciRPTserviceLocator.getPagamentiTelematiciRPTPortWSDDServiceName();
	          
			boolean bNodoInviaCarrelloRPT = true;
			//boolean bNodoInviaRPT = false;

			if(bNodoInviaCarrelloRPT ) {
				
				PagamentiTelematiciRPT pagamentiTelematiciRPT = pagamentiTelematiciRPTserviceLocator.getPagamentiTelematiciRPTPort(
						new URL("http://195.62.186.214:80/pddTest/PD/SPCLepida/SPCNodoDeiPagamentiDellaPATest/SPCPagamentiTelematiciRPT6T/nodoInviaCarrelloRPT"));
				
				PagamentiTelematiciRPTbindingStub _stub = (PagamentiTelematiciRPTbindingStub)pagamentiTelematiciRPT;
				_stub.setUsername("SPCLepida_SPCPagamentiTelematiciRPT6T_SIL_F");
				_stub.setPassword("wo7vA8d");
				
				QName  portName = _stub.getPortName(); //new QName("http://phonedirlux.homeip.net/wsdl", "RcxReadLSPort");
				List handlerChain = hr.getHandlerChain(portName);
				
				HandlerInfo hi = new HandlerInfo();
				hi.setHandlerClass(WsNodoRpcHandler.class);
				handlerChain.add(hi);
	
		         
				String identificativoIntermediarioPA = "02770891204";
				String identificativoStazioneIntermediarioPA="02770891204_01";
				String identificativoCarrello = "IDTRANSAZIONEPAYER";
				String identificativoDominio = "02770891204";
				String password = "L3PIDA";
				String identificativoPSP = "AGID_01";
				String identificativoIntermediarioPSP = "97735020584";
				String identificativoCanale = "97735020584_02";
				String tipoFirma = "";
				String strXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> <RPT xmlns=\"http://www.digitpa.gov.it/schemas/2011/Pagamenti/\">  <versioneOggetto>versioneOggetto1</versioneOggetto>  <dominio>  <identificativoDominio>identificativoDominio1</identificativoDominio>  <identificativoStazioneRichiedente>identificativoStazioneRichiedente1</identificativoStazioneRichiedente>  </dominio>  <identificativoMessaggioRichiesta>identificativoMessaggioRichiesta1</identificativoMessaggioRichiesta>  <dataOraMessaggioRichiesta>1900-01-01T01:01:01+01:00</dataOraMessaggioRichiesta>  <autenticazioneSoggetto>CNS</autenticazioneSoggetto>  <soggettoVersante>  <identificativoUnivocoVersante>  <tipoIdentificativoUnivoco>F</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>codiceIdentificativoUnivoco1</codiceIdentificativoUnivoco>  </identificativoUnivocoVersante>  <anagraficaVersante>anagraficaVersante1</anagraficaVersante>  <indirizzoVersante>indirizzoVersante1</indirizzoVersante>  <civicoVersante>civicoVersante1</civicoVersante>  <capVersante>capVersante1</capVersante>  <localitaVersante>localitaVersante1</localitaVersante>  <provinciaVersante>provinciaVersante1</provinciaVersante>  <nazioneVersante>nazioneVersante1</nazioneVersante>  <e-mailVersante>e-mailVersante@seda.it</e-mailVersante>  </soggettoVersante>  <soggettoPagatore>  <identificativoUnivocoPagatore>  <tipoIdentificativoUnivoco>F</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>codiceIdentificativoUnivoco1</codiceIdentificativoUnivoco>  </identificativoUnivocoPagatore>  <anagraficaPagatore>anagraficaPagatore1</anagraficaPagatore>  <indirizzoPagatore>indirizzoPagatore1</indirizzoPagatore>  <civicoPagatore>civicoPagatore1</civicoPagatore>  <capPagatore>capPagatore1</capPagatore>  <localitaPagatore>localitaPagatore1</localitaPagatore>  <provinciaPagatore>provinciaPagatore1</provinciaPagatore>  <nazionePagatore>nazionePagatore1</nazionePagatore>  <e-mailPagatore>e-mailPagatore1</e-mailPagatore>  </soggettoPagatore>  <enteBeneficiario>  <identificativoUnivocoBeneficiario>  <tipoIdentificativoUnivoco>G</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>codiceIdentificativoUnivoco1</codiceIdentificativoUnivoco>  </identificativoUnivocoBeneficiario>  <denominazioneBeneficiario>denominazioneBeneficiario1</denominazioneBeneficiario>  <codiceUnitOperBeneficiario>codiceUnitOperBeneficiario1</codiceUnitOperBeneficiario>  <denomUnitOperBeneficiario>denomUnitOperBeneficiario1</denomUnitOperBeneficiario>  <indirizzoBeneficiario>indirizzoBeneficiario1</indirizzoBeneficiario>  <civicoBeneficiario>civicoBeneficia1</civicoBeneficiario>  <capBeneficiario>capBeneficiario1</capBeneficiario>  <localitaBeneficiario>localitaBeneficiario1</localitaBeneficiario>  <provinciaBeneficiario>provinciaBeneficiario1</provinciaBeneficiario>  <nazioneBeneficiario>nazioneBeneficiario1</nazioneBeneficiario>  </enteBeneficiario>  <datiVersamento>  <dataEsecuzionePagamento>1900-01-01</dataEsecuzionePagamento>  <importoTotaleDaVersare>0.00</importoTotaleDaVersare>  <tipoVersamento>BBT</tipoVersamento>  <identificativoUnivocoVersamento>identificativoUnivocoVersamento1</identificativoUnivocoVersamento>  <codiceContestoPagamento>codiceContestoPagamento1</codiceContestoPagamento>  <ibanAddebito>ibanAddebito1</ibanAddebito>  <bicAddebito>bicAddebito1</bicAddebito>  <firmaRicevuta>0</firmaRicevuta>  <datiSingoloVersamento>  <importoSingoloVersamento>0.00</importoSingoloVersamento>  <commissioneCaricoPA>0.00</commissioneCaricoPA>  <ibanAccredito>ibanAccredito1</ibanAccredito>  <bicAccredito>bicAccredito1</bicAccredito>  <ibanAppoggio>ibanAppoggio1</ibanAppoggio>  <bicAppoggio>bicAppoggio1</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore1</credenzialiPagatore>  <causaleVersamento>causaleVersamento1</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione1</datiSpecificiRiscossione>  </datiSingoloVersamento>  <datiSingoloVersamento>  <importoSingoloVersamento>-10000000000</importoSingoloVersamento>  <commissioneCaricoPA>-10000000000</commissioneCaricoPA>  <ibanAccredito>ibanAccredito2</ibanAccredito>  <bicAccredito>bicAccredito2</bicAccredito>  <ibanAppoggio>ibanAppoggio2</ibanAppoggio>  <bicAppoggio>bicAppoggio2</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore2</credenzialiPagatore>  <causaleVersamento>causaleVersamento2</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione2</datiSpecificiRiscossione>  </datiSingoloVersamento>  <datiSingoloVersamento>  <importoSingoloVersamento>10000000000</importoSingoloVersamento>  <commissioneCaricoPA>10000000000</commissioneCaricoPA>  <ibanAccredito>ibanAccredito3</ibanAccredito>  <bicAccredito>bicAccredito3</bicAccredito>  <ibanAppoggio>ibanAppoggio3</ibanAppoggio>  <bicAppoggio>bicAppoggio3</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore3</credenzialiPagatore>  <causaleVersamento>causaleVersamento3</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione3</datiSpecificiRiscossione>  </datiSingoloVersamento>  </datiVersamento> </RPT>";
				byte[] rpt = Base64.encodeBase64(strXml.getBytes());// new byte[0];
				String identificativoUnivocoVersamento = "123123123123132";
				String codiceContestoPagamento = "n/a";
				TipoElementoListaRPT elementoListaRPT = new TipoElementoListaRPT(identificativoDominio, identificativoUnivocoVersamento, codiceContestoPagamento, tipoFirma, rpt);
				TipoElementoListaRPT[] listaRPTs = {elementoListaRPT};
				
				NodoInviaCarrelloRPT bodyrichiesta = new NodoInviaCarrelloRPT(password, identificativoPSP, identificativoIntermediarioPSP , identificativoCanale, listaRPTs );
				//IntestazioneCarrelloPPT header = new IntestazioneCarrelloPPT(identificativoIntermediarioPA, identificativoStazioneIntermediarioPA, identificativoCarrello);
				URI actor = null;
				Boolean mustUnderstand = null;
				IntestazioneCarrelloPPT header = new IntestazioneCarrelloPPT(identificativoIntermediarioPA, identificativoStazioneIntermediarioPA, identificativoCarrello, actor, mustUnderstand);
				NodoInviaCarrelloRPTRisposta response = pagamentiTelematiciRPT.nodoInviaCarrelloRPT(bodyrichiesta, header);
				System.out.println(response.getEsitoComplessivoOperazione() + ":" + response.getFault().getDescription() + " - " + response.getUrl());
			}
			
//			if(bNodoInviaRPT ) {
//			
//				PagamentiTelematiciRPT pagamentiTelematiciRPT = pagamentiTelematiciRPTserviceLocator.getPagamentiTelematiciRPTPort(
//						new URL("http://195.62.186.214:80/pddTest/PD/SPCLepida/SPCNodoDeiPagamentiDellaPATest/SPCPagamentiTelematiciRPT6T/nodoInviaRPT"));
//				
//				PagamentiTelematiciRPTbindingStub _stub = (PagamentiTelematiciRPTbindingStub)pagamentiTelematiciRPT;
//				_stub.setUsername("SPCLepida_SPCPagamentiTelematiciRPT6T_SIL_F");
//				_stub.setPassword("wo7vA8d");
//				
//				QName  portName = _stub.getPortName();
//				List handlerChain = hr.getHandlerChain(portName);
//				
//				HandlerInfo hi = new HandlerInfo();
//				hi.setHandlerClass(WsNodoRpcHandler.class);
//				handlerChain.add(hi);
//	
//		         
//				String identificativoIntermediarioPA = "02770891204";
//				String identificativoStazioneIntermediarioPA="02770891204_01";
//				String identificativoDominio = "02770891204";
//				String password = "L3PIDA";
//				String identificativoPSP = "BCITITMM";// "idPsp1";
//				String identificativoIntermediarioPSP = "00799960158"; //"idIntermediario1";
//				String identificativoCanale = "00799960158_01"; //"idCanale12";
//
//
//				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//				String identificativoMessaggioRichiesta = dateFormat.format( Calendar.getInstance().getTime());
//				//2014-01-28T04:15:14
//				dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//				String dataOraMessaggioRichiesta =  dateFormat.format( Calendar.getInstance().getTime());
//
//				String identificativoUnivocoVersamento = "RF770000000000000000" + identificativoMessaggioRichiesta;
//				String codiceContestoPagamento = "n/a";
//				
//				String codiceEnteBeneficiario = "12312312312";
//				String codiceIban = "IT54U0100003245348011241312";
//				
////				IT04O0100003245350008332100
////				IT42Z0100003245350011210101
////				IT54U0100003245348011241312
//				
//				String tipoFirma = "";
//				
//				//String strXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> <RPT xmlns=\"http://www.digitpa.gov.it/schemas/2011/Pagamenti/\">  <versioneOggetto>versioneOggetto1</versioneOggetto>  <dominio>  <identificativoDominio>identificativoDominio1</identificativoDominio>  <identificativoStazioneRichiedente>identificativoStazioneRichiedente1</identificativoStazioneRichiedente>  </dominio>  <identificativoMessaggioRichiesta>identificativoMessaggioRichiesta1</identificativoMessaggioRichiesta>  <dataOraMessaggioRichiesta>1900-01-01T01:01:01+01:00</dataOraMessaggioRichiesta>  <autenticazioneSoggetto>CNS</autenticazioneSoggetto>  <soggettoVersante>  <identificativoUnivocoVersante>  <tipoIdentificativoUnivoco>F</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>codiceIdentificativoUnivoco1</codiceIdentificativoUnivoco>  </identificativoUnivocoVersante>  <anagraficaVersante>anagraficaVersante1</anagraficaVersante>  <indirizzoVersante>indirizzoVersante1</indirizzoVersante>  <civicoVersante>civicoVersante1</civicoVersante>  <capVersante>capVersante1</capVersante>  <localitaVersante>localitaVersante1</localitaVersante>  <provinciaVersante>provinciaVersante1</provinciaVersante>  <nazioneVersante>IT</nazioneVersante>  <e-mailVersante>e-mailVersante@seda.it</e-mailVersante>  </soggettoVersante>  <soggettoPagatore>  <identificativoUnivocoPagatore>  <tipoIdentificativoUnivoco>F</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>RSSMRA00A01H501C</codiceIdentificativoUnivoco>  </identificativoUnivocoPagatore>  <anagraficaPagatore>anagraficaPagatore1</anagraficaPagatore>  <indirizzoPagatore>indirizzoPagatore1</indirizzoPagatore>  <civicoPagatore>civicoPagatore1</civicoPagatore>  <capPagatore>capPagatore1</capPagatore>  <localitaPagatore>localitaPagatore1</localitaPagatore>  <provinciaPagatore>provinciaPagatore1</provinciaPagatore>  <nazionePagatore>nazionePagatore1</nazionePagatore>  <e-mailPagatore>e-mailPagatore1</e-mailPagatore>  </soggettoPagatore>  <enteBeneficiario>  <identificativoUnivocoBeneficiario>  <tipoIdentificativoUnivoco>G</tipoIdentificativoUnivoco>  <codiceIdentificativoUnivoco>codiceIdentificativoUnivoco1</codiceIdentificativoUnivoco>  </identificativoUnivocoBeneficiario>  <denominazioneBeneficiario>denominazioneBeneficiario1</denominazioneBeneficiario>  <codiceUnitOperBeneficiario>codiceUnitOperBeneficiario1</codiceUnitOperBeneficiario>  <denomUnitOperBeneficiario>denomUnitOperBeneficiario1</denomUnitOperBeneficiario>  <indirizzoBeneficiario>indirizzoBeneficiario1</indirizzoBeneficiario>  <civicoBeneficiario>civicoBeneficia1</civicoBeneficiario>  <capBeneficiario>capBeneficiario1</capBeneficiario>  <localitaBeneficiario>localitaBeneficiario1</localitaBeneficiario>  <provinciaBeneficiario>provinciaBeneficiario1</provinciaBeneficiario>  <nazioneBeneficiario>nazioneBeneficiario1</nazioneBeneficiario>  </enteBeneficiario>  <datiVersamento>  <dataEsecuzionePagamento>1900-01-01</dataEsecuzionePagamento>  <importoTotaleDaVersare>0.00</importoTotaleDaVersare>  <tipoVersamento>BBT</tipoVersamento>  <identificativoUnivocoVersamento>identificativoUnivocoVersamento1</identificativoUnivocoVersamento>  <codiceContestoPagamento>codiceContestoPagamento1</codiceContestoPagamento>  <ibanAddebito>ibanAddebito1</ibanAddebito>  <bicAddebito>bicAddebito1</bicAddebito>  <firmaRicevuta>0</firmaRicevuta>  <datiSingoloVersamento>  <importoSingoloVersamento>0.00</importoSingoloVersamento>  <commissioneCaricoPA>0.00</commissioneCaricoPA>  <ibanAccredito>ibanAccredito1</ibanAccredito>  <bicAccredito>bicAccredito1</bicAccredito>  <ibanAppoggio>ibanAppoggio1</ibanAppoggio>  <bicAppoggio>bicAppoggio1</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore1</credenzialiPagatore>  <causaleVersamento>causaleVersamento1</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione1</datiSpecificiRiscossione>  </datiSingoloVersamento>  <datiSingoloVersamento>  <importoSingoloVersamento>-10000000000</importoSingoloVersamento>  <commissioneCaricoPA>-10000000000</commissioneCaricoPA>  <ibanAccredito>ibanAccredito2</ibanAccredito>  <bicAccredito>bicAccredito2</bicAccredito>  <ibanAppoggio>ibanAppoggio2</ibanAppoggio>  <bicAppoggio>bicAppoggio2</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore2</credenzialiPagatore>  <causaleVersamento>causaleVersamento2</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione2</datiSpecificiRiscossione>  </datiSingoloVersamento>  <datiSingoloVersamento>  <importoSingoloVersamento>10000000000</importoSingoloVersamento>  <commissioneCaricoPA>10000000000</commissioneCaricoPA>  <ibanAccredito>ibanAccredito3</ibanAccredito>  <bicAccredito>bicAccredito3</bicAccredito>  <ibanAppoggio>ibanAppoggio3</ibanAppoggio>  <bicAppoggio>bicAppoggio3</bicAppoggio>  <credenzialiPagatore>credenzialiPagatore3</credenzialiPagatore>  <causaleVersamento>causaleVersamento3</causaleVersamento>  <datiSpecificiRiscossione>datiSpecificiRiscossione3</datiSpecificiRiscossione>  </datiSingoloVersamento>  </datiVersamento> </RPT>";
//				String strXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RPT xmlns=\"http://www.digitpa.gov.it/schemas/2011/Pagamenti/\"><versioneOggetto>1.0</versioneOggetto><dominio><identificativoDominio>02770891204</identificativoDominio><identificativoStazioneRichiedente>02770891204_01</identificativoStazioneRichiedente></dominio><identificativoMessaggioRichiesta>" + identificativoMessaggioRichiesta + "</identificativoMessaggioRichiesta><dataOraMessaggioRichiesta>"+ dataOraMessaggioRichiesta +"</dataOraMessaggioRichiesta><autenticazioneSoggetto>N/A</autenticazioneSoggetto><soggettoPagatore><identificativoUnivocoPagatore><tipoIdentificativoUnivoco>F</tipoIdentificativoUnivoco><codiceIdentificativoUnivoco>RSSMRA00A01H501C</codiceIdentificativoUnivoco></identificativoUnivocoPagatore><anagraficaPagatore>PAGAMENTO ANONIMO Web Payer</anagraficaPagatore><e-mailPagatore>c.tranquilli@imprimis.it</e-mailPagatore></soggettoPagatore><enteBeneficiario><identificativoUnivocoBeneficiario><tipoIdentificativoUnivoco>G</tipoIdentificativoUnivoco><codiceIdentificativoUnivoco>" + codiceEnteBeneficiario + "</codiceIdentificativoUnivoco></identificativoUnivocoBeneficiario><denominazioneBeneficiario>LEPIDA</denominazioneBeneficiario></enteBeneficiario><datiVersamento><dataEsecuzionePagamento>2014-01-28</dataEsecuzionePagamento><importoTotaleDaVersare>10.00</importoTotaleDaVersare><tipoVersamento>BBT</tipoVersamento><identificativoUnivocoVersamento>" + identificativoUnivocoVersamento + "</identificativoUnivocoVersamento><codiceContestoPagamento>n/a</codiceContestoPagamento><firmaRicevuta>0</firmaRicevuta><datiSingoloVersamento><importoSingoloVersamento>10.00</importoSingoloVersamento><ibanAccredito>" + codiceIban + "</ibanAccredito><causaleVersamento>/RFS/"+ identificativoUnivocoVersamento +"/10.00</causaleVersamento><datiSpecificiRiscossione>9/123</datiSpecificiRiscossione></datiSingoloVersamento></datiVersamento></RPT>";
//
//
//				byte[] rpt = strXml.getBytes();// new byte[0];
//				
//				NodoInviaRPT bodyrichiesta = new NodoInviaRPT(password, identificativoPSP, identificativoIntermediarioPSP , identificativoCanale, tipoFirma, rpt );
//				IntestazionePPT header = new IntestazionePPT(identificativoIntermediarioPA, identificativoStazioneIntermediarioPA, identificativoDominio, identificativoUnivocoVersamento, codiceContestoPagamento);
//				NodoInviaRPTRisposta response = pagamentiTelematiciRPT.nodoInviaRPT(bodyrichiesta, header);
//				System.out.println("ESITO: " + response.getEsito());
//				System.out.println("FAULT: " + (response.getFault() != null ? response.getFault().getDescription() : ""));
//				System.out.println("URL: " + response.getUrl());
//			}
			
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(messaggio);
	}
	
	public static void nodoInviaRPT() {
	
	}
}
