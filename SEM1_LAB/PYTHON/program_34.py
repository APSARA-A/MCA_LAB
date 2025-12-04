class Time:
    def __init__(self,hour,minute,second):
        self.__hour=hour
        self.__minute=minute
        self.__second=second

    def __add__(self,other):
        new_sec=self.__second + other.__second 
        new_min=self.__minute + other.__minute
        new_hr=self.__hour + other.__hour
        
        if new_sec >= 60:
            new_min += new_sec//60
            new_sec=new_sec%60

        if new_min >= 60:
            new_hr += new_min//60
            new_min=new_min%60

        return Time(new_hr,new_min,new_sec)
    
    def display(self):
        print(f"{self.__hour:02d} : {self.__minute:02d} : {self.__second:02d}")

t1=Time(2,45,50)
t2=Time(3,00,00)

print("Time 1:", end=" ")
t1.display()
print("Time 2:", end=" ")
t2.display()

t3=t1 + t2

print("sum of time:", end=" ")
t3.display()
        