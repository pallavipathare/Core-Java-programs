import java.util.Arrays;

public class divi {

        public static void main(String[] args) throws Exception{

        int[] arr = {9, -3, 8, -6, -7, 8, 10};
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Calculate the sum of the two largest elements
        int sum = arr[n - 1] + arr[n - 2];

        System.out.println("Sum of two largest elements: " + sum);
    }
}
