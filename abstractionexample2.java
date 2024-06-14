interface rectangle{
    void isrectangle();
}
interface circle{
    void iscircle();
}
public class abstractionexample2 implements rectangle, circle{
     int width, length;
    public void isrectangle(){
        int area;
        int width = 5, length = 10;
        area = width * length;
        System.out.println("area of rectangle "+ area);
    }
    public void iscircle(){
        double area1;
        int r = 4;
        area1 = 3.14 * r * r;
        System.out.println("area of circle "+ area1);
    }
    public static void main(String[] args){
        abstractionexample2 obj = new abstractionexample2();
        obj.iscircle();
        obj.isrectangle();
    }
}