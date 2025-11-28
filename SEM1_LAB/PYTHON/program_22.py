#lambda functions

#largest of 2 numbers

largest=lambda a,b:a if a>b else b
a=int(input("enter first number:"))
b=int(input("enter second number:"))
print("largest number is:",largest(a,b))

#check input number is divisible by 5
is_divisible=lambda x:x%5==0
num=int(input("enter a number:"))
if is_divisible(num):
    print(num,"is divisible by 5")
else:
    print(num,"is not divisible by 5")


#remove all strings with length<5 from a list of strings
string=["apple","cat","banana","dog","grape","hello"]
filtered_list=list(filter(lambda s:len(s)>=5,string))
print("strings with length>=5:",filtered_list)

