// Abstract base class
abstract class Animal {
    private String species;
    protected int age;
    protected double weight;
    String color;

   
    Animal() {
        species = "Unknown";
        age = 0;
        weight = 0.0;
        color = "Unknown";
    }

    
    Animal(String species, int age, double weight, String color) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    
    Animal(Animal a) {
        this.species = a.species;
        this.age = a.age;
        this.weight = a.weight;
        this.color = a.color;
    }

   
    String getSpecies() {
        return species;
    }

    
    abstract void display();
}


class Dog extends Animal {
    String breed;
    String name;
    String owner;

    Dog(String species, int age, double weight, String color,
        String breed, String name, String owner) {
        super(species, age, weight, color);
        this.breed = breed;
        this.name = name;
        this.owner = owner;
    }

    
    @Override
    void display() {
        System.out.println("---- Dog Details ----");
        System.out.println("Species: " + getSpecies());
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Breed: " + breed);
        System.out.println("Name: " + name);
        System.out.println("Owner: " + owner);
    }
}


class Cat extends Animal {
    String name;
    String eyeColor;
    double tailLength;

    Cat(String species, int age, double weight, String color,
        String name, String eyeColor, double tailLength) {
        super(species, age, weight, color);
        this.name = name;
        this.eyeColor = eyeColor;
        this.tailLength = tailLength;
    }

    // Overriding display()
    @Override
    void display() {
        System.out.println("---- Cat Details ----");
        System.out.println("Species: " + getSpecies());
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Tail Length: " + tailLength + " cm");
    }
}

// Main class
public class Animals {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Animal a;

        a = new Dog("Mammal", 4, 18.5, "Brown", "Labrador", "Rocky", "Appu");
        a.display();   

        System.out.println();

        a = new Cat("Mammal", 2, 4.5, "White", "Kitty", "Green", 25.0);
        a.display();   
    }
}
