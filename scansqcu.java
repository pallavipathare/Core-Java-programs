import java.util.Scanner;
public class scansqcu {
    public static void main(String1[] args) throws Exception{
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int var1 = scan1.nextInt();
        int var2 = var1 * var1;
        System.out.println("square is : " + var2);
        int var3 = var1 * var1 * var1;
        System.out.println("Cude is : " + var3);
        char c = scan1.next().charAt(0);
        System.out.println(c);
        scan1.close();
    }
}