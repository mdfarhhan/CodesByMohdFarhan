import os
f =open("C:\\Users\mohd farhan\Desktop\Python\\16-02-22\\abc\\xyz.txt","r")
s=f.read()
nf=open("C:\\Users\mohd farhan\Desktop\Python\\16-02-22\\pqr\\xyz.txt","w")
nf.write(s)
f.close()
os.remove("C:\\Users\mohd farhan\Desktop\Python\\16-02-22\\abc\\xyz.txt")
nf.close()
