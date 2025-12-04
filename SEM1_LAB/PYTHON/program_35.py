class Publisher:
    def __init__(self,name):
        self.name=name

    def display(self):
        print(f"Publisher Name:{self.name}")

class Book(Publisher):
    def __init__(self,name,title,author):
        super().__init__(name)
        self.title=title
        self.author=author

    def display(self):
        super().display()
        print(f"Book Title:{self.title}")
        print(f"Author:{self.author}")

class Python(Book):
    def __init__(self,name,title,author,price,no_of_pages):
        super().__init__(name,title,author)
        self.price=price
        self.no_of_pages=no_of_pages
    
    def display(self):
        super().display()
        print(f"Price:{self.price}")
        print(f"Number of pages:{self.no_of_pages}")


b=Python("abc","xya","yuh",789,90)
b.display()

    
