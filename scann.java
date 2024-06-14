import java.util.Scanner;
public class scann {
    public static void main(String1[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first interger: ");
        float var1 = scan.nextFloat();
        System.out.print("Enter second interger: ");
        float var2 = scan.nextFloat();
        System.out.println("Addition is " + (var1 + var2));
        System.out.println("Substraction is " + (var1 - var2));
        System.out.println("Multiplicaition is " + (var1 * var2));
        System.out.println("Division is " + (var1 / var2));
        scan.close();
    }
}