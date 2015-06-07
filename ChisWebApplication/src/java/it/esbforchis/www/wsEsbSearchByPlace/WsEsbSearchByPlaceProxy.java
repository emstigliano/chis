package it.esbforchis.www.wsEsbSearchByPlace;
public class WsEsbSearchByPlaceProxy implements it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType {
  private String _endpoint = null;
  private it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType wsEsbSearchByPlace_PortType = null;
  
  public WsEsbSearchByPlaceProxy() {
    _initWsEsbSearchByPlaceProxy();
  }
  
  public WsEsbSearchByPlaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsEsbSearchByPlaceProxy();
  }
  
  private void _initWsEsbSearchByPlaceProxy() {
    try {
      wsEsbSearchByPlace_PortType = (new it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_ServiceLocator()).getwsEsbSearchByPlaceSOAP();
      if (wsEsbSearchByPlace_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsEsbSearchByPlace_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsEsbSearchByPlace_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsEsbSearchByPlace_PortType != null)
      ((javax.xml.rpc.Stub)wsEsbSearchByPlace_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType getWsEsbSearchByPlace_PortType() {
    if (wsEsbSearchByPlace_PortType == null)
      _initWsEsbSearchByPlaceProxy();
    return wsEsbSearchByPlace_PortType;
  }
  
  public it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput getDescriptions(it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsInput getDescriptionsInput) throws java.rmi.RemoteException{
    if (wsEsbSearchByPlace_PortType == null)
      _initWsEsbSearchByPlaceProxy();
    return wsEsbSearchByPlace_PortType.getDescriptions(getDescriptionsInput);
  }
  
  public it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput getImages(it.esbforchis.www.wsEsbSearchByPlace.GetImagesInput getImagesInput) throws java.rmi.RemoteException{
    if (wsEsbSearchByPlace_PortType == null)
      _initWsEsbSearchByPlaceProxy();
    return wsEsbSearchByPlace_PortType.getImages(getImagesInput);
  }
  
  public it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput getTwitterResult(it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultInput getTwitterResultInput) throws java.rmi.RemoteException{
    if (wsEsbSearchByPlace_PortType == null)
      _initWsEsbSearchByPlaceProxy();
    return wsEsbSearchByPlace_PortType.getTwitterResult(getTwitterResultInput);
  }
  
  public it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput getOtherInfo(it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoInput getOtherInfoInput) throws java.rmi.RemoteException{
    if (wsEsbSearchByPlace_PortType == null)
      _initWsEsbSearchByPlaceProxy();
    return wsEsbSearchByPlace_PortType.getOtherInfo(getOtherInfoInput);
  }
  
  
}