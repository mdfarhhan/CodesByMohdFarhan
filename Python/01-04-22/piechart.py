import matplotlib.pyplot as plt
import numpy as np

y = np.array([35, 25, 25, 15,30])
mylabels = ["Apples", "Bananas", "Cherries", "Dates","pomegrante"]
# myexplode=[0.2,0.2,0.2,0.2,0.2]
plt.pie(y, labels = mylabels,shadow=True)
plt.legend(title="fruits")
plt.show() 