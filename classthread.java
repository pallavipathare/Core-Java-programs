class thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
class thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}
class thread4 extends Thread{
    public void run(){
        System.out.println("Thread 4");
    }
}
public class classthread {
    public static void main(String[] args){
        thread1 obj1 = new thread1();
        obj1.setPriority(1);
        thread2 obj2 = new thread2();
        obj2.setPriority(2);
        thread3 obj3 = new thread3();
        obj3.setPriority(3);
        thread4 obj4 = new thread4();
        obj4.setPriority(4);

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
    }
}