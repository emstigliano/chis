package it.esbforchis.www.wsEsbSearchByPlace;
public class WsEsbSearchByPlace_ServiceLocator extends org.apache.axis.client.Service implements it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_Service {
    public WsEsbSearchByPlace_ServiceLocator() {
    }
    public WsEsbSearchByPlace_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }
    public WsEsbSearchByPlace_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
    
    private java.lang.String wsEsbSearchByPlaceSOAP_address = "http://www.esbforchis.it/";
    public java.lang.String getwsEsbSearchByPlaceSOAPAddress() {
        return wsEsbSearchByPlaceSOAP_address;
    }
    
    private java.lang.String wsEsbSearchByPlaceSOAPWSDDServiceName = "wsEsbSearchByPlaceSOAP";
    public java.lang.String getwsEsbSearchByPlaceSOAPWSDDServiceName() {
        return wsEsbSearchByPlaceSOAPWSDDServiceName;
    }
    public void setwsEsbSearchByPlaceSOAPWSDDServiceName(java.lang.String name) {
        wsEsbSearchByPlaceSOAPWSDDServiceName = name;
    }
    public it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType getwsEsbSearchByPlaceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsEsbSearchByPlaceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsEsbSearchByPlaceSOAP(endpoint);
    }
    public it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType getwsEsbSearchByPlaceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlaceSOAPStub _stub = new it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlaceSOAPStub(portAddress, this);
            _stub.setPortName(getwsEsbSearchByPlaceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }
    public void setwsEsbSearchByPlaceSOAPEndpointAddress(java.lang.String address) {
        wsEsbSearchByPlaceSOAP_address = address;
    }
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlaceSOAPStub _stub = new it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlaceSOAPStub(new java.net.URL(wsEsbSearchByPlaceSOAP_address), this);
                _stub.setPortName(getwsEsbSearchByPlaceSOAPWSDDServiceName());
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
        if ("wsEsbSearchByPlaceSOAP".equals(inputPortName)) {
            return getwsEsbSearchByPlaceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace/", "wsEsbSearchByPlace");
    }
    private java.util.HashSet ports = null;
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace/", "wsEsbSearchByPlaceSOAP"));
        }
        return ports.iterator();
    }
    
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsEsbSearchByPlaceSOAP".equals(portName)) {
            setwsEsbSearchByPlaceSOAPEndpointAddress(address);
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
