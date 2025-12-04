class Bank:
    def __init__(self,acc_no,name,acc_type,balance):
        self.acc_no=acc_no
        self.name=name
        self.acc_type=acc_type
        self.balance=balance

    def deposite(self):
        amount=int(input("Enter amount to deposite"))
        self.balance+=amount
        print(f"Current Blance:{self.balance}")

    def withdraw(self):
        amount=int(input("enter amount to withdraw"))
        if(amount>self.balance):
            print("Not enough money to withdraw")
        else:
         self.balance-=amount
         print(f"withdraw {amount}")
         print(f"Current Blance:{self.balance}")

    def display(self):
        print("\n------ Bank Account Details ------")
        print(f"Account Number : {self.acc_no}")
        print(f"Name           : {self.name}")
        print(f"Account Type   : {self.acc_type}")
        print(f"Balance        : {self.balance}")
        print("----------------------------------")
         
    
    
    
b=Bank(12345678,'APSARA','SAVINGS',10000)
b.display()
b.deposite()
b.withdraw()
    



