import java.lang.Thread;
public class threads {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setPriority(2);
        t.setName("Swapnil");
        System.out.println(t);
    }
}