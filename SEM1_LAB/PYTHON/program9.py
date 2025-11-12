word=input("enter a word:")
freq={ }
for char in word:
    if char.isalpha():
        char=char.lower()
        if char in freq:
            freq[char]+=1 
        else:
            freq[char]=1

print("frequency of alphabets in the word:",freq)