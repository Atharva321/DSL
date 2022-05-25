ALGORITHM: 
Steps: 
1. Create the IDL, Open terminal 
 sudo apt-get adv –keyserver pgp.mit.edu –recv-keys 
A4A9406876FCBD3C456770C88C718D3B5072E1F5 
 sudo apt-get updates 
 sudo apt-get install rpcbind 
 mkdir exp2 
 cd exp2 
 gedit fact.x 
2. add following code in itstruct intpair { int a; 
}; 
program FACT_PROG { 
version FACT_VERS { 
int FACT(intpair) = 1; 
} = 1; 
} = 0x23451111; 
3. save and exit the file 
 rpcgen -a -C fact.x 
 gedit Makefile.fact 
4. find the following line in 
the fileCFLAGS += -g 
and change it to: 
CFLAGS += -g -DRPC_SVC_FG 


5. find the following line in 
the same 
fileRPCGENFLAGS = 
and change it to: 
RPCGENFLAGS = -C 
6. save and exit the filegedit 
fact_client.c 
7. save and exit the filegedit 
fact_server.c 
8. save and exit the file 
9. compilemake -f 
Makefile.fact 
10. In one terminal, run: 
sudo ./fact_server 
11. In another terminal, run: 
cd exp2 
$exp2/./fact_client localhost 

 