// SortImpl.java: the class implementing the sort interface

import java.rmi.RemoteException;
import java.rmi.server.RemoteServer;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;

public class SortImpl extends UnicastRemoteObject implements Sort {

    // Write explicit constructor to declare the RemoteException exception
    public SortImpl() throws RemoteException {
        super();
    }

    // Use collections class to sort the given array and return the sorted array
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) throws RemoteException, ServerNotActiveException {
        Collections.sort(arrayList);
        System.out.println(RemoteServer.getClientHost());
        return arrayList;
    }

}
