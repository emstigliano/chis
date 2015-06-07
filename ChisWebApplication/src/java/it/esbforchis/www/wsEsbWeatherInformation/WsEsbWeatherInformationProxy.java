package it.esbforchis.www.wsEsbWeatherInformation;
public class WsEsbWeatherInformationProxy implements it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType {
  private String _endpoint = null;
  private it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType wsEsbWeatherInformation_PortType = null;
  
  public WsEsbWeatherInformationProxy() {
    _initWsEsbWeatherInformationProxy();
  }
  
  public WsEsbWeatherInformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsEsbWeatherInformationProxy();
  }
  
  private void _initWsEsbWeatherInformationProxy() {
    try {
      wsEsbWeatherInformation_PortType = (new it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_ServiceLocator()).getwsEsbWeatherInformationSOAP();
      if (wsEsbWeatherInformation_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsEsbWeatherInformation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsEsbWeatherInformation_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsEsbWeatherInformation_PortType != null)
      ((javax.xml.rpc.Stub)wsEsbWeatherInformation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType getWsEsbWeatherInformation_PortType() {
    if (wsEsbWeatherInformation_PortType == null)
      _initWsEsbWeatherInformationProxy();
    return wsEsbWeatherInformation_PortType;
  }
  
  public it.esbforchis.www.wsEsbWeatherInformation.GetWeaterInformationOutput getWeatherInformation(it.esbforchis.www.wsEsbWeatherInformation.GetWeaterInformationInput getWeatherInformationInput) throws java.rmi.RemoteException{
    if (wsEsbWeatherInformation_PortType == null)
      _initWsEsbWeatherInformationProxy();
    return wsEsbWeatherInformation_PortType.getWeatherInformation(getWeatherInformationInput);
  }
  
  
}