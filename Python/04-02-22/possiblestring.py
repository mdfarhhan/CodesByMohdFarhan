v = {'a', 'e', 'i', 'o', 'u'}
word = 0
for i in v:
    for j in v:
        if j != i:
            for k in v:
                if k != i and k != j:
                    for l in v:
                        if l != k and l != j and l != i:
                            for m in v:
                                if m != i and m != j and m != k and m != l:
                                    word += 1
                                    print(i+j+k+l+m)
print("Total number of combinations :", word)