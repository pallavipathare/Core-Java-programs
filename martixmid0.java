import java.util.Scanner;
public class martixmid0 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of row and colunm (R x C): ");
        int a = scan.nextInt();
        int[][] arr1 = new int[a][a];
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
        int sum1 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i==1){
                    sum1 += arr1[i][j];
                }
            }
        }
        System.out.println("Addition of mid elements is "+ sum1);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(j == 1 && i == 1){
                    arr1[i][j] = 0;
                }
            }
        }
         System.out.println("A 2D Array after mid element 0 is: ");
        for(int i=0; i<a; i++){
            for(int j=0 ; j<a; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        int sum2 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                 if(i+j ==  3|| i+j == 4){
                    sum2 += arr1[i][j];
                }
            }
        }
        System.out.println("Addition of elements is "+ sum2);
        scan.close();
    }
}