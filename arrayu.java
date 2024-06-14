import java.util.Scanner;
public class arrayu {
    public static void main(String1[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int a = scan.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter the Array values: ");
        for(int i=0; i<a; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Array is: ");
        for(int i=0; i<a; i++){
         System.out.print(arr[i]);
        }
        scan.close();
     }
}