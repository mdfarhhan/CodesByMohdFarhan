import matplotlib.pyplot as plt
import numpy as np

x=np.array([30,12,43,45,55,34])

plt.plot(x)
# plt.grid()
# plt.grid(axis='x')
# plt.grid(axis='y')
plt.grid(color = 'green', linestyle = '--', linewidth = 0.5)
plt.show()