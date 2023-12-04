// Sort.java: the Sort interface

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.ArrayList;

public interface Sort extends Remote {

    // Define the sort method
    ArrayList<Integer> sort(ArrayList<Integer> arrayList) throws RemoteException, ServerNotActiveException;

}
