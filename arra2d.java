import java.util.Scanner;
public class arra2d {
    public static void main(String1[] args) throws Exception{
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        a = scan.nextInt();
        int[][] arr = new int[a][a];

        System.out.print("Enter the 2D Array values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr[i][j] = scan.nextInt();
        }

        System.out.println("2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        scan.close();
     }
}