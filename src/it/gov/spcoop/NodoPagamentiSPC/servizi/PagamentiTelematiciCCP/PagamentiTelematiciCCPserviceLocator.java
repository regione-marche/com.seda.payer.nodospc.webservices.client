/**
 * PagamentiTelematiciCCPserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP;

public class PagamentiTelematiciCCPserviceLocator extends org.apache.axis.client.Service implements it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCPservice {

    public PagamentiTelematiciCCPserviceLocator() {
    }


    public PagamentiTelematiciCCPserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PagamentiTelematiciCCPserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PPTPort
    private java.lang.String PPTPort_address = "http://NodoPagamentiSPC.spcoop.gov.it/";

    public java.lang.String getPPTPortAddress() {
        return PPTPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PPTPortWSDDServiceName = "PPTPort";

    public java.lang.String getPPTPortWSDDServiceName() {
        return PPTPortWSDDServiceName;
    }

    public void setPPTPortWSDDServiceName(java.lang.String name) {
        PPTPortWSDDServiceName = name;
    }

    public it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCP getPPTPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PPTPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPPTPort(endpoint);
    }

    public it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCP getPPTPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCPbindingStub _stub = new it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCPbindingStub(portAddress, this);
            _stub.setPortName(getPPTPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPPTPortEndpointAddress(java.lang.String address) {
        PPTPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCP.class.isAssignableFrom(serviceEndpointInterface)) {
                it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCPbindingStub _stub = new it.gov.spcoop.NodoPagamentiSPC.servizi.PagamentiTelematiciCCP.PagamentiTelematiciCCPbindingStub(new java.net.URL(PPTPort_address), this);
                _stub.setPortName(getPPTPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PPTPort".equals(inputPortName)) {
            return getPPTPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciCCP", "PagamentiTelematiciCCPservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciCCP", "PPTPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PPTPort".equals(portName)) {
            setPPTPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
