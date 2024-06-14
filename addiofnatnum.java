import java.util.Scanner;

public class addiofnatnum {
    public static void main(String1[] args) throws Exception{
        int sum=0, i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        n = input.nextInt();
        input.close();
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("addition is " + sum);
    }
}