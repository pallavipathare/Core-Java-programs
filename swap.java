import java.util.Scanner;

public class swap {
    public static void main(String1[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first interger: ");
        float var1 = scan.nextFloat();
        System.out.print("Enter second interger: ");
        float var2 = scan.nextFloat();
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println(var1 + " <> " + var2);
        scan.close();
    }
}