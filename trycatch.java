public class trycatch{
    public static void main(String[] agrs){
        try{
            int a = 0, b = 10, c;
            c = b / a;
            System.out.println(c);
        }
        catch(ArithmeticException a){
            System.out.println("arithmetic Exception");
            System.out.println("arithmetic Exception" + a);
        }
        try{
            int[] a = {0,1,2,3,4,5,6,7,8,9};
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("array Exception");
            System.out.println("array Exception" + a);
        }
    }
}