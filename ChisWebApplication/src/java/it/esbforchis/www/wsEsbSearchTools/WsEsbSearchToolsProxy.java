package it.esbforchis.www.wsEsbSearchTools;
public class WsEsbSearchToolsProxy implements it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType {
  private String _endpoint = null;
  private it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType wsEsbSearchTools_PortType = null;
  
  public WsEsbSearchToolsProxy() {
    _initWsEsbSearchToolsProxy();
  }
  
  public WsEsbSearchToolsProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsEsbSearchToolsProxy();
  }
  
  private void _initWsEsbSearchToolsProxy() {
    try {
      wsEsbSearchTools_PortType = (new it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_ServiceLocator()).getwsEsbSearchToolsSOAP();
      if (wsEsbSearchTools_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsEsbSearchTools_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsEsbSearchTools_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsEsbSearchTools_PortType != null)
      ((javax.xml.rpc.Stub)wsEsbSearchTools_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.esbforchis.www.wsEsbSearchTools.WsEsbSearchTools_PortType getWsEsbSearchTools_PortType() {
    if (wsEsbSearchTools_PortType == null)
      _initWsEsbSearchToolsProxy();
    return wsEsbSearchTools_PortType;
  }
  
  public it.esbforchis.www.wsEsbSearchTools.SearchForPositionOutput searchForPosition(it.esbforchis.www.wsEsbSearchTools.SearchForPositionInput searchForPositionInput) throws java.rmi.RemoteException{
    if (wsEsbSearchTools_PortType == null)
      _initWsEsbSearchToolsProxy();
    return wsEsbSearchTools_PortType.searchForPosition(searchForPositionInput);
  }
  
  public it.esbforchis.www.wsEsbSearchTools.SearchForTypologyOutput searchForTypology(it.esbforchis.www.wsEsbSearchTools.SearchForTypologyInput searchForTypologyInput) throws java.rmi.RemoteException{
    if (wsEsbSearchTools_PortType == null)
      _initWsEsbSearchToolsProxy();
    return wsEsbSearchTools_PortType.searchForTypology(searchForTypologyInput);
  }
  
  public it.esbforchis.www.wsEsbSearchTools.SearchForNameOutput searchForName(it.esbforchis.www.wsEsbSearchTools.SearchForNameInput searchForNameInput) throws java.rmi.RemoteException{
    if (wsEsbSearchTools_PortType == null)
      _initWsEsbSearchToolsProxy();
    return wsEsbSearchTools_PortType.searchForName(searchForNameInput);
  }
  
  
}