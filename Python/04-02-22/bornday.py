import datetime
year = int(input("enter your birthday year "))
month = int(input("enter your month of birthday "))
day = int(input("enter date of your birthday "))

y = datetime.datetime(year,month,day)
dayofborn = y.strftime("%A")
print("you are born on ",dayofborn)