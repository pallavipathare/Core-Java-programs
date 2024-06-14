class info{
    int roll;
    String name;
}
public class studentclass1 extends info{
    public void function(){
        super.roll = 1;
        super.name = "Swapnil";
        System.out.println(super.roll + " " + super.name);
    }
    public static void main(String[] args){
        studentclass1 obj = new studentclass1();
        obj.function();
    }
}