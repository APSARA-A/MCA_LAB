color=input("enter colors separated by commas:")
color_list=color.split(",")
print(color_list)
print("Alternate Colours:")
for i in range(0,len(color_list),2):
    print(color_list[i])