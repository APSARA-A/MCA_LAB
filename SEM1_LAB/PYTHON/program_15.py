n = int(input("enter limit: "))
a, b = 0, 1
print("Fibonacci Series:")

if n <= 0:
    print("enter a positive number")
elif n == 1:
    print(a)
else:
    print(a, b, end=" ")

    for i in range(2, n):
        c = a + b
        print(c, end=" ")
        a, b = b, c

