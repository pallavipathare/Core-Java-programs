import java.util.Scanner;
public class arraytranspose {
    public static void main(String1[] args) throws Exception{
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        a = scan.nextInt();
        int[][] arr1 = new int[a][a];

        System.out.print("Enter the A 2D Array  values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr1[i][j] = scan.nextInt();
        }

        System.out.println(" A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        // System.out.print("");
        // System.out.println("Transpose of A 2D Array is: ");
        // for(int i=0; i<a; i++){
        //     for(int j=0 ; j<a; j++){
        //         System.out.print(arr1[j][i] + " ");
        //     }
        //     System.out.println("");
        // }
        System.out.println("Diagonal 0 of A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                if(i == j){
                    arr1[i][j] = 0;
                    System.out.print(arr1[i][j] + " ");
                }
                else{
                    System.out.print(arr1[i][j] + " ");
                }
            }
            System.out.println("");
        }
        scan.close();
     }
}