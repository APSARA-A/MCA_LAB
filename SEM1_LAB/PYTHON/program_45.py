#def second_largest(arr):
    #arr=list(set(arr))
    #arr.sort()
    #return arr[-2] if len(arr) >= 2 else None

#arr=[3, 1, 4, 1, 5, 9]
#result=second_largest(arr)
#print("The second largest number is:", result)

def kth_largest(arr,k):
    arr=list(set(arr))
    arr.sort(reverse=True)
    return arr[k-1] if len(arr) >= k else None

arr=[3, 1, 4, 1, 5, 9]
k=3
result=kth_largest(arr,k)
print(f"The {k}-th largest number is:", result)
    