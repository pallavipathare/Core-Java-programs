public class garbagecollector {
    public static void main(String[] args){
        garbagecollector g = new garbagecollector();
        System.out.println(g);
        g = null;
        System.gc();
        System.out.println(g);
    }
    public void finalize(){
        System.out.println("Seed infotech");
        int c = 10 + 20;
        System.out.println(c);
    }
}