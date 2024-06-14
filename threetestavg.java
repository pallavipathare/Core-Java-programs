import java.util.Scanner;

public class threetestavg {

    public static int[] threeTestMarks(int numOfTest){
        Scanner scan = new Scanner(System.in);
        int[] testMarks = new int[numOfTest];

        for(int i = 0; i < numOfTest; i++){
            System.out.print("Enter Test mark " + (i + 1) + ": " );
            testMarks[i] = scan.nextInt();
        }
        return testMarks;
    }

    public static void main(String[] args) {
        int allSubject = 6, allTest = 3, totalMarks = 0;
        double averageMarks = 0.0;
        int [][] allSubjectMarks = new int[allSubject][allTest];

        for(int subject = 0; subject < allSubject; subject++ ){
            System.out.println("\nEnter marks for subject " + (subject + 1));

            allSubjectMarks [subject] = threeTestMarks(allTest);
        }

        for(int row = 0; row < allSubject; row++){
            for(int col = 0; col < allTest; col ++){
                totalMarks += allSubjectMarks[row][col];
                averageMarks = totalMarks/3;
            }
 
            System.out.println("\nTotal Marks of Subject "+(row + 1) + " is "+ totalMarks);
            System.out.println("Average Marks of Subject "+(row + 1) + " is "+ averageMarks);
            totalMarks = 0;
        }
    }
}
