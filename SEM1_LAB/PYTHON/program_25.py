source=input("enter the source file name:")
destination=input("enter the destination file name:")
file1=open(source,"r")
file2=open(destination,"w")
for line in file1:
    file2.write(line)

file1.close()
file2.close()
print("file copied successfully")