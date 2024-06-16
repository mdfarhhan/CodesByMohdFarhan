a = int(input("enterr a the first term of GP : "))
r= int(input("enter the divisble difference(r): "))
n=int(input("enter the number of terms in GP : "))
listt=[]
for i in range(n):
    listt.append(a)
    a=a*r
print("List of terms in GP series ",listt)