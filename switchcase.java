import java.util.Scanner;

public class switchcase {
    public static void main(String1[] args){
        int choice, a ,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("###Menu###");
        System.out.println("1. Addition \n2. Substraction \n3.Multiplication \n4.Division ");
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 :
                    System.out.print("Enter Values of A & B : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Addition is " + (a+b));
            break;
            case 2 :
                    System.out.print("Enter Values of A & B : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Substraction is " + (a-b));
            break;
            case 3 :
                    System.out.print("Enter Values of A & B : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Multiplication is " + (a*b));
            break;
            case 4 :
                    System.out.print("Enter Values of A & B : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Division is " + (a/b));
            break;
            default:
                System.out.println("Invalid Option!");
            break;
        }
        scan.close();
    }
}
