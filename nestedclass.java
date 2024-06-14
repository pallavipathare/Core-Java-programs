public class nestedclass {
    int i;
    public void display(){
        for(i=0; i<5; i++){
            class innerclass{
                public void show(){
                    System.out.println("inner = " + i);
                }
            }
            innerclass ic = new innerclass();
            ic.show();
        }
    }
    public static void main(String[] agrs){
        nestedclass ns = new nestedclass();
        ns.display();
    }
}