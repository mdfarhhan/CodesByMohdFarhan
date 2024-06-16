import matplotlib.pyplot as plt
import numpy as np

a=int(input("enter side length of squre: "))

x=[0,0,a,a,0]
y=[0,a,a,0,0]

x=np.array(x)
y=np.array(y)

plt.plot(x,y)
plt.show()