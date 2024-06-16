class cube:
    a=0
    def input(self):
        self.a=int(input("enter the length of side of cube "))
    def volume(self):
        self.volume = self.a*self.a*self.a
    def display(self):
        print("the side of cube is ",self.a)
        print("the volume of cube is ",self.volume)
a = cube()
a.input()
a.volume()
a.display()