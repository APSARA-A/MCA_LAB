name=input("enter names separated by commas:").split(",")
names=[x for x in name if x.lower().startswith('a')]
count=sum(1 for name in name if name.lower().startswith('a'))
print("number of names starting with 'a':",count,names)