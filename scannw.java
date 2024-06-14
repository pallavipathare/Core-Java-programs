import java.util.Scanner;

public class scannw {
     public static void main(String1[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first interger: ");
        float var1 = scan.nextFloat();
        System.out.print("Enter second interger: ");
        float var2 = scan.nextFloat();
        float var3 = var1 + var2;
        System.out.println("Addition is " + (var3));
        float var4 = var1 - var2;
        System.out.println("Substraction is " + (var4));
        float var5 = var1 * var2;
        System.out.println("Multiplicaition is " + (var5));
        float var6 = var1 / var2;
        System.out.println("Division is " + (var6));
        scan.close();
    }
}