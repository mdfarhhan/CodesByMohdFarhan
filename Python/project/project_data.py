# print("daataa")
import numpy as np
import sklearn
import pandas as pd
# import scify
import matplotlib.pyplot as plt
import csv
from scipy import stats


dataset=pd.read_csv("C:\\Users\\mohdf\\OneDrive\\Desktop\\Python\\project\\diabetes_dataset.csv.csv")


mean = np.mean(dataset.BMI)
print("mean of data= ",mean)

median=np.median(dataset.BMI)
print("meadian of data= ",median)

# mode=stats.mode(dataset.BMI)
# print("mode of data= ",mode)

std_dev=np.std(dataset.BMI)
print("standard deviation of data= ",std_dev)

var=np.var(dataset.BMI)
print("variance of data= ",var)


plt.hist(dataset.BMI,30)
plt.show()



# slope, intercept, r, p, std_err = stats.linregress(dataset.Age,dataset.BMI)

# def myfunc(x):
#   return slope * x + intercept

# mymodel = list(map(myfunc, dataset.Age))

# plt.scatter(dataset.Age,dataset.BMI)
# plt.plot(dataset.Age, mymodel)
# plt.show()


