time = input("enter time in 12 hour format ")
timearr = time.split(":")
timearr[2]=timearr[2].lower()
if int(timearr[0])<12 and str(timearr[2])=="pm":
    timearr[0]=int(timearr[0])+12
    print("Time in 24 hour format ",str(timearr[0])+":"+timearr[1])
else:
    print("Time in 24 hour format ",timearr[0]+":"+timearr[1])
timearr[0]=str(timearr[0])