import java.util.Scanner;
public class hwpanlindrom {
    public static void main(String1[] args) throws Exception{
        int n, r, rev=0, temp;
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter Number: ");
        n = scan.nextInt();
        temp = n;
        
        while(n>0){
            r= n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        
        scan.close();
        if(rev == temp)
        System.out.print("It is a Pallindrom  number");
        else
        System.out.print("It is not a Pallindrom  number");
    }
}