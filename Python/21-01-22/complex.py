import math
class complex:
    x=int(input("enter value of x: "))
    y=int(input("enter value of y: "))
    def magnitude(self):
        self.z=math.pow(self.x, 2)+math.pow(self.y, 2)
        ans=math.sqrt(self.z)
        print(ans)


c1=complex()
c1.magnitude()
