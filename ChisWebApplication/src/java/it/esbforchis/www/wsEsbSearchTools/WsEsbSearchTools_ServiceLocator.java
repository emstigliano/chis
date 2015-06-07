package it.esbforchis.www.wsEsbSearchTools;
public class WsEsbSearchTools_ServiceLocator extends org.apache.axis.client.Service implements it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_Service {
    public WsEsbSearchTools_ServiceLocator() {
    }
    public WsEsbSearchTools_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }
    public WsEsbSearchTools_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
    
    private java.lang.String wsEsbSearchToolsSOAP_address = "http://www.esbforchis.it/";
    public java.lang.String getwsEsbSearchToolsSOAPAddress() {
        return wsEsbSearchToolsSOAP_address;
    }
    
    private java.lang.String wsEsbSearchToolsSOAPWSDDServiceName = "wsEsbSearchToolsSOAP";
    public java.lang.String getwsEsbSearchToolsSOAPWSDDServiceName() {
        return wsEsbSearchToolsSOAPWSDDServiceName;
    }
    public void setwsEsbSearchToolsSOAPWSDDServiceName(java.lang.String name) {
        wsEsbSearchToolsSOAPWSDDServiceName = name;
    }
    public it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType getwsEsbSearchToolsSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsEsbSearchToolsSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsEsbSearchToolsSOAP(endpoint);
    }
    public it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType getwsEsbSearchToolsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.esbforchis.www.wsEsbSearchTools.WsEsbSearchToolsSOAPStub _stub = new it.esbforchis.www.wsEsbSearchTools.WsEsbSearchToolsSOAPStub(portAddress, this);
            _stub.setPortName(getwsEsbSearchToolsSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }
    public void setwsEsbSearchToolsSOAPEndpointAddress(java.lang.String address) {
        wsEsbSearchToolsSOAP_address = address;
    }
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                it.esbforchis.www.wsEsbSearchTools.WsEsbSearchToolsSOAPStub _stub = new it.esbforchis.www.wsEsbSearchTools.WsEsbSearchToolsSOAPStub(new java.net.URL(wsEsbSearchToolsSOAP_address), this);
                _stub.setPortName(getwsEsbSearchToolsSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }
    
     
     
     
     
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("wsEsbSearchToolsSOAP".equals(inputPortName)) {
            return getwsEsbSearchToolsSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchTools/", "wsEsbSearchTools");
    }
    private java.util.HashSet ports = null;
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchTools/", "wsEsbSearchToolsSOAP"));
        }
        return ports.iterator();
    }
    
    
    
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsEsbSearchToolsSOAP".equals(portName)) {
            setwsEsbSearchToolsSOAPEndpointAddress(address);
        }
        else 
{ 
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }
    
    
    
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }
}
