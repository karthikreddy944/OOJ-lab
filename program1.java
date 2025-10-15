import java.util.Scanner;
public class program1 {
    public static void main(String arr[]){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a = scan.nextInt();
        System.out.print("Enter the number b:");
        int b=scan.nextInt();
        System.out.println("The sum of the numbers "+a+" and "+b+" is:"+(a+b));
        System.out.println("The difference of the numbers "+a+" and "+b+" is:"+(a-b));
        System.out.println("The multiplication of the numbers "+a+" and "+b+" is:"+(a*b));
        System.out.println("The divison of the numbers "+a+" and "+b+" is:"+(a/b));

    }
}
