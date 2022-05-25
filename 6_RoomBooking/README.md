1- Interface public interface HotelInterface extends Remote 
{ 
public void book (int NumberOfGuests, int NumberOfNights, String 
CustomerName, Date checkInDate)throws RemoteException; public boolean 
cancelBooking(String CustomerName) throws RemoteException; public Date 
inquiry(String CustomerName) throws RemoteException; 
} 

 

2- Server public class HotelServer extends UnicastRemoteObject implements 
HotelInterface 
{ 


private Vector Customers; //guests’ name private Vector 
CheckInDate; //guests’ check-in Date private Vector 
NumOfNights; //guests’ number of nights staying 

 

private Vector NumbOfGuest; // number of guests boolean done; 

 

public HotelServer() throws RemoteException 
{ //implementation 
} 
public void book (int NumberOfGuests, int NumberOfNights, String CustomerName, Date 
checkInDate) throws RemoteException 
{ //implementation 
} 
public boolean cancelBooking(String CustomerName) throws RemoteException 
{ //implementation 
} 
public Date inquiry(String CustomerName) throws RemoteException { 
//implementation 
} 
public static void main(String args[]) throws Exception 
{ //init Hotel server 
} 
} 

 

The Hotel server has only one input parameter “server_port”, which specifies the port of 
rmiregistry. The default port of rmiregistry is 1099, but we may have to use other ports, if 
1099 has already been used by some other programs. 

 

3- Customer (Client) 
public class Customer 
{ 
public static void (String args[]) throws Exception 
{ //get user’s input, and perform the operations 
} 
} 

 

The input parameters of a Customer must include: 
• server_address: the address of the rmiregistry 
• server_port: the port of the rmiregistry 
• Operation: one of “book”, “cancelBooking”, and “Inquiry” 
• CustomerName: assume it is unique for every user 
• CheckInDate: entered in the book operation 
• NumberOfNights: entered in the book operation


 

 

Algorithm Steps to run Distributed Application: 

 

1. Compile all java filesjavac *.java 
2. Create Stub and Skeleton class file 
for RoomBookingServerrmic 
RoomBookingServer  
3. Run RMIC Registry rmiregistry & 
4. Run RoomBookingServerjava 
RoomBookingServer 
5. In new terminal Run 
RoomBookingClientjava 
RoomBookingClient 