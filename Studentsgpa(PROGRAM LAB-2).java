import java.util.Scanner;
class Student{
    String USN,Name;
    int[] cred;
    int[] mark;
    int noOfSubjects;
    int[] grade;
    double sgpa=0.0;
    int weightedGradePoints=0;
    int totalCredits=0;
    
    void accept(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the USN:");
        USN= scan.nextLine();
        System.out.println("Enter the name:");
        Name=scan.nextLine();
        System.out.println("Enter the no.of total subjects:");
        noOfSubjects=scan.nextInt();
        cred=new int[noOfSubjects];
        mark=new int[noOfSubjects];
        for(int i=0;i<noOfSubjects;i++){
            System.out.println("Enter the credits:");
            cred[i]=scan.nextInt();
            System.out.println("Enter the marks:");
            mark[i]=scan.nextInt();
        }
        
    }
    void display(){
        System.out.println("USN: "+USN);
        System.out.println("NAME: "+Name);
        System.out.println("The no.of subjects: "+noOfSubjects);
        System.out.println("The credits are: ");
        for(int i=0;i<noOfSubjects;i++){
            System.out.print(cred[i]+" ");
        }
        System.out.println("");
        System.out.println("The marks of the subjects are: ");
        for(int i=0;i<noOfSubjects;i++){
            System.out.print(mark[i]+" ");
        }
        System.out.println("");

    }
    void gradePoints(){
        grade=new int[noOfSubjects];
        for(int i=0;i<mark.length;i++){
            if (mark[i] >= 90){
                grade[i]=10;
            }else if (mark[i] >= 80){
                grade[i]=9;
            }else if (mark[i] >= 70){
                grade[i]=8;
            }else if (mark[i] >= 60){
                grade[i]=7;
            }else if (mark[i] >= 50){
                grade[i]=6;
            }else if (mark[i] >= 40){
                grade[i]=5;
            }else{
                grade[i]=0;
            }
        }
    }
    void SGPA(){
    for(int i = 0; i < noOfSubjects; i++){
        weightedGradePoints += cred[i] * grade[i];  // Weighted grade points
        totalCredits += cred[i];                    // Total credits
    }

    // Calculate SGPA
    sgpa = (double)weightedGradePoints / totalCredits;
        System.out.println("The SGPA of the "+Name+" is: "+sgpa);
    }
}
public class Studentsgpa {
    public static void main(String arr[]){
        Student student=new Student();
        student.accept();
        student.display();
        student.gradePoints();
        student.SGPA();

    }    
}
