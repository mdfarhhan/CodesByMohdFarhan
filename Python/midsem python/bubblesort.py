x = [34,45,67,5,3,4,2,1]
s=len(x)
for i in range(s):
    for j in range(0,s-1-i):
        if(x[j]>x[j+1]):
            t = x[j]
            x[j]=x[j+1]
            x[j+1]=t
print(x)