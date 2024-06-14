public class throwkeyword {
    public static void main(String[] agrs){
        try{
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic Exception caught");
        }
    }
}