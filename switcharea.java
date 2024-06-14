import java.util.Scanner;

public class switcharea {
    public static void main(String1[] args){
        int choice;
        float a , b;
        Scanner scan = new Scanner(System.in);
        System.out.println("###Menu###");
        System.out.println("1. Area of Cricle \n2. Area of Rectangle \n3.Area of Square \n4.Area of Rhombus \n 5.Volume of Cube");
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 :
                    System.out.print("Enter Values of radius : ");
                    a = scan.nextFloat();
                    System.out.println("Aera of circle is " + (3.14 * a * a));
            break;
            case 2 :
                    System.out.print("Enter Values of length & Breadth : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Area of Rectangle is " + (a*b));
            break;
            case 3 :
                    System.out.print("Enter Values of side: ");
                    a = scan.nextInt();
                   System.out.println("Area of Square is " + (a*a));
            break;
            case 4 :
                    System.out.print("Enter Values of two diagonals : ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    System.out.println("Area of Rhombus is " + (0.5 * a * b));
            break;
            case 5: 
                   System.out.print("Enter Values of side: ");
                    a = scan.nextInt();
                   System.out.println("Voulme of Cube is " + (a*a*a));
            break;
            default:
                System.out.println("Invalid Option!");
            break;
        }
        scan.close();
    }
}
