public class nestedclasseg {
    public void display(){
        class innerclass{
                int fact = 1;
                public void show(){
                    for(int i = 1; i<=5; i++)
                    fact = fact * i;
                    System.out.println("inner = " + (fact));
                }
            }
            innerclass ic = new innerclass();
            ic.show();
    }
    public static void main(String[] agrs){
        nestedclasseg ns = new nestedclasseg();
        ns.display();
    }
}