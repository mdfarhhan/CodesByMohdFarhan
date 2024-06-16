import matplotlib as plt
import numpy as np

x=[]
for i in range(6):
    bp=int(input("enter the blood pressure of the person : "))
    x.append(bp)

x=np.array(x)
for bp in x:
    if bp>=100 and bp<120:
        plt.plot(bp,marker="o-g")
    elif bp>=120 and bp<150:
        plt.plot(bp,marker="o-b")
    elif bp>=150:
        plt.plot(bp,marker="o-r")


plt.show()