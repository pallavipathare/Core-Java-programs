import  java.util.Scanner;
public class fibonacci {
    public static void main(String1[] args) throws Exception{
        int a=0 , b=1, c, i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fibonacci range : ");
        n = input.nextInt();
        System.out.print(a + " " + b);
        input.close();
        for(i=3; i<=n; i++){
            c = a + b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}
