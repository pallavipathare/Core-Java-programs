public class polymoroverride {
 public static void main(String[] args){
        childq c = new childq();
        c.name();
        parentq p = new parentq();
        p.name();
    }
}
class parentq {
    public void name(){
        System.out.println("parent");
    }
}
class childq extends parentq{
    public void name(){
        System.out.println("Child");
    }
}