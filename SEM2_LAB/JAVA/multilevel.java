import java.util.Scanner;

// Base Class
class Person {
    String name, gender, address;
    int age;

    void inputPerson(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

// Derived Class 1
class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;

    void inputEmployee(Scanner sc) {
        inputPerson(sc);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

// Derived Class 2
class Teacher extends Employee {
    int teacherId;
    String subject, department;

    void inputTeacher(Scanner sc) {
        inputEmployee(sc);
        System.out.print("Enter Teacher ID: ");
        teacherId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayTeacher() {
        System.out.println("\n--- Teacher Details ---");
        displayEmployee();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

// Main Class
public class multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));
            t[i] = new Teacher();
            t[i].inputTeacher(sc);
        }

        // Display
        System.out.println("\n===== Teacher Details =====");
        for (int i = 0; i < n; i++) {
            t[i].displayTeacher();
        }

        sc.close();
    }
}