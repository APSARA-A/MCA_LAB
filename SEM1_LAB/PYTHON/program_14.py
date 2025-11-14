num=int(input("enter a number:"))
fact=1
if num>0:
    for f in range(1,num+1):
        fact*=f
    print("factorial:",fact)
else:
    print("enter a positive number")