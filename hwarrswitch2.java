import java.util.Scanner;

public class hwarrswitch2 {
    public static void main(String1[] args){
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("###Menu###");
        System.out.println("1. Matrix Diagonal-0 \n2. Matrix Addition of row elements \n3. Martix Addition of column elements ");
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 :
                int a;
                System.out.print("Enter the value of row and colunm (R x C): ");
                a = scan.nextInt();
                int[][] arr1 = new int[a][a];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<a; i++){
                    for(int j=0; j<a; j++)
                        arr1[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        System.out.print(arr1[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("Diagonal 0 of A 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        if(i == j){
                            arr1[i][j] = 0;
                            System.out.print(arr1[i][j] + " ");
                        }
                        else{
                            System.out.print(arr1[i][j] + " ");
                        }
                    }
                    System.out.println("");
                }
            break;
            
            case 2 :
                System.out.print("Enter the value of row and colunm (R x C): ");
                int val = scan.nextInt();
                int[][] array = new int[val][val];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<val; i++){
                    for(int j=0; j<val; j++)
                        array[i][j] = scan.nextInt();
                }
                System.out.println(" ");
                System.out.println("A 2D Array is: ");
                for(int i=0; i<val; i++){
                    for(int j=0 ; j<val; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println(" ");
                for(int i = 0 ;i < val; i++){
                    int addr = 0;
                    for(int j = 0;j < val; j++){     
                        addr += array[i][j];
                    }
                    System.out.println("Addition of row "+ (i+1) + " elements is " + addr);
                }
            break;
            case 3 :
                System.out.print("Enter the value of row and colunm (R x C): ");
                int valk = scan.nextInt();
                int[][] array1 = new int[valk][valk];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<valk; i++){
                    for(int j=0; j<valk; j++)
                        array1[i][j] = scan.nextInt();
                }
                System.out.println(" ");
                System.out.println("A 2D Array is: ");
                for(int i=0; i<valk; i++){
                    for(int j=0 ; j<valk; j++){
                        System.out.print(array1[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println(" ");
                for(int i = 0 ;i < valk; i++){
                int  addc = 0;
                    for(int j = 0;j < valk; j++){
                        addc += array1[j][i];
                    }
                    System.out.println("Addition of column  "+ (i+1) + " elements is " + addc);
                }
            break;
            default:
                System.out.println("Invalid Option!");
            break;
        }
        scan.close();
    }
}
