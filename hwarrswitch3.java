import java.util.Scanner;

public class hwarrswitch3 {
     public static void main(String1[] args){
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("###Menu###");
        System.out.println("1. Matrix Even and odd Elements \n2. Matrix lower 0th elements \n3. Martix upper 0th elements ");
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 :
                int counte = 0, counto = 0 ;
                System.out.print("Enter the value of row and colunm (R x C): ");
                int a = scan.nextInt();
                int[][] arr1 = new int[a][a];
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<a; i++){
                    for(int j=0; j<a; j++)
                        arr1[i][j] = scan.nextInt();
                }
                System.out.println(" ");
                System.out.println("A 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++)
                        System.out.print(arr1[i][j] + " ");
                    System.out.println("");
                }
                System.out.println(" ");
                System.out.println("Even and Odd counts ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        if(arr1[i][j] % 2 == 0){
                            System.out.println("Even element is " + arr1[i][j]);
                            counte++;
                        }
                        else{
                            System.out.println("Odd element is " + arr1[i][j]);
                            counto ++;
                        }
                    }
                }
                System.out.println("Total Count of even number is " + counte);
                System.out.println("Total Count of odd number is " + counto);
            break;
            
            case 2 :
                int val;
                System.out.print("Enter the value of row and colunm (R x C): ");
                val = scan.nextInt();
                int[][] array = new int[val][val];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<val; i++){
                    for(int j=0; j<val; j++)
                        array[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<val; i++){
                    for(int j=0 ; j<val; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("lower 0th elements of A 2D Array is: ");
                for(int i=0; i<val; i++){
                    for(int j=0 ; j<val; j++){
                        if(i > j){
                            array[i][j] = 0;
                            System.out.print(array[i][j] + " ");
                        }
                        else{
                            System.out.print(array[i][j] + " ");
                        }
                    }
                    System.out.println("");
                }
            break;
            case 3 :
                int val1;
                System.out.print("Enter the value of row and colunm (R x C): ");
                val1 = scan.nextInt();
                int[][] array1 = new int[val1][val1];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<val1; i++){
                    for(int j=0; j<val1; j++)
                        array1[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<val1; i++){
                    for(int j=0 ; j<val1; j++){
                        System.out.print(array1[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("upper 0th  elements of A 2D Array is: ");
                for(int i=0; i<val1; i++){
                    for(int j=0 ; j<val1; j++){
                        if(i < j){
                            array1[i][j] = 0;
                            System.out.print(array1[i][j] + " ");
                        }
                        else{
                            System.out.print(array1[i][j] + " ");
                        }
                    }
                    System.out.println("");
                }
            break;
            default:
                System.out.println("Invalid Option!");
            break;
        }
        scan.close();
    }

}
