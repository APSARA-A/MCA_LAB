color_list1=input("enter comma separated colors:").split(',')
color_list2=input("enter another comma separated colors:").split(',')
print("colours from color_list1 not contained in color_list2",set(color_list1)-set(color_list2))