
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats
# import sklearn
# import scify
# import csv


dataset=pd.read_csv("C:\\Users\\mohdf\\OneDrive\\Desktop\\Python\\project\\Salary.csv")


mean = np.mean(dataset.Salary)
print("mean of data = ",mean)

median=np.median(dataset.Salary)
print("meadian of data = ",median)

mode=stats.mode(dataset.Salary)
print("mode of data= ",mode)

std_dev=np.std(dataset.Salary)
print("standard deviation of data = ",std_dev)

var=np.var(dataset.Salary)
print("variance of data = ",var)
# colors = np.array(["red","green","blue","yellow","pink","black","orange","purple","beige","brown","gray","cyan","magenta"])

plt.hist(dataset.Salary,30)
plt.title("Employee Histogram")
plt.xlabel("Employee Salary Per Month")
plt.show()


slope, intercept, r, p, std_err = stats.linregress(dataset.YearsExperience, dataset.Salary)

def myfunc(x):
  return slope * x + intercept

mymodel = list(map(myfunc, dataset.YearsExperience))

plt.scatter(dataset.YearsExperience, dataset.Salary)
plt.title("Linear Regresion Graph")
plt.xlabel("Experiance(in years)")
plt.ylabel("Employee Salary Per Month")
plt.plot(dataset.YearsExperience, mymodel)
plt.show()