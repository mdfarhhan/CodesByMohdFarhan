a = int(input("enter a integer number a "))
b = int(input("enter your second integer number b "))
try:
    print(a/b)
except ZeroDivisionError:
    print("infinity")