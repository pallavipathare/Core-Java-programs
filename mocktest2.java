import java.util.Scanner;

public class mocktest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value to get ASCII value");
        char a = scan.next().charAt(0);
        int z = a;
        System.out.println("ASCII value of "+ "'" + a + "'" + " is " + z);
        scan.close();
    }
}
