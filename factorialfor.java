import java.util.Scanner;

public class factorialfor {
      public static void main(String1[] args) throws Exception{
        int fact=1, i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factorial  : ");
        n = input.nextInt();
        input.close();
        for(i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Value of Factorial is " + fact);
    }
}
