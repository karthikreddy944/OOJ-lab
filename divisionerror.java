import java.util.Scanner;

public class divisionerror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the num1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the num2: ");
            int num2 = sc.nextInt();

            double result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
