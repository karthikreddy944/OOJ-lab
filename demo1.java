import java.util.*;
import CIE.*;
import SEE.*;

class demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        internals[] in = new internals[n];
        external[] ex = new external[n];

        // Input section
        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Enter details for Student " + (i + 1) + " ===");
            ex[i] = new external();
            in[i] = new internals();

            // Personal details (from External, because it extends Personal)
            ex[i].readPersonal();

            // Internal marks
            in[i].readInternalMarks();

            // SEE marks
            ex[i].readSeeMarks();
        }

        // Output final marks
        System.out.println("\n\n========= FINAL MARKS =========");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            ex[i].displayPersonal();

            System.out.println("Course-wise Final Marks (Internal + SEE):");
            for (int j = 0; j < 5; j++) {
                int finalMarks = in[i].internalMarks[j] + (ex[i].seeMarks[j])/2;
                System.out.println("  Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
