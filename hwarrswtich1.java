import java.util.Scanner;

public class hwarrswtich1 {
    public static void main(String1[] args){
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("###Menu###");
        System.out.println("1. Matrix Addition \n2. Matrix  Substraction \n3. Martix Transpose ");
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 :
                System.out.print("Enter the value of row and colunm (R x C): ");
                int a = scan.nextInt();
                int[][] arr1 = new int[a][a];
                int[][] arr2 = new int[a][a];
                int[][] arr3 = new int[a][a];
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<a; i++){
                    for(int j=0; j<a; j++)
                        arr1[i][j] = scan.nextInt();
                }
                System.out.print("Enter the B 2D Array values: ");
                for(int i=0; i<a; i++){
                    for(int j=0; j<a; j++)
                        arr2[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        System.out.print(arr1[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println(" B 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        System.out.print(arr2[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("A 2D Array + B 2D Array is: ");
                for(int i=0; i<a; i++){
                    for(int j=0 ; j<a; j++){
                        arr3[i][j] = arr1[i][j] + arr2[i][j];
                        System.out.print(arr3[i][j] + " ");
                    }
                    System.out.println("");
                }
            break;
            
            case 2 :
                System.out.print("Enter the value of row and colunm (R x C): ");
                int sub = scan.nextInt();
                int[][] arr1s = new int[sub][sub];
                int[][] arr2s = new int[sub][sub];
                int[][] arr3s = new int[sub][sub];
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<sub; i++){
                    for(int j=0; j<sub; j++)
                        arr1s[i][j] = scan.nextInt();
                }
                System.out.print("Enter the B 2D Array values: ");
                for(int i=0; i<sub; i++){
                    for(int j=0; j<sub; j++)
                        arr2s[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<sub; i++){
                    for(int j=0 ; j<sub; j++){
                        System.out.print(arr1s[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println(" B 2D Array is: ");
                for(int i=0; i<sub; i++){
                    for(int j=0 ; j<sub; j++){
                        System.out.print(arr2s[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("A 2D Array - B 2D Array is: ");
                for(int i=0; i<sub; i++){
                    for(int j=0 ; j<sub; j++){
                        arr3s[i][j] = arr1s[i][j] - arr2s[i][j];
                        System.out.print(arr3s[i][j] + " ");
                    }
                    System.out.println("");
                }   
            break;
            case 3 :
                int transpose;
                System.out.print("Enter the value of row and colunm (R x C): ");
                transpose = scan.nextInt();
                int[][] arr1trs = new int[transpose][transpose];
        
                System.out.print("Enter the A 2D Array  values: ");
                for(int i=0; i<transpose; i++){
                    for(int j=0; j<transpose; j++)
                        arr1trs[i][j] = scan.nextInt();
                }
        
                System.out.println(" A 2D Array is: ");
                for(int i=0; i<transpose; i++){
                    for(int j=0 ; j<transpose; j++){
                        System.out.print(arr1trs[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.print("");
                System.out.println("Transpose of A 2D Array is: ");
                for(int i=0; i<transpose; i++){
                    for(int j=0 ; j<transpose; j++){
                        System.out.print(arr1trs[j][i] + " ");
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
