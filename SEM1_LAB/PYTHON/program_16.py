num_list=[10,20,30,40,50]
print(num_list)
sum=0
if len(num_list)==0:
    print("list is empty")
else:
    for num in num_list:
        sum+=num
print("sum of all elements in list:",sum)