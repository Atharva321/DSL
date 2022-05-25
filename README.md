# DSL

###Characteristics Of Inter-process Communication:
There are mainly five characteristics of inter-process communication in a distributed environment/system.

Synchronous System Calls:
In the synchronous system calls both sender and receiver use blocking system calls to transmit the data which means the sender will wait until the acknowledgment is received from the receiver and receiver waits until the message arrives.
Asynchronous System Calls:
In the asynchronous system calls, both sender and receiver use non-blocking system calls to transmit the data which means the sender doesn’t wait from the receiver acknowledgment.
Message Destination:
A local port is a message destination within a computer, specified as an integer. Aport has exactly one receiver but many senders. Processes may use multiple ports from which to receive messages. Any process that knows the number of a port can send the message to it.
Reliability:
It is defined as validity and integrity.
Integrity:
Messages must arrive without corruption and duplication to the destination.
Validity:
Point to point message services are defined as reliable, If the messages are guaranteed to be delivered without being lost is called validity.
Ordering:
It is the process of delivering messages to the receiver in a particular order. Some applications require messages to be delivered in the sender order i.e the order in which they were transmitted by the sender.
