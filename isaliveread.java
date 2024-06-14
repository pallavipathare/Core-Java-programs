class threadsisalive extends Thread{
    public void run(){
        System.out.println("alive");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException i){}
        System.out.println("dead");
    }
}

public class isaliveread {
    public static void main(String[] args){
        threadsisalive ta = new threadsisalive();
        threadsisalive ta1 = new threadsisalive();
        ta.start();
        // System.out.println(ta.isAlive());
        // System.out.println(ta1.isAlive());
        try{
            ta.join();
        }catch(InterruptedException i){}
        ta1.start();
    }
}
