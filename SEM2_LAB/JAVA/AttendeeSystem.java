import java.util.*;

class Attendee {
    String name, email;
    int registrationId;

    Attendee(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.registrationId = id;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Attendee)) return false;
        Attendee a = (Attendee) obj;
        return registrationId == a.registrationId;
    }

    public int hashCode() {
        return Objects.hash(registrationId);
    }

    public String toString() {
        return registrationId + " - " + name + " - " + email;
    }
}

public class AttendeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Attendee> set = new HashSet<>();
        int choice;

        do {
            System.out.println("\n1.Add 2.Display 3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Attendee a = new Attendee(name, email, id);

                    if (set.add(a))
                        System.out.println("Registered");
                    else
                        System.out.println("Duplicate ID! Not allowed");
                    break;

                case 2:
                    for (Attendee at : set)
                        System.out.println(at);
                    break;
            }
        } while (choice != 3);
    }
}
