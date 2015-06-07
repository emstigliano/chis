package it.esbforchis.www.wsEsbSearchByPlace;
public interface WsEsbSearchByPlace_PortType extends java.rmi.Remote {
    public it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput getDescriptions(it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsInput getDescriptionsInput) throws java.rmi.RemoteException;
    public it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput getImages(it.esbforchis.www.wsEsbSearchByPlace.GetImagesInput getImagesInput) throws java.rmi.RemoteException;
    public it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput getTwitterResult(it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultInput getTwitterResultInput) throws java.rmi.RemoteException;
    public it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput getOtherInfo(it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoInput getOtherInfoInput) throws java.rmi.RemoteException;
}
