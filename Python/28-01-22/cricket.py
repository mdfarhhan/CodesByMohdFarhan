class cricket:
    teamname=""
    playersname=""
    playerstrength=""
    wicket=0
    runs=0
    def inputdata(self):
        self.teamname=input("enter team name: ")
        self.playersname=input("enter player name :")
        self.playerstrength=input("enter player strength and role :")
        self.wicket=int(input("enter wickets taking by player :"))
        self.runs=int(input("enter runs hit by player :"))
        

    def display(self):
        print("team name is ",self.teamname)
        print("player name is ",self.playersname)
        print("Role in team ",self.playerstrength)
        print("wicket taken by player = ",self.wicket)
        print("runs = ",self.runs)
        

t1=cricket()
t1.inputdata()
t1.display()

