# Sort via Remote Method Invocation

## Description

Implement a Java RMI Application in which the client can send a list of 10 integers to the server,
and a remote method ['sort()'] on the server returns a sorted version of the same list back to the client.

## Build and run

Under current directory, open a terminal and use javac to compile 4 programs with the following commands:

 > javac Sort.java
 > javac SortImpl.java
 > javac SortServer.java
 > javac SortClient.java

Then start rmi registry with the following command:

 > rmiregistry

Keep the current terminal, open two more terminals and navigate to the same directory.
In one terminal, start the server and input the port number with the following commands:

 > java SortServer
server 1099

In the other terminal, start the client and input the port number with the following commands:

 > java SortClient
client 1099

The array to be sorted is hardcoded in client class as [10, 1, 9, 2, 8, 3, 7, 4, 6, 5].
Now you should be able to see the sorted array in client terminal as the return value.