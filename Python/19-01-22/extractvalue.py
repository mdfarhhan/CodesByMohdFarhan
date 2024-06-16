l =[123,22,334,56,666,6776,8]
for i in l:
    if len(str(i))==3:
        l.remove(i)
print(l)