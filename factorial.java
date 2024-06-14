import java.util.Scanner;

public class factorial {
    public static void main(String1[] args) throws Exception{
        int fact=1, i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factorial  : ");
        n = input.nextInt();
        while(i<=n){
            fact *= i;
            i++;
        }
        System.out.println("Value of Factorial is " + fact);
        input.close();
    }
}
