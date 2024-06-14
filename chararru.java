import java.util.Scanner;

public class chararru {
    public static void main(String1[] args) throws Exception{
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        a = scan.nextInt();
        char[] arr = new char[a];
        System.out.print("Enter the Array values: ");
        for(int i=0; i<a; i++){
            arr[i] = scan.next().charAt(0);
        }
        System.out.print("Array is: ");
        for(int i=0; i<a; i++){
         System.out.print(arr[i]);
        }
        scan.close();
     }
}
