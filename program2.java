import java.util.Scanner;
public class program2 {
    public static void main(String arr[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the roots a,b and c:");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double discriminant=b*b-4*a*c;
        if(a==0){
            System.out.println("It is not a quadratic equation");
        }else if(discriminant>0){
            System.out.println("The roots are real and distinct");
            double r1=((-b)+Math.sqrt(discriminant))/2*a;
            double r2=((-b)-Math.sqrt(discriminant))/2*a;
            System.out.println("The roots are r1:"+r1+" r2:"+r2);
        }else if(discriminant==0){
            System.out.println("The roots are real and equal");
            double r1=((-b)+Math.sqrt(discriminant))/2*a;
            System.out.println("The roots are r1:"+r1+" r2:"+r1);
        }else{
            System.out.println("The roots are imaginary");
            double realpart=-b/2*a;
            double imaginarypart=(Math.sqrt(-discriminant))/2*a;
            System.out.println("The roots are r1:"+realpart+"+"+imaginarypart+"  r2:"+realpart+"-"+imaginarypart);
        }
    }
}
