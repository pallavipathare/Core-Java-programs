import java.util.Scanner;

public class divisibleby3n5dowhile {
    public static void main(String1[] args) throws Exception{
        int i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range  : ");
        n = input.nextInt();
        input.close();
        System.out.println("Number Divisible by 3 and 5 are :");
        do{
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Number is " + i);
            }
            i++;
        }while(i<=n);
    }
}
