import java.util.*;

public class nameList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add 2.Remove 3.Search 4.Sort 5.Display 6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    names.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    names.remove(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    if (names.contains(search))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    Collections.sort(names);
                    System.out.println("Sorted");
                    break;

                case 5:
                    System.out.println("Names: " + names);
                    break;
            }
        } while (choice != 6);
    }
}
