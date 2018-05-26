import time
import socket
import sys
print("welcome to  prsnl chat")
print("")
print("initialising....plz wait")
time.sleep(1)

s=socket.socket()
host=socket.gethostname()
port=8080
s.bind((host,port))
print("")
print(host)
print("")
name=input(str("enter username"))
        
s.listen(1)
print("")
print("waiting for connections")
print("")
conn,addr=s.accept()
print("connection received")

s_name=conn.recv(1024)
s_name=s_name.decode()
print("")
print(s_name,"has connected to the prsnl chat ")
print("")
conn.send(name.encode())

while 1:
    #print("enter msg")
    #if conn.recv(1024):
        mes=input(str("send your message"))
        print("")
        conn.send(mes.encode())
        print("Sent")
        msg=conn.recv(1024)
        message=msg.decode()
        print("")
        print(time.asctime( time.localtime(time.time()) ),"->",name,":",message)
        print("")
    #else:
        
