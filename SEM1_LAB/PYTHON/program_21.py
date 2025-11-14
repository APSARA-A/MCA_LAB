def search(list,item):
    count=0
    for i in list:
        if i == item:
            count+=1
    return count

list=['green','blue','white','yellow','green']
print(list)
item='green'
print("number of occurances of item green is", search(list,item))