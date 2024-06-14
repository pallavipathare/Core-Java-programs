import java.util.Scanner;
public class martixduplicates {
    public static void main(String1[] args) throws Exception{
        int p;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range of array : ");
        int a = scan.nextInt();
        System.out.println("Enter values of array : ");
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Array is : ");
        for(int i=0; i<a; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0 ; i<a; i++){
            for(int j=i+1; j<a; j++){
                if(arr[i] == arr[j]){
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Duplicate Array element is : ");
        for(int i=0; i<a; i++){
            System.out.print(arr[i] + " ");
        }
        scan.close();
     }
}