public class throwskeyword {
    static void throwsword() throws ArithmeticException{
        System.out.println("inside check function");
        throw new ArithmeticException();
    }
    public static void main(String[] agrs){
        try{
            throwsword();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught " + e);
        }
    }
}