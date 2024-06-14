package DSA;

import java.util.Scanner;

public class ReverseElementsArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the range of array : ");
        int a = scan.nextInt();

        System.out.println("Enter the values of array");
        int[] arr = new int[a];
        for(int i = 0; i <arr.length; i++){
            arr[i] = scan.nextInt();
        }

        scan.close();

        System.out.println();          
        // displayes array elements in forward order
        System.out.print("Array Elements in forward order { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("Shit work");  // Shit Apporach :(
        // displayes array elements in reverse order
        System.out.print("Array Elements in reverse order { ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println("Approach 1"); // approach 1

        int[] arrtemp = new int[a];
        int itr = 0;
        for(int i = arr.length-1; i >= 0; i--){
            arrtemp[i] = arr[itr];
            itr = itr + 1;
        }
        System.out.print("Array Elements in reverse order { ");
        for(int i = 0; i < arrtemp.length; i++){
            System.out.print(arrtemp[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println("Approach 2"); // approach 2
        int temp1 = 0;
        int temp2 = arr.length - 1;
        while(temp1 < temp2){
            int temp = arr[temp1];
            arr[temp1] = arr[temp2];
            arr[temp2] = temp;

            temp1 = temp1 + 1;
            temp2 = temp2 - 1;
        }
        System.out.print("Array Elements in forward order { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}