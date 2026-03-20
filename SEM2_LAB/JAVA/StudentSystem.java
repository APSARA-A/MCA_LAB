import java.util.*;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        int choice;

        do {
            System.out.println("\n1.Add 2.Search 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    students.put(id, name);
                    break;

                case 2:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    if (students.containsKey(sid))
                        System.out.println("Name: " + students.get(sid));
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    System.out.println(students);
                    break;
            }
        } while (choice != 4);
    }
}