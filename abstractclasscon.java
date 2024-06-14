public class abstractclasscon {
    public static void main(String[] args){
        childq12 obj = new childq12();
        obj.demo();
        obj.demo1();
    }
}
abstract class parentq12 {
    abstract void demo();
    public void demo1(){
        System.out.println("concrete");
    }
}
class childq12 extends parentq12{
    public void demo(){
        System.out.println("Abstarct");
    }
}