// SortClient.java: a rmi client invoking the sort method

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.ArrayList;

public class SortClient {

    public static void main(String[] args) {
        try {
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // Reading data using readLine
            String input = reader.readLine();
            // Splitting the input line to get the port number
            String[] parts = input.split(" ");
            // The second part should be the port number
            String port = parts[1];
            // Getting the Sort class object
            Sort sort = (Sort)
                    Naming.lookup(
                            "rmi://localhost:" + port + "/SortServer");

            while ((input = reader.readLine()) != null) {
                System.out.println(input);
                // Sort the array and print the result
                System.out.println(sort.sort(new ArrayList<>() {
                    {
                        add(10);
                        add(1);
                        add(9);
                        add(2);
                        add(8);
                        add(3);
                        add(7);
                        add(4);
                        add(6);
                        add(5);
                    }
                }));
            }
            // Handling the exceptions
        } catch (MalformedURLException murle) {
            System.out.println();
            System.out.println(
                    "MalformedURLException");
            murle.printStackTrace();
        } catch (RemoteException re) {
            System.out.println();
            System.out.println(
                    "RemoteException");
            re.printStackTrace();
        } catch (NotBoundException nbe) {
            System.out.println();
            System.out.println(
                    "NotBoundException");
            nbe.printStackTrace();
        } catch (
                ArithmeticException
                        ae) {
            System.out.println();
            System.out.println(
                    "java.lang.ArithmeticException");
            ae.printStackTrace();
        } catch (IOException | ServerNotActiveException e) {
            throw new RuntimeException(e);
        }
    }
}
