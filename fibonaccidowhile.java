import java.util.Scanner;

public class fibonaccidowhile {
    public static void main(String1[] args) throws Exception{
        int a=0 , b=1, c, i=3, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fibonacci range : ");
        n = input.nextInt();
        System.out.print(a + " " + b);
        do{
            c = a + b;
            System.out.print(" " + c);
            a=b;
            b=c;
            i++;
        }while(i<=n);
        input.close();
    }
}