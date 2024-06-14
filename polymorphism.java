public class polymorphism {
    public static void main(String[] args){
        cal a = new cal();
        a.add(3,6);
        a.add(3,6,9);
        a.sub(2001,1999);
        a.sub(24.89f,6898.90f,6890.89f);
        a.add("swapnil");
    }
}
class cal{
    public void add (int a, int b){
        System.out.println("Addition of two is "+ (a+b));
    }
    public void add (int a, int b, int c){
        System.out.println("Addition of three is "+ (a+b+c));
    }
    public void sub (int a, int b){
        System.out.println("Subtraction of two is "+ (a-b));
    }
    public void sub (float a, float b, float c){
        System.out.println("Subtraction of three is "+ (a-b-c));
    }
    public void add (String a){
        System.out.println(a);
    }
}