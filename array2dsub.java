import java.util.Scanner;
public class array2dsub {
    public static void main(String1[] args) throws Exception{
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        a = scan.nextInt();
        int[][] arr1 = new int[a][a];
        int[][] arr2 = new int[a][a];
        int[][] arr3 = new int[a][a];

        System.out.print("Enter the A 2D Array  values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr1[i][j] = scan.nextInt();
        }
        System.out.print("Enter the B 2D Array values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr2[i][j] = scan.nextInt();
        }

        System.out.println(" A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" B 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("A 2D Array - B 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }   
        scan.close();
     }
}