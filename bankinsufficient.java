import java.util.Scanner;
class insufficentbalanceexception extends Exception{
    public insufficentbalanceexception(String message){
        super(message);
    }
}
class bankinsufficient{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        double balance=5000;
        System.out.println("Enter the withdrawal amount:");
        try{
            double amount =sc.nextDouble();
            if(amount>balance){
                throw new insufficentbalanceexception("Error: Withdrawal amount eceeds balance ");
            }
             balance-=amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance : "+balance);
        }
        catch(insufficentbalanceexception e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error:please enter a numeric value");
        }
       
    }
}