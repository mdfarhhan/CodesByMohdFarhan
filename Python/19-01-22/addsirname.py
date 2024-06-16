l = ["farhan","hela","mohd","arun","sufiyan"]
for i in range(len(l)):
    if len(l[i])==4:
        sn=input("enter sur name for "+str(l[i]))
        l[i]=l[i]+str(sn)
print(l)