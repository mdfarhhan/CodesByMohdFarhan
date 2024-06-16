s="abcd12345ab"
for x in range(len(s)):
   if (s[x]>='a' and s[x]<='z') or (s[x]>='A' and s[x]<='Z'):
     print(s[x],end="")