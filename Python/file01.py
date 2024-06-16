a = open("twinkle.txt")

t = a.read()
if 'twinkle' in t:
    print("twinkle is present in file")
else:
    print("twinkle is not present in file")
