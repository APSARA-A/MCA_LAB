word=input("enter words separated by commas:").split(",")
print("Longest word:",max(word,key=len))