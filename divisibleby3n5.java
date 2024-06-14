import java.util.Scanner;

public class divisibleby3n5 {
    public static void main(String1[] args) throws Exception{
        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range  : ");
        n = input.nextInt();
        input.close();
        System.out.println("Number Divisible by 3 and 5 are :");
        for(i=1;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Number is " + i);
            }
        }
    }
}
