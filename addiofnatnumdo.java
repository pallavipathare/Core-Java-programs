import java.util.Scanner;
public class addiofnatnumdo {
    public static void main(String1[] args) throws Exception{
        int sum=0, i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        n = input.nextInt();
        input.close();
        do{
            sum += i;
            i++;
        }while(i<=n);
        System.out.println("Addition  is " + sum);
    }
}