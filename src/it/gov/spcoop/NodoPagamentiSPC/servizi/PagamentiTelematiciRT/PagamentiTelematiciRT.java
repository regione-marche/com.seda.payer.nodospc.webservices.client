/**
 * PagamentiTelematiciRT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciRT;

public interface PagamentiTelematiciRT extends java.rmi.Remote {
    public gov.telematici.pagamenti.ws.PaaInviaRTRisposta paaInviaRT(gov.telematici.pagamenti.ws.PaaInviaRT bodyrichiesta, gov.telematici.pagamenti.ws.ppthead.IntestazionePPT header) throws java.rmi.RemoteException;
    //inizio LP PG190220
    public gov.telematici.pagamenti.ws.PaaInviaRichiestaRevocaRisposta paaInviaRichiestaRevoca(gov.telematici.pagamenti.ws.PaaInviaRichiestaRevoca bodyrichiesta) throws java.rmi.RemoteException;
    //fine LP PG190220
}
