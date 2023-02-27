/**
 * PagamentiTelematiciRPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciRPT;

public interface PagamentiTelematiciRPT extends java.rmi.Remote {
//    public gov.telematici.pagamenti.ws.NodoChiediStatoRPTRisposta nodoChiediStatoRPT(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoUnivocoVersamento, java.lang.String codiceContestoPagamento) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediStatoRPTRisposta nodoChiediStatoRPT(gov.telematici.pagamenti.ws.NodoChiediStatoRPT bodyrichiesta) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediListaPendentiRPTRisposta nodoChiediListaPendentiRPT(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.util.Calendar rangeDa, java.util.Calendar rangeA, org.apache.axis.types.PositiveInteger dimensioneLista) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoInviaRPTRisposta nodoInviaRPT(gov.telematici.pagamenti.ws.NodoInviaRPT bodyrichiesta, gov.telematici.pagamenti.ws.ppthead.IntestazionePPT header) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoInviaCarrelloRPTRisposta nodoInviaCarrelloRPT(gov.telematici.pagamenti.ws.NodoInviaCarrelloRPT bodyrichiesta, gov.telematici.pagamenti.ws.ppthead.IntestazioneCarrelloPPT header) throws java.rmi.RemoteException;
    //public gov.telematici.pagamenti.ws.NodoChiediCopiaRTRisposta nodoChiediCopiaRT(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoUnivocoVersamento, java.lang.String codiceContestoPagamento) throws java.rmi.RemoteException;
    
    public gov.telematici.pagamenti.ws.NodoChiediCopiaRTRisposta nodoChiediCopiaRT(gov.telematici.pagamenti.ws.NodoChiediCopiaRT bodyrichiesta) throws java.rmi.RemoteException;
    
    
    public gov.telematici.pagamenti.ws.NodoChiediInformativaPSPRisposta nodoChiediInformativaPSP(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoPSP) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoPAChiediInformativaPARisposta nodoPAChiediInformativaPA(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediElencoQuadraturePARisposta nodoChiediElencoQuadraturePA(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediQuadraturaPARisposta nodoChiediQuadraturaPA(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoFlusso) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediElencoFlussiRendicontazioneRisposta nodoChiediElencoFlussiRendicontazione(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoPSP) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediFlussoRendicontazioneRisposta nodoChiediFlussoRendicontazione(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoPSP, java.lang.String identificativoFlusso) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoInviaRichiestaStornoRisposta nodoInviaRichiestaStorno(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoUnivocoVersamento, java.lang.String codiceContestoPagamento, byte[] rr) throws java.rmi.RemoteException;
    //inizio LP PG190220
    //public gov.telematici.pagamenti.ws.NodoInviaRispostaRevocaRisposta nodoInviaRispostaRevoca(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String identificativoUnivocoVersamento, java.lang.String codiceContestoPagamento, byte[] er) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoInviaRispostaRevocaRisposta nodoInviaRispostaRevoca(gov.telematici.pagamenti.ws.NodoInviaRispostaRevoca parameters) throws java.rmi.RemoteException;
    //fine LP PG190220
   // public gov.telematici.pagamenti.ws.NodoChiediSceltaWISPRisposta nodoChiediSceltaWISP(java.lang.String identificativoIntermediarioPA, java.lang.String identificativoStazioneIntermediarioPA, java.lang.String password, java.lang.String identificativoDominio, java.lang.String keyPA, java.lang.String keyWISP) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.NodoChiediSceltaWISPRisposta nodoChiediSceltaWISP(gov.telematici.pagamenti.ws.NodoChiediSceltaWISP bodyrichiesta) throws java.rmi.RemoteException;

}
