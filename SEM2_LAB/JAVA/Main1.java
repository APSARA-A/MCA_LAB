import java.util.Scanner;

class Geometry {

    // Area of square
    int area(int side) {
        return side * side;
    }

    // Area of rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometry g = new Geometry();

        // Square
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of square: " + g.area(s));

        // Rectangle
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of rectangle: " + g.area(l, b));

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle: " + g.area(r));
    }
} 
