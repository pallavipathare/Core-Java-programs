import java.util.Scanner;
public class practicematrix0 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        int a = scan.nextInt();
        int[][] arr1 = new int[a][a];
        System.out.print("Enter the A 2D Array  values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
            arr1[i][j] = scan.nextInt();
        }
        System.out.println("A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println("");
        }
        int sum = 0;
        System.out.println("After 0 of A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                if(i + j == 1 || i + j == 3){
                    arr1[i][j] = 0;
                    System.out.print(arr1[i][j] + " ");
                }
                else{
                    System.out.print(arr1[i][j] + " ");
                    sum += arr1[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Sum is " + sum);
        // System.out.println("Diagonally 0 of A 2D Array is: ");
        // for(int i=0; i<a; i++){
        //     for(int j=0 ; j<a; j++){
        //         if(i == j || i + j == 2){
        //             arr1[i][j] = 0;
        //             System.out.print(arr1[i][j] + " ");
        //         }
        //         else{
        //             System.out.print(arr1[i][j] + " ");
        //             sum += arr1[i][j];
        //         }
        //     }
        //     System.out.println("");
        // }
        // System.out.println("Sum is " + sum);
        scan.close();
    }
}