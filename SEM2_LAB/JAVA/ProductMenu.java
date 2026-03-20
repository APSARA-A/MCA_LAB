import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

public class ProductMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add 2.Sort by Name 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    list.add(new Product(name, price));
                    break;

                case 2:
                    list.sort((p1, p2) -> p1.name.compareTo(p2.name));
                    System.out.println("Sorted");
                    break;

                case 3:
                    for (Product p : list)
                        System.out.println(p);
                    break;
            }
        } while (choice != 4);
    }
}
