x = [5,3,4,2,1]
for i in range(4):
    
    for j in range(0,4-i):
        if(x[j]>x[j+1]):
            t = x[j]
            x[j]=x[j+1]
            x[j+1]=t
print(x)