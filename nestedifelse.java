import java.util.Scanner;
public class nestedifelse {
    public static void main(String1[] args){
        int mark1, mark2, mark3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your three test marks out of 100");
        mark1 = scan.nextInt();
        mark2 = scan.nextInt();
        mark3 = scan.nextInt();
        if(mark1>50){
            if(mark2>50){
                if(mark3>50){
                    System.out.print("Your are eligible");
                }
                else{
                    System.out.print("Your are not eligible as 3rd test marks are less than 50");
                }
            }else{
                    System.out.print("Your are not eligible as 2nd test marks are less than 50");
            }
        }else{
            System.out.print("Your are not eligible as 1st test marks are less than 50");
        }
        scan.close();
    }
}
