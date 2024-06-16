import datetime
year = int(input("enter your birthday year "))
month = int(input("enter your month of birthday "))
day = int(input("enter date of your birthday "))


x = datetime.datetime.now()
y = datetime.datetime(year,month,day)
print("your age in days ",x-y)