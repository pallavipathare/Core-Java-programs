import java.util.Scanner;

public class evennoddmatrixele {
    public static void main(String1[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int counte = 0, counto = 0 ;
        System.out.print("Enter the value of row and colunm (R x C): ");
        int a = scan.nextInt();
        int[][] arr1 = new int[a][a];
        System.out.print("Enter the A 2D Array  values: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++)
                arr1[i][j] = scan.nextInt();
        }
        System.out.println(" ");
        System.out.println("A 2D Array is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Even and Odd counts ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                if(arr1[i][j] % 2 == 0){
                    System.out.println("Even element is " + arr1[i][j]);
                    counte++;
                }
                else{
                    System.out.println("Odd element is " + arr1[i][j]);
                    counto ++;
                }
            }
        }
        System.out.println("Total Count of even number is " + counte);
        System.out.println("Total Count of odd number is " + counto);
        scan.close();
    }
}