import java.util.Scanner;
public class mocktest3 {
    public static void main(String[] args) {
        int n, r, sum = 0, temp;
        System.out.println("\nEnter number to get amstrong number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        temp = n;
        while(n>0){
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
            if(sum == temp)
            System.out.println("\nIt is a Armstong number");
            else
            System.out.println("\nIt is not a Armstrong number");
            scan.close();
    }
}