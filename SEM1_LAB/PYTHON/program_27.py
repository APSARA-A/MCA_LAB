filename=input("enter the file name:")
n=int(input("enter the line number to remove:"))
file=open(filename,"r")
lines=file.readlines()
file.close()
del lines[n-1]

file=open(filename,"w")
file.writelines(lines)
file.close()
print("line removed successfully")