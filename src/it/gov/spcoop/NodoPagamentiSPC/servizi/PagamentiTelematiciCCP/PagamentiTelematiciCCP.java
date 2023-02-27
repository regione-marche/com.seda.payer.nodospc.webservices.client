/**
 * PagamentiTelematiciCCP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP;

public interface PagamentiTelematiciCCP extends java.rmi.Remote {
    public gov.telematici.pagamenti.ws.PaaVerificaRPTRisposta paaVerificaRPT(gov.telematici.pagamenti.ws.PaaVerificaRPT bodyrichiesta, gov.telematici.pagamenti.ws.ppthead.IntestazionePPT header) throws java.rmi.RemoteException;
    public gov.telematici.pagamenti.ws.PaaAttivaRPTRisposta paaAttivaRPT(gov.telematici.pagamenti.ws.PaaAttivaRPT bodyrichiesta, gov.telematici.pagamenti.ws.ppthead.IntestazionePPT header) throws java.rmi.RemoteException;
}
