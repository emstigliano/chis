package it.esbforchis.www.wsEsbWeatherInformation;
public class WsEsbWeatherInformation_ServiceLocator extends org.apache.axis.client.Service implements it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_Service {
    public WsEsbWeatherInformation_ServiceLocator() {
    }
    public WsEsbWeatherInformation_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }
    public WsEsbWeatherInformation_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName); 
    }
    
    private java.lang.String wsEsbWeatherInformationSOAP_address = "http://www.esbforchis.it/";
    public java.lang.String getwsEsbWeatherInformationSOAPAddress() {
        return wsEsbWeatherInformationSOAP_address;
    }
    
    private java.lang.String wsEsbWeatherInformationSOAPWSDDServiceName = "wsEsbWeatherInformationSOAP";
    public java.lang.String getwsEsbWeatherInformationSOAPWSDDServiceName() {
        return wsEsbWeatherInformationSOAPWSDDServiceName;
    }
    public void setwsEsbWeatherInformationSOAPWSDDServiceName(java.lang.String name) {
        wsEsbWeatherInformationSOAPWSDDServiceName = name;
    }
    public it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType getwsEsbWeatherInformationSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsEsbWeatherInformationSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsEsbWeatherInformationSOAP(endpoint);
    }
    public it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType getwsEsbWeatherInformationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformationSOAPStub _stub = new it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformationSOAPStub(portAddress, this);
            _stub.setPortName(getwsEsbWeatherInformationSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }
    public void setwsEsbWeatherInformationSOAPEndpointAddress(java.lang.String address) {
        wsEsbWeatherInformationSOAP_address = address;
    }
  
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformationSOAPStub _stub = new it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformationSOAPStub(new java.net.URL(wsEsbWeatherInformationSOAP_address), this);
                _stub.setPortName(getwsEsbWeatherInformationSOAPWSDDServiceName());
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
        if ("wsEsbWeatherInformationSOAP".equals(inputPortName)) {
            return getwsEsbWeatherInformationSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbWeatherInformation/", "wsEsbWeatherInformation");
    }
    private java.util.HashSet ports = null;
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbWeatherInformation/", "wsEsbWeatherInformationSOAP"));
        }
        return ports.iterator();
    }
   
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsEsbWeatherInformationSOAP".equals(portName)) {
            setwsEsbWeatherInformationSOAPEndpointAddress(address);
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
