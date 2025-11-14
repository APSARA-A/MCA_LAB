def concatenate(list):
    lists=list.split(",")
    concate=''.join(lists)
    return concate

list=input("enter single digit numbers:")
print("concatenated number:",concatenate(list))