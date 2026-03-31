def move_zeros(arr):
    n=len(arr)
    j=0
    for i in range(n):
        if arr[i]!=0:
            arr[j],arr[i]=arr[i],arr[j]
            j+=1
    return arr

arr=[1,3,0,9,6,0,2]
result=move_zeros(arr)
print("Array after moving zeros to the end:",result)