
package it.esbforchis.www.wsEsbWeatherInformation;
public interface WsEsbWeatherInformation_Service extends javax.xml.rpc.Service {
    public java.lang.String getwsEsbWeatherInformationSOAPAddress();
    public it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType getwsEsbWeatherInformationSOAP() throws javax.xml.rpc.ServiceException;
    public it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformation_PortType getwsEsbWeatherInformationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
