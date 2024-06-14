import java.util.Scanner;

public class fornew {
    public static void main(String1[] args) throws Exception{
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array values: ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Array is: ");
        for(int b: arr){
         System.out.print(b);
        }
        scan.close();
     }
}
