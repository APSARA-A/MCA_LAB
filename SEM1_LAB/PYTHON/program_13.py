#conditional statement examples
num=int(input("enter a number:"))
if num % 2==0:
    print("even")
else:
    print("odd")


#another example program
items=["apple","banana","orange","grapes"]
i=input("enter item to search:")
if i in items:
    print("available")
else:
    print("Not available")