import java.util.Scanner;

public class matrixnondiag {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        int a = scan.nextInt();
        int[][] arr1 = new int[a][a];
        int sum1 = 0 , sum2 = 0;
        System.out.print("Enter the Array values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr1[i][j] = scan.nextInt();
        }
        System.out.println("A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i+j == 0 || i+j == 1){
                    sum1 += arr1[i][j];
                }
                 if(i+j ==  3|| i+j == 4){
                    sum2 += arr1[i][j];
                }
            }
        }
        System.out.println("Addition of upper non diagonal elements is "+ sum1);
        System.out.println("Addition of lower non diagonal elements is "+ sum2);
        scan.close();
    }
}
