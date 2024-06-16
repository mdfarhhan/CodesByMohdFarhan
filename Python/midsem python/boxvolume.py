class Box:
    def Volume(self):
        shape=input("Enter shape cube or cuboid:")
        if shape=='cube':
                l=int(input("Enter length of edge of Cube:"))
                vol=l*l*l
                print("The volume of cube is:",vol)
        elif shape=='cuboid':
                 len=int(input("Enter length of cuboid:"))
                 br=int(input("Enter breathe of cuboid:"))
                 hg=int(input("Enter the height of cuboid:"))
                 vol=len*br*hg
                 print("The volume of cuboid is:",vol)
        else:
                print("The shape must be cube or cuboid")


ob=Box()
ob.Volume()