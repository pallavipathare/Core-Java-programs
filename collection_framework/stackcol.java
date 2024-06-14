package collection_framework;
import java.util.Iterator;
import java.util.Stack;
public class stackcol {
    public static void main(String[] args) {
        Stack <String> stack = new Stack <String> ();
        stack.push("Swapnil");
        stack.push("Shelke");
        Iterator<String> it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        String s = stack.peek();
        System.out.println(s);
        System.out.println(stack);
        int loc = stack.search("Shelke");
        System.out.println(loc);
        int size = stack.size();
        System.out.println(size);
    }
}