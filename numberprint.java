import java.util.Scanner;

public class numberprint {
    public static void main(String1[] args) throws Exception{
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter range: ");
        n = scan.nextInt();
        for (int i=0; i<n; i++ ){
             System.out.println((i+1));
        }
        scan.close();
    }
}