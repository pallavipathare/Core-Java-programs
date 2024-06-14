import java.util.Scanner;

public class addionnatmunwhile {
    public static void main(String1[] args) throws Exception{
        int sum=0, i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        n = input.nextInt();
        input.close();
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("addition  is " + sum);
    }
}