import java.util.Scanner;
public class fibonnacitrycatch {
    public static void main(String[] agrs){
        try{
            int a = 0, b = 1, c, n;
            Scanner scan = new Scanner(System.in);
            n =scan.nextInt();
            System.out.print(a+" "+b+" ");
            for(int i = 3 ; i <= n; i++){
                c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
            scan.close();
        }
        catch(Exception a){
            System.out.println(a);
        }
    }
}