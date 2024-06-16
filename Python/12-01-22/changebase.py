x = int(input("enter a decimal number "))
y = int(input("base to convert \n press 1 for binary \n press 2 for octal\n"))
s=""
if y==1:
    while x>0:
        rem = x%2
        s = str(rem)+s
        x = int(x/2)
if y==2:
    while x>0:
        rem = x%8
        s = str(rem)+s
        x = int(x/8)
print(s)