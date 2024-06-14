import java.util.Scanner;
public class abstractionexample1 {
   public static void main(String[] args){
        samemethod obj = new samemethod();
        obj.matrixsubs();
        obj.armstrong();
        obj.fibonacciseries();
   }
}
class samemethod {
    Scanner scan = new Scanner(System.in);
    public void matrixsubs(){
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
        System.out.println("Subtarction of matrix A and matrix B is : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void armstrong(){
        int n,r,sum=0,temp;
        System.out.println("Enter the number to check it is Armgstrong or not");
        n = scan.nextInt();
        temp = n;
        while(n>0){
            r = n % 10;
            sum = sum + (r * r * r);
            n = n /10;
        }
        if(temp == sum)
            System.out.println("It is a armsrtong number");
        else
            System.out.println("It is not a armstrong number");    
    }
    public void fibonacciseries(){
         int a=0 , b=1, c, i, n;
        System.out.print("Enter the Fibonacci range : ");
        n = scan.nextInt();
        System.out.print(a + " " + b);
        for(i=3; i<=n; i++){
            c = a + b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}