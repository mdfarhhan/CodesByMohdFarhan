import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
dataset = pd.read_csv('Data.csv')

x = dataset.iloc[: ,:-1].values
y = dataset.iloc[:,3].values


'''
from sklearn.preprocessing import Imputer

imputer = Imputer(missing_values = 'nan',strategy = 'mean',axis = 0)
imputer.fit(x[:,1:3])
x[:, 1:3] = imputer.transform(x[:, 1:3])'''



#taking care of missing data
from sklearn.impute import SimpleImputer
imputer = SimpleImputer(missing_values=np.nan, strategy='mean')
imputer.fit(x[:,1:3])
x[:, 1:3] = imputer.transform(x[:, 1:3])
 
#catogaries data words to number for computer mathmaticals equation   
from sklearn.preprocessing import LabelEncoder , OneHotEncoder
labelencoder_x = LabelEncoder()
x[:,0] = labelencoder_x.fit_transform(x[:,0])

from sklearn.compose import ColumnTransformer
columnTransformer = ColumnTransformer([('encoder', OneHotEncoder(),[0])],remainder='passthrough')
x=np.array(columnTransformer.fit_transform(x))
#onehotencoder = OneHotEncoder(categories="auto")
#x = onehotencoder.fit_transform(x).toarray()

labelencoder_y = LabelEncoder()
y = labelencoder_y.fit_transform(y)

#spilliting the dataset into the traininng test and test set

from sklearn.model_selection import train_test_split
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size = 0.2, random_state = 1)




from sklearn.preprocessing import StandardScaler
sc_x = StandardScaler()
x_train = sc_x.fit_transform(x_train)
x_test = sc_x.transform(x_test)




