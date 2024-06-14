import java.util.Scanner;
public class abstractionexample {
    public static void main(String[] args){
        matrixadd obj = new matrixadd();
        obj.funtion();
        obj.funtion1();
    }
}
abstract class factorial11 {
    abstract void funtion();
    public void funtion1(){
        int i, n=5, fact=1;
        for (i =1 ; i <= n; i++){
            fact = fact *i;
        }
        System.out.println("Factorial is " + fact);
    }
}
class matrixadd extends factorial11{
    public void funtion(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        int a = scan.nextInt();
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
        System.out.println("Addition of matrix A and matrix B is : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
        scan.close();
    }
}