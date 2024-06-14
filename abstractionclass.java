public class abstractionclass {
    public static void main(String[] args){
        childq1 obj = new childq1();
        obj.demo();
    }
}

abstract class parentq1 {
    abstract void demo();
}
class childq1 extends parentq1{
    public void demo(){
        System.out.println("Child");
    }
}