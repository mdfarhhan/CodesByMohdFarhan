from itertools import count
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats



palinwords=pd.read_csv("C:\\Users\\mohdf\\OneDrive\\Desktop\\end sem exam\\Book.csv")


def ispalindrome(word):
    n=len(word)
    palinvalue = False

    for i in range(0,int(n/2)):
        if(word[0]==word[n-1]):
            palinvalue=True
        else:
            palinvalue=False
            break
    return palinvalue

def countPalin(word):
	count = 0
	
	listOfWords = word

	
	for elements in listOfWords:
		if (ispalindrome(elements)):
			
			
			count += 1
	print (count)
print("Total number of words = ",list(palinwords.Words))
print("palindrome words = ",end=" ")
countPalin(list(palinwords.Words))