class parentsclass{
    String name;
}
public class superclass extends parentsclass{
    String name;
    public void details(){
        super.name = "Parent";
        name  = "Child";
        System.out.println(super.name+" and "+name);
    }
    public static void main(String[] args){
        superclass obj = new superclass();
        obj.details();
    }
}