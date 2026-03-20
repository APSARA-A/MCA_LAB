import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
    


public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers not allowed");
                }

                sum += num;

            } catch (NegativeNumberException e) {
                System.out.println("Exception: " + e.getMessage());
                i--; // retry same input
            }
        }

        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
}