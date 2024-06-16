a=int(input("enter the value of first number "))
d=int(input("enter the number of difference "))
n=int(input("enter number of terms in series"))
lists = []
for i in range(n):
    lists.append(a)
    a=a+d
print(lists)
