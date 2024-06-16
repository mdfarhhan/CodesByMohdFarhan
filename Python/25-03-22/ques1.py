import matplotlib.pyplot as plt
import numpy as np
x=[]
y=[]
for i in range(5):
    age=int(input("enter the age of person:  "))
    x.append(age)
    bp=int(input("enter blood pressure of the person: "))
    y.append(bp)


arr1=np.array(x)
arr2=np.array(y)
plt.title("BP Diagram")
plt.xlabel("Age")
plt.ylabel("Blood Pressure")
plt.plot(x,y)
plt.show()
