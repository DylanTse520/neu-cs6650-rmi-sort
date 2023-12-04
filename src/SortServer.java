// SortServer.java: a rmi server hosting the Sort class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class SortServer {

    public SortServer() {
        try {
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // Reading data using readLine
            String input = reader.readLine();
            // Splitting the input line to get the port number
            String[] parts = input.split(" ");
            // The second part should be the port number
            String port = parts[1];
            // New the Sort class object
            Sort sort = new SortImpl();
            // Bind the object in the registry
            Naming.rebind("rmi://localhost:" + port + "/SortServer", sort);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String[] args) {
    }
}