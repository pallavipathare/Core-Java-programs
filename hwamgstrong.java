import java.util.Scanner;
public class hwamgstrong {
    public static void main(String[] args) {
        int n, r, sum=0, temp;
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter Number: ");
        n = scan.nextInt();
        temp = n;
        
        while(n>0){
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        
        scan.close();
        if(sum == temp)
        System.out.print("It is a Armstong  number");
        else
        System.out.print("It is not a Armstong  number");
    }
}