class mains:
    t =0
    def __init__(self):
        print("constuctor is called")
class emp:
    v=10
    st="hello"


m1 = mains()
m2=mains()
e1=emp()
# //to know the variable belongs to which type
object_type=type(m1)
# printing class name
print(object_type.__name__)
object_type=type(e1)
print(object_type.__name__)