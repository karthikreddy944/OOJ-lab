import java.util.Scanner;

public class indexoutofbound {
    public static void main(String[] args) {
        String[] items = {"karthik", "jayesh", "kedhar", "venkat"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an index: ");
            int index = sc.nextInt();

            System.out.println("Item at index: " + items[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (Exception e) {
            System.out.println("Error: Please enter an integer.");
        }
    }
}
