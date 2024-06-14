import java.util.Scanner;
public class ageif {
    public static void main(String1[] args) throws Exception{
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        // if(age >= 18){
        //     System.out.println("Your are adult. Your age is " +  age);
        // }
        // else{
        //     System.out.println("Your are minor. Your age is " +  age);
        // }
        // gen = scan.nextLine();

        // String gen;
        // if(gen.equals("Female"))
        // System.out.println("50% offer is valid!");

        // else
        // System.out.println("No offer is available");

        if( age <= 18){
            System.out.println("Free education!");
        }else if(age <=30 ){
            System.out.println("50% offer is valid!");
        }else {
            System.out.println("No offer is available");
        }
        scan.close();
    }
}