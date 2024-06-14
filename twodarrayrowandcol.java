import java.util.Scanner;
public class twodarrayrowandcol {
     public static void main(String1[] args) throws Exception{
        int adddo = 0, addndo=0;
        Scanner scan = new Scanner(System.in);
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
            for(int j=0 ; j<a; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for(int i = 0 ;i < a; i++){
            int addr = 0;
            for(int j = 0;j < a; j++){     
                addr += arr1[i][j];
            }
            System.out.println("Addition of row "+ (i+1) + " elements is " + addr);
        }
        System.out.println(" ");
        for(int i = 0 ;i < a; i++){
           int  addc = 0;
            for(int j = 0;j < a; j++){
                addc += arr1[j][i];
            }
            System.out.println("Addition of column  "+ (i+1) + " elements is " + addc);
        }
        System.out.println(" ");
        for(int i = 0 ;i < a; i++){
            for(int j = 0;j < a; j++){
                if(i == j)
                    adddo += arr1[i][j];
                else
                    addndo += arr1[i][j];
            }
        }
        System.out.println("Addition of Diagonal elements is " + adddo);
        System.out.println("Addition of Non Diagonal elements is " + addndo);
        scan.close();
     }
}