def move_even(arr):
    n=len(arr)
    j=0
    for i in range(n):
        if arr[i]%2==0:
            arr[i],arr[j]=arr[j],arr[i]
            j+=1
    return arr

arr=[1,3,0,9,6,0,2]
result=move_even(arr)
print("Array after moving even numbers to the end:",result)