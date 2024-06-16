import random
def game(comp,you):
    if comp == you:
        return None
    elif comp == 'r':
        if you == 'p':
            return True
        elif you == 's':
            return False
    elif comp == 'p':
        if you == r:
            return False
        elif you == 's':
            return True
    elif comp == 's':
        if you == 'r':
            return True
        elif you == 'p':
            return False
    

ra = random.randint(1, 3)
print("computer turn: rock(r) paper(p) scisser(s)?")
if ra==1:
    comp = 'r'
elif ra==2:
    comp = 'p'
elif ra==3:
    comp = 's'    

you = input("your turn: rock(r) paper(p) scisser(s) ")
a = game(comp, you)
print(f"computer choosen {comp}")
print(f"you choosen {you}")
if a == None:
    print("Match Tie")
elif a == True:
    print("You Win!")
elif a == False:
    print("You Lose!")

