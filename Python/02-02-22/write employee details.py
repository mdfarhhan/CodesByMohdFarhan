class employee:
  def insert(self,name,id):
    self.name=name
    self.id=id

class manager(employee):
  def insert(self,name,id,des,sal):
    super().insert(name,id)
    self.des=des
    self.sal=sal
    f = open("record.txt", "a")
    f.write(f"name={self.name}, id={self.id},designation = {self.des} ,salary = {self.sal}"+"\n")
    f.close()
class engineer(employee):
  def insert(self,name,id,sal):
    super().insert(name,id)
    self.sal=sal
    f = open("record.txt", "a")
    f.write(f"name={self.name}, id={self.id} ,salary = {self.sal}"+"\n")
    f.close()
class worker(employee):
  def insert(self,name,id,des,shift):
    super().insert(name,id)
    self.des=des
    self.shift=shift
    f = open("record.txt", "a")
    f.write(f"name={self.name}, id={self.id}, designation={self.des}, shift={self.shift}"+"\n")
    f.close()
ob=manager()
ob.insert("mithun","abc123","manager","30000/-")

ob1=worker()
ob1.insert("mohan","nys333","worker","morning")

ob2=engineer()
ob2.insert("yash","nys333","100000")
c = open("record.txt")
print(c.read())
c.close
