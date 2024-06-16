id = int(input("enter empolyee id "))
name = input("enter empolyee name ")
dep = input("enter empolyee department ")
add = input("enter empolyee address ")
phno = input("enter empolyee phone number ")
    
f = open("empolyee.txt","w")
f.write(("name = {0} \n id = {1} \n department = {2} \n address = {3} \n phone number = {4} \n").format(name,id,dep,add,phno))
f.close()
