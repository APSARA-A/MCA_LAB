filename=input("enter the file name:")
try:
    file=open(filename,"r")
    count=0
    for line in file:
        count+=1
    
    print("total number of lines:",count)
    file.close()

except FileNotFoundError:
    print("file not found.Please check the filename")