box={}
choice =input("enter your choice as yes or no  :")
while choice=="yes":
 shape=input("enter the shape of box  :")
 if shape=="cube":
  a=int(input("enter the side of cube   :"))
  v=a*a*a
  box[shape]=v
  choice =input("enter your choice as yes or no   :")

 elif shape=="cuboid":
  l=int(input("enter length  :"))
  w=int(input("enter width  :"))
  h=int(input("enter height  :"))
  v=l*w*h
  box[shape]=v
  choice =input("enter your choice as yes or no   :")


print("The shape and its volume is  :")
box[shape]=v
print(box)
