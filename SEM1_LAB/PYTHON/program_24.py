#find the factorial of a number
def factorial(n):
    if n==0 or n==1:
        return 1
    else:
        return n * factorial(n-1)
    
num=int(input("Enter a number"))
print(f"Factorial of {num} is {factorial(num)}")

#find the nth fibonacci number
def fibonacci(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibonacci(n-1)+fibonacci(n-2)
    
n=int(input("Enter n:"))
print(f"The {n}th fibonacci number is {fibonacci(n)}")

#sum of an integer list
def sum_list(lst):
    if not lst:
        return 0
    else:
        return lst[0]+sum_list(lst[1:])
    
numbers=[1,2,3,4,5]
print(f"sum of the list {numbers} is {sum_list(numbers)}")

#sum of first N whole numbers
def sum_n(n):
    if(n==0):
        return 0
    else:
        return n+sum_n(n-1)
    
n=int(input("enter n:"))
print(f"sum of first {n} whole number is {sum_n(n)}")
