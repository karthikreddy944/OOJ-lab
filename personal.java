package CIE;
import java.util.*;

public class personal {
    public String usn;
    public String name;
    public int sem;

    Scanner sc = new Scanner(System.in);

    public void readPersonal() {
        System.out.print("Enter USN: ");
        usn = sc.next();

        System.out.print("Enter Name: ");
        name = sc.next();      // use nextLine() if you want full name with spaces

        System.out.print("Enter Semester: ");
        sem = sc.nextInt();
    }

    public void displayPersonal() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}
