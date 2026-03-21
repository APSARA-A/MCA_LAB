import java.io.*;


class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

// Main class
public class EmployeeFileDemo {
    public static void main(String[] args) {

        
        Employee emp = new Employee(101, "Appu", "IT", 50000);

        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("employee.dat"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object written to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }

       
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("employee.dat"));

            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Department: " + e.department);
            System.out.println("Salary: " + e.salary);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
