class animal:
    animalname=""
    animalsound=""
    animalproperty=""
    def inputdata(self):
        self.animalname=input("enter animal name ")
        self.animalsound=input("enter animal sounds in words ")
        self.animalproperty=input("enter animal description and proprties ")
    def display(self):
        print("Animal name is ",self.animalname)
        print("Animal sound is ",self.animalsound)
        print("Animal description : ",self.animalproperty)

cat=animal()
horse=animal()
snake=animal()
cat.inputdata()
cat.display()
horse.inputdata()
horse.display()
snake.inputdata()
snake.display()