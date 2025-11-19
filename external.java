package SEE;
import java.util.*;
import CIE.*;  // To access Personal

public class external extends personal {
    public int[] seeMarks = new int[5];
    Scanner sc = new Scanner(System.in);

    public void readSeeMarks() {
        System.out.println("Enter SEE Marks (5 courses):");
        for (int i = 0; i < 5; i++) {
            System.out.print("  SEE marks for course " + (i + 1) + ": ");
            seeMarks[i] = sc.nextInt();
        }
    }
}
