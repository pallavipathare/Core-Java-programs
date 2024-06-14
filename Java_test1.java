import java.util.Scanner;
public class Java_test1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Binary right angle triangle Pattern");
        System.out.print("Enter the range ");
        int a = scan.nextInt();
        for(int i = 0 ; i < a ; i++){
            for(int j = 0; j < i ; j++){
                if((i + j)% 2 == 0)
                    System.out.print("0 ");
                else
                System.out.print("1 ");
            }
            System.out.println(" ");
        }
        /////////////////////////////////////////
        System.out.println("Reactangle star Pattern (hallow)");
        System.out.print("Enter the range ");
        int b = scan.nextInt();
        for(int i = 0 ; i < b ; i++){
            for(int j = 0; j < b ; j++){
                if(i == 0 || j == 0 || i == (b-1) || j == (b-1))
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}