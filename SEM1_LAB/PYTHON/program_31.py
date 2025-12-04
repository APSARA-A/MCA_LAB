class Rectangle:
    def __init__(self,length,breadth):
        self.length=length
        self.breadth=breadth

    def area(self):
        return self.length * self.breadth
    
    def perimeter(self):
        return 2*(self.length + self.breadth)

    
    
r1=Rectangle(5,7)
r2=Rectangle(4,8)

print("Rectanle 1: Area=", r1.area(), "Perimeter=",r1.perimeter())
print("Rectanle 2: Area=", r2.area(), "Perimeter=",r2.perimeter())

if r1.area() > r2.area():
        print("Rectangle1 is larger than rectangle2")
elif r1.area() < r2.area():
        print("Rectangle2 is larger than Rectangle1")
else:
        print("Rectangle1 and Rectangle2 has equal area")



