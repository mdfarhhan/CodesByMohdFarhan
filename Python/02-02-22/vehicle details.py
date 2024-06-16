class Vehicle:
    year = 0
    name = ""
    model = ""
    colour = ""

    def input(self, a, b, c, d):
        self.name = a
        self.year = b
        self.model = c
        self.colour = d

    def display(self):
        print("Name=", self.name, "  Year of Manufacture=", self.year, "  Model=", self.model, "  Colour=", self.colour)


class BMW(Vehicle):
    def f1(self):
        print("BMW->")
        f = open("Vehicle.txt", "a")
        f.write(f"Name={self.name}, Year of Manufacture={self.year}, Model={self.model}, Colour={self.colour}" + "\n")
        f.close()


class Bugatti(Vehicle):
    def f2(self):
        print("Bugatti->")
        f = open("Vehicle.txt", "a")
        f.write(f"Name={self.name}, Year of Manufacture={self.year}, Model={self.model}, Colour={self.colour}" + "\n")
        f.close()


class Tesla(Vehicle):
    def f3(self):
        print("Tesla->")
        f = open("Vehicle.txt", "a")
        f.write(f"Name={self.name}, Year of Manufacture={self.year}, Model={self.model}, Colour={self.colour}" + "\n")
        f.close()


B = BMW()
B.input("BMW ix", 2021, "xDrive40", "Black")
B.f1()
B.display()
Bu = Bugatti()
Bu.input("Bugatti Chiron", 2022, "Chiron W16", "Grey")
Bu.f2()
Bu.display()
T = Tesla()
T.input("Tesla", 2020, "Model S", "Red")
T.f3()
T.display()