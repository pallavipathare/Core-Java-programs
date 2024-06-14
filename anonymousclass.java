interface animal{
    void type();
}
public class anonymousclass {
    public static void main(String[] args){
        animal a = new animal(){
            public void type(){
                System.out.println("Anonyous Class");
            }
        };
        a.type();
    }
}