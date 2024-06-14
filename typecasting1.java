import java.util.Scanner;

public class typecasting1 {
    public static void main(String[] args){
        // implicit
        int i = 1000;
        float a = i;
        double b = a;
        System.out.println(i+ "   " + a + "   " + b);
        // explicit
        double d = 1000.112;
        long  f = (long)d;
        int j = (int)f;
        System.out.println(d+ "   " + f + "   " + j);
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        double d1 = z;
        System.out.println(d1);
        scan.close();
    }
}