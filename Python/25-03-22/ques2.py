import matplotlib.pyplot as plt
import numpy as np
x=[]
y=[]
for i in range(5):
    p1=int(input("Calories burn by person 1: "))
    x.append(p1)
    bp=int(input("Calories burn by person 2: "))
    y.append(bp)


arr1=np.array(x)
arr2=np.array(y)
plt.title("Calories burn diagram ")

plt.plot(arr1,marker="d")
plt.plot(arr2,marker="s")
plt.show()
