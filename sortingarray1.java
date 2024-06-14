import java.util.Scanner;
public class sortingarray1 {
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
        // accending sort
        for(int i=0 ; i<a; i++){
            for(int j=i+1; j<a; j++){
                if(arr[i]>arr[j]){
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Accending Sorted Array is : ");
        for(int i=0; i<a; i++){
            System.out.print(arr[i] + " ");
        }
        // decending array
        for(int i=0 ; i<a; i++){
            for(int j=i+1; j<a; j++){
                if(arr[i]<arr[j]){
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Decending Sorted Array is : ");
        for(int i=0; i<a; i++){
            System.out.print(arr[i] + " ");
        }
        scan.close();
     }
}