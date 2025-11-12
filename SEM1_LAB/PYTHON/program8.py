num=input("enter number separated by commas:").split(",")
num=[int (x) for x in num]
greater=[x for x in num if x>100]
print("Numbers greater than 100:",greater)