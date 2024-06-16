import numpy

x = [[1,2,3],[4,5,6],[7,8,9]]
arr = numpy.array(x)
c = int(input("enter the constant number to scale a matrix"))
y = arr.dot(c)
print(y)