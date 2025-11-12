list=input("enter a list:").split(",")
print("Unique Items:", set(list))

if len(list)==0:
    print("list is empty")
else:
    print("list is not empty")