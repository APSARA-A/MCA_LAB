import numpy as np 
arr=np.arange(1,13)
print("Array:",arr)

arr_3x4=arr.reshape(3,4)
print(arr_3x4)
arr_2x2x3=arr.reshape(2,2,3)
print(arr_2x2x3)
print("Dimension:",arr_2x2x3.ndim)