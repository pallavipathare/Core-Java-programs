package collection_framework;
import java.util.ArrayDeque;
import java.util.Deque;
public class dequeuecol {
    public static void main(String[] args) {
        Deque<String>obj = new ArrayDeque<String>();
        obj.add("swapnil");
        obj.add("shelke");
        System.out.println(obj);
        obj.remove();
        System.out.println(obj);
    }
}