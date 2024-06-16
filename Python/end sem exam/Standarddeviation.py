import numpy as np
import pandas as pd
import math

sddataset=pd.read_csv("C:\\Users\\mohdf\\OneDrive\\Desktop\\end sem exam\\Salary.csv")
stlist=list(sddataset.YearsExperience)
# print(stlist)
sum=0
for i in range(len(stlist)):
    sum+=stlist[i]
mean=sum/len(stlist)
for i in range(len(stlist)):
    sumofsquaredev=(stlist[i]-mean)**2
standarddeviation= ((sumofsquaredev)/len(stlist))**0.5
print(standarddeviation)