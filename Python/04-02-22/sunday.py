import datetime
x = datetime.datetime.now()
day = x.strftime("%A")
if(day.lower()=="sunday"):
    print("today is ",day)
else:
    print("today is not Sunday , today is ",day)