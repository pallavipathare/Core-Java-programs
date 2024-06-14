package DSA;

import java.util.Scanner;

public class MinMaxInArrray {

    static int recursionmin (int arr[], int len){
            if(len == 1)
            return arr[0];

            return Math.min(arr[len-1], recursionmin(arr, len-1));
        }

    static int recursionmax (int arr[], int len){
            if(len == 1)
            return arr[0];

            return Math.max(arr[len-1], recursionmax(arr, len-1));
        }

// MAIN FUNCTION
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

        System.out.print("Array Elements { ");  // displays array elements
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
        System.out.println();

        System.out.println("Approach 1");  // approach 1 control statement

        int minel = arr[0];
        int maxel = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(minel > arr[i])            // minimum value element in array
                minel = arr[i];

            if(maxel < arr[i])            // maximum value element in array
                maxel = arr[i];
        }
        System.out.println("Minimum Element in array is " + minel);
        System.out.println("Maximum Element in array is " + maxel);

        System.out.println("Apprach 2");   // approach 2 recursion
        System.out.println("Minimum Element in array is " + recursionmin(arr, arr.length));
        System.out.println("Maximum Element in array is " + recursionmax(arr, arr.length));
    }
}