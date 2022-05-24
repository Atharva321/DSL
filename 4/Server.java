import java.sql.*; 
import java.sql.Connection; 
import java.rmi.*; 
import java.rmi.Naming.*; 
import java.rmi.server.*; 
import java.rmi.registry.*; 
import java.util.Vector; 
Interface DBInterface extends Remote 
{ 
public String input(String name1) throws RemoteException; } 
public class Server extends UnicastRemoteObject implements DBInterface 
{ 
int flag=0,n,I,j; 
String name3; 
resultSet r; 
public String reverse_str(String s1){ 
char ch[]=s1.toCharArray(); 
String rev=””; 
for(int i=ch.length-1;i>=0;i--){ 
rev+=ch[i]; 
} 
return rev; 
} 
public Server()throws RemoteException 
{ 
try 
{ 
System.out.println(“InitializingServer\nServerReady”); } 
catch(Exception e) 
{ 
System.out.println(“ERROR:”+e.getMessage()); 
} 
} 
public static void main(String []args) 
{ 
Try 
{ 
Server rs=new Server(); 
java.rmi.registry.LocateRegistry.createRegistry(1030).rebind(“DBServ”,Rs);  
} 
  catch(Exception e); 
{ 
System.out.println(“ERROR:”+e.getMessage()); 
} 
} 
public String input(String name1){ 


try 
{ 
name3=reverse_str(name1); 
//name3=name1.concat(name2); 
} 
catch(Exception e) 
{ 
System.out.println(“ERROR:”+e.getMessage()); 
} 
return name3; 
} 

 
