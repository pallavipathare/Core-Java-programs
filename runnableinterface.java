class newthread implements Runnable{
    public void run(){
        System.out.println("Swapnil Shelke");
    }
}
public class runnableinterface {
    public static void main(String[] args){
        newthread nt = new newthread();
        Thread t = new Thread(nt);
        t.start();
    }
}