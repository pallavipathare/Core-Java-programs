public class trymulticatch {
    public static void main(String[] agrs){
        try{
            int a = 0, b = 10, c;
            c = b / a;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("array Exception");
            System.out.println("array Exception" + a);
        }
        catch(ArithmeticException a){
            System.out.println("arithmetic Exception");
            System.out.println("arithmetic Exception" + a);
        }
    }
}