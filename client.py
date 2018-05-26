import time
import socket
import sys 
print("welcome to prsnl chat")
print("")
print("initialising....plz wait")
time.sleep(1)

s=socket.socket()
print("")
host=input(str("please enter host ip"))
print("")
name=input(str("enter your name"))
port=8080
print("...")
print("trying to connect to",host,"at port",port)
print("....")
time.sleep(1)
s.connect((host,port))
print("congo! u r connected...")

s.send(name.encode())
s_name=s.recv(1024)
s_name=s_name.decode()
print("")
print(s_name,"has joined the prsnl chat")

while 1:
    #print("enter msg")
    #if s.recv(1024):
        msg=s.recv(1024)
        message=msg.decode()
        print("")
        print(time.asctime( time.localtime(time.time()) ),"->",name,":",message)
        print("")
    #else:        
        mes=input(str("enter ur meessage"))
        print("")
        s.send(mes.encode())
        print("sent")
