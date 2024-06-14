import java.util.Scanner;

public class factrialdowhile {
    public static void main(String1[] args) throws Exception{
        int fact=1, i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factorial  : ");
        n = input.nextInt();
        input.close();
        do{
            fact *= i;
            i++;
        }while(i<=n);
        System.out.println("Value of Factorial is " + fact);
    }
}
