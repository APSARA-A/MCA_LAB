class Rectangle:
    def __init__(self,length,breadth):
        self.__length=length
        self.__breadth=breadth

    def area(self):
        return self.__length * self.__breadth
    
r1=Rectangle(6,9)
r2=Rectangle(5,6)

if r1.area() < r2.area():
    print("Rectangle2 have higher area")
elif r2.area()< r1.area():
    print("Rectangle1 have higher area")
else:
    print("Both rectangle have same area")