package CIE;
import java.util.*;

public class internals {
    public int[] internalMarks = new int[5];
    Scanner sc = new Scanner(System.in);

    public void readInternalMarks() {
        System.out.println("Enter Internal Marks (5 courses):");
        for (int i = 0; i < 5; i++) {
            System.out.print("  Internal marks for course " + (i + 1) + ": ");
            internalMarks[i] = sc.nextInt();
        }
    }
}
