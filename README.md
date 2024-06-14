What is web socket and how it is different from the HTTP?

HTTP and WebSocket both are communication protocols used in client-server communication. 

HTTP protocol: HTTP is unidirectional where the client sends the request and the server sends the response. Let’s take an example when a user sends a request to the server this request goes in the form of HTTP or HTTPS, after receiving a request server send the response to the client, each request is associated with a corresponding response, after sending the response the connection gets closed, each HTTP or HTTPS request establish the new connection to the server every time and after getting the response the connection gets terminated by itself. 
HTTP is a stateless protocol that runs on top of TCP which is a connection-oriented protocol it guarantees the delivery of data packet transfer using the three-way handshaking methods and re-transmits the lost packets. 

HTTP can run on top of any reliable connection-oriented protocol such as TCP, SCTP. When a client sends an HTTP request to the server, a TCP connection is open between the client and server and after getting the response the TCP connection gets terminated, each HTTP request opens a separate TCP connection to the server, for e.g. if the client sends 10 requests to the server the 10 separate TCP connection will be opened. and get closed after getting the response/fallback. 

HTTP message information encoded in ASCII, each HTTP request message composed HTTP protocol version(HTTP/1.1, HTTP/2), HTTP methods (GET/POST, etc.), HTTP headers (content type, content length), host information, etc. and the body which contain the actual message which is being transferred to the server. HTTP headers varied from 200 bytes to 2 KB in size, the common size of HTTP header is 700-800 bytes. When a web application uses more cookies and other tools at the client-side that expand storage features of the agent it reduces the HTTP header payload. 

WebSocket is a transport layer protocol that provides a persistent connection between client and server. This WebSocket operates over a TCP/IP socket connection and provides a full-duplex and bidirectional functionality for the communication.



Why WebSocket?

The API is an HTTP-based technology that allows two applications to communicate with each other. This HTTP-based technology strictly operates over unidirectional protocol. Here, the server makes sure that every response data sent has to be requested from the client.

Now, let's get back to our messaging application where two people chat using APIs. Since HTTP APIs are unidirectional the client and server have to act both respectively and make continuous to and fro connections to get response data (relay messages from A to B and vice versa). These connections are tedious to handle.

To avoid this messy connection, there comes a concept of long polling. This long polling acts as a workaround for the above scenario where a client can send an HTTP request with a long timeout period and the server can keep pushing data back to the client.

Since this is just a workaround, you can expect some drawbacks as well, i.e. long polling works perfectly when the client and server are having continuous data transfer, but the problem arises when there is no data available to send back to the client. The server unnecessarily holds the resources throughout the length of the poll (timeout).


![image](https://github.com/prakashlsp/NewBot/assets/167532552/63298bbe-6b5c-4817-9da1-29a7f7a81329)

WebSocket APIs
WebSocket API allows creating a bidirectional, full-duplex persistent connection that helps two applications to interact with each other fluently.

This can be visualized as a tunnel where data can be sent and received constantly without waiting for each other's response.
