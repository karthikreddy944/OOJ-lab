
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    int fatherAge;

    
    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.fatherAge = age;
    }
}


class Son extends Father {
    int sonAge;

    
    Son(int fAge, int sAge) throws WrongAge, Exception {
        super(fAge);  

        if (sAge >= fAge) {
            throw new Exception("Son's age cannot be greater than or equal to Father's age!");
        }

        this.sonAge = sAge;
    }
}


public class demo4 {
    public static void main(String[] args) {
        try {
            Son s = new Son(40, 20);
            System.out.println("Object created successfully!");
        } 
        catch (WrongAge e) {
            System.out.println("WrongAge Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        
        try {
            Son s2 = new Son(-35, 10);   
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Son s3 = new Son(40, 45);   
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
