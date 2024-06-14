import java.util.Scanner;

public class patternzig {
        // public static void main(String[] args) {
        //     System.out.println("Enter the Number for pattern");
        //     Scanner scan = new Scanner(System.in);
        //     int n = scan.nextInt();
        //     int count = 0;
        //     int[][] arr = new int[12][12];
    
        //     for (int i = 0; i < n; i++) {
        //         if (i % 2 == 1) {
        //             for (int j = 0; j <= i; j++) {
        //                 arr[j][i - j] = count++;
        //             }
        //         } else {
        //             for (int j = i; j >= 0; j--) {
        //                 arr[j][i - j] = count++;
        //             }
        //         }
        //     }
    
        //     for (int i = n - 1; i > 0; i--) {
        //         if (i % 2 == 0) {
        //             for (int j = 0; j < i; j++) {
        //                 arr[n - i + j][n - j - 1] = count++;
        //             }
        //         } else {
        //             for (int j = i - 1; j >= 0; j--) {
        //                 arr[n - 1 - j][n - i + j] = count++;
        //             }
        //         }
        //     }
    
        //     // Print the pattern
        //     for (int i = 0; i < n; i++) {
        //         for (int j = 0; j < n; j++) {
        //             if (arr[i][j] != 0) {
        //                 System.out.print(arr[i][j] + " ");
        //             }
        //         }
        //         System.out.println();
        //     }
        //     scan.close();
        // }
        
            // public static void main(String[] args) {
            //     printPattern(15);
            // }
        
            // public static void printPattern(int n) {
            //     int num = 1;
            //     int row = 1;
            //     boolean direction = true;
        
            //     while (num <= n) {
            //         int start = num;
            //         int end = num + row - 1;
        
            //         if (end > n) {
            //             end = n;
            //         }
        
            //         if (direction) {
            //             for (int i = start; i <= end; i++) {
            //                 System.out.print(i + " ");
            //             }
            //         } else {
            //             for (int i = end; i >= start; i--) {
            //                 System.out.print(i + " ");
            //             }
            //         }
        
            //         System.out.println();
            //         num += row;
            //         row++;
            //         direction = !direction;
            //     }
            // }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                int n = scanner.nextInt();
        
                int[] start = {1, 9, 10, 14, 15};
                int[] step = {1, -1, 1, -1, 1};
        
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i && j < start.length; j++) {
                        System.out.print(start[j] + " ");
                        start[j] += step[j];
                    }
                    System.out.println();
                }
                scanner.close();
            }
    }
    