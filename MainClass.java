import mypackage.Addition;  

public class MainClass{
    public static void main(String[] args) {
        Addition a1 = new Addition();      
        int sum = a1.add(10, 20);          
        System.out.println("Sum: " + sum); 
    }
}
