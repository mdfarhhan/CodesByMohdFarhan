class empolyee:
    id=0
    name=""
    department=""
    address=""
    phonenumber=""
    def input(self):
        self.id= int(input("enter empolyee id "))
        self.name=input("enter employee name ")
        self.department=input("enter the emplyee department ")
        self.address=input("enter empolyee address ")
        self.phonenumber=input("enter empolyee phone number ")
    def display(self):
        print("Empolyee Id",self.id)
        print("Empolyee name",self.name)
        print("Empolyee department",self.department)
        print("Empolyee address",self.address)
        print("Empolyee phonenumber",self.phonenumber)

e1=empolyee()
e1.input()
e1.display()
e2=empolyee()
e2.input()
e2.display()
e3=empolyee()
e3.input()
e3.display()
e4=empolyee()
e4.input()
e4.display()
e5=empolyee()
e5.input()
e5.display()
e=[e1,e2,e3,e4,e5]

