
package it.esbforchis.www.wsEsbSearchTools;
public interface WsEsbSearchTools_PortType extends java.rmi.Remote {
    public it.esbforchis.www.wsEsbSearchTools.SearchForPositionOutput searchForPosition(it.esbforchis.www.wsEsbSearchTools.SearchForPositionInput searchForPositionInput) throws java.rmi.RemoteException;
    public it.esbforchis.www.wsEsbSearchTools.SearchForTypologyOutput searchForTypology(it.esbforchis.www.wsEsbSearchTools.SearchForTypologyInput searchForTypologyInput) throws java.rmi.RemoteException;
    public it.esbforchis.www.wsEsbSearchTools.SearchForNameOutput searchForName(it.esbforchis.www.wsEsbSearchTools.SearchForNameInput searchForNameInput) throws java.rmi.RemoteException;
}
