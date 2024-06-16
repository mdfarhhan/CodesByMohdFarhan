l = [1, 2, 3, 4, 5, 6, 7, 8, 9]
for index, items in enumerate(l):
    if index == 2 or index == 4 or index == 6:
        print(f"the value of {index+1}th index is {items}")
