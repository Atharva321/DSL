Methods Used: 
1. public Socket(String host, int port) throws UnknownHostException, IOException. 


This method attempts to connect to the specified server at the specified port. If this constructor does 
not throw an exception, the connection is successful and the client is connected to the server. 
2. public InputStream getInputStream() throws IOException 
Returns the input stream of the socket. The input stream is connected to the output stream of the 
remote socket. 3. public OutputStream getOutputStream() throws IOException 
Returns the output stream of the socket. The output stream is connected to the input stream of the 
remote socket. 
4. public void close() throws IOException 
Closes the socket, which makes this Socket object no longer capable of connecting again to any 
server. 5. public ServerSocket(int port) throws IOException 
Attempts to create a server socket bound to the specified port. An exception occurs if the port is already 
bound by another application. 
6. public Socket accept() throws IOException 
Waits for an incoming client. This method blocks until either a client connects to the server on the 
specified port or the socket times out, assuming that the time-out value has been set using the 
setSoTimeout() method. 

 

 

 
ALGORITHM: 
Steps 

 

Client Program: 
1. Initialise input and output stream. 
2. Open socket on given port. 
3. Open output and input stream. 
4. If everything has been initialized then we want to write some data to the socket we have opened 
aconnection to on the given port 
5. Close input and output stream. 
6. Close the socket 
Server Program: 
1. Calling constructor of server final and initializing in object(server) of serverfinal. 
2. Calling startserver function 
3. Declare a server socket and a client socket for the server 
4. Declare the number of connections 
5. Try to open a server socket on the given port(Note that we can't choose a port less than 1024 if we are 
not) 6. Whenever a connection is received, start a new thread to process the connection and wait for the 
next connection. 
7. Close the client connection. 