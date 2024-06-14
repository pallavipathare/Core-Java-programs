// import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) throws Exception{
        // System.out.println("tries is best");

        // int var1 = 100;
        // System.out.println(var1);

        // int num1 = 1;
        // int num2 = 2;
        // int num3 = 3;
        // System.out.println(num1 + num2 + num3);

        // Scanner s1 = new Scanner(System.in);
        // System.out.println("Enter number");
        // int a = s1.nextInt();
        // System.out.println(a);

        // Scanner mk1Scanner = new Scanner(System.in);
        // System.out.println("Marks should be out of 100");
        // System.out.println("Enter subject 1 Marks");
        // float sub1 = mk1Scanner.nextInt();
        // System.out.println("Enter subject 2 Marks");
        // float sub2 = mk1Scanner.nextInt();
        // System.out.println("Enter subject 3 Marks");
        // float sub3 = mk1Scanner.nextInt();
        // System.out.println("Enter subject 4 Marks");
        // float sub4 = mk1Scanner.nextInt();
        // System.out.println("Enter subject 5 Marks");
        // float sub5 = mk1Scanner.nextInt();
        // mk1Scanner.close();
        // s1.close();
        // float tot = sub1 + sub2 + sub3 + sub4 + sub5;
        // System.out.println("Percentage are " + (tot * 100)/500 + "%");

        //pattern 1
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 2
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                if(i==0 || j==0 || i==3 || j==4){
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        //pattern 3
        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //pattern 4
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(' ');
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 5
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //pattern 6
        int num = 1;
        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        //pattern 7
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        //pattern 8
        for(int i=0; i<5; i++){
            //1
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            int space = 2 * (5 - i); 
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            //2
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=5; i>0; i--){
            //1
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            int space = 2 * (5 - i);
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            //2
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}