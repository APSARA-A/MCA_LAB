def reverse(str):
    words=str.split()
    reverse_word=words[::-1]
    reverse_name=' '.join(reverse_word)
    return reverse_name

str=input("enter a full name:")
print("reverse of the name is",reverse(str))

