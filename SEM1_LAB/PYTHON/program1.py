str=input('Enter a string:')
str1=str[0]+str[1:].replace(str[0],"$")
print(str1)
str2=str1[-1]+str1[1:-1]+str1[0]
print(str2)