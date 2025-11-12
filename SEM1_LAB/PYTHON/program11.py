#list comprehension
#positive list of numbers from a given list
num=[1,-2,4,-9,10]
positive_list=[i for i in num if i>0]
print("positive numbers:",positive_list)


#list with square of numbers from a given list
num=[1,2,3,4]
square=[i**2 for i in num]
print("squares:",square)

#list containing vowels from a given word
word="mother"
vowel=[ch for ch in word if ch.lower() in 'aeiou']
print("vowels in word 'mother':",vowel)

#list of numbers by removing even numbers from a given list
num=[1,2,3,4,5,6]
odd_list=[i for i in num if i%2!=0]
print("odd numbers:",odd_list)

#display leap years from current year to future year entered by user
year=int(input("enter current year:"))
future=int(input("enter future year:"))
leap_year=[y for y in range(year,future+1) if(y%400==0)or(y%100!=0 and y%4==0)]
print("Leap years:",leap_year)