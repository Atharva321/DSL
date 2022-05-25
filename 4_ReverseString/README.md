Advantage of MPI 
1. Standardization: MPI is the only message passing library which canbe considered a standard. 
2. Portability: no need to modify your source code when you portyour application to a different 
platform. 
3. Functionality: Many routines available to use. 
4. Availability: A variety of implementations are available.  
Disadvantages of MPI: 
1. Lack of scalability between memory and CPU. Adding more CPUs can increase the traffic 
on shared memory associated with cache andmemory management. 
2. Programmer responsibility for synchronization construct that ensure correct access of global 
memory. 
3. Expense: It becomes increasingly difficult and expensive to design and produce shared 
memory machines with ever increasing number of processors. Steps to Implement Interface 
Server site: 


1. # open terminalsudo apt-get update 
sudo apt-get install libopenmpi-dev 
mkdir exp3 
cd exp3 gedit 
server.c 
2. pass the variablesMPI_Comm client; 
MPI_Status status; 
char port_name[MPI_MAX_PORT_NAME], 
str[50],ch,temp; 
int size, again, i,j; 
3. MPI_Open_port(MPI_INFO_NULL, port_name); 
printf("Server available at port: %s\n", port_name); 
4. send the string at server site 
5. send the reversed string to client (character by character) ,end the string(tag=1) 
6. MPI_Comm_disconnect(&client); 
7. # save and exit the file 

 

Client site: 
8. gedit client.c 
9. accept input string 
10. Receive the reversed string from server and display it 
11. printf("\nReversed string is : %s\n\n",str); 
12. MPI_Comm_disconnect(&server); 
13. # save and exit the file 
14. Compile and run 

 

 