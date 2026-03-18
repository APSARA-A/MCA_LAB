import java.util.*;


class Student {
    int rollNo;
    String name;
    int marks;
    static int count = 0; 

    
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
        count++;
    }

   
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
        count++;
    }

    
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
        count++;
    }

    
    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }

    
    static void compare(Student s1, Student s2) {
        if (s1.marks > s2.marks) {
            System.out.println(s1.name + " has more marks than " + s2.name);
        } else if (s1.marks < s2.marks) {
            System.out.println(s2.name + " has more marks than " + s1.name);
        } else {
            System.out.println("Both students have equal marks");
        }
    }
}

// Main class
public class StudentRankList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Roll No: ");
            int r = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks: ");
            int m = sc.nextInt();

            s[i] = new Student(r, name, m);
        }

        // Sort students by marks (descending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].marks < s[j].marks) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

       
        System.out.println("\n--- Rank List ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Rank " + (i + 1) + ": ");
            s[i].display();
        }

        
        System.out.println("\nTotal number of students: " + Student.count);

        // Compare two students
        if (n >= 2) {
            System.out.println("\nComparing first two students:");
            Student.compare(s[0], s[1]);
        }
    }
}
