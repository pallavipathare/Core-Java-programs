package collection_framework;
import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class list {
    public static void main(String[] args){

    List <String> obj = new ArrayList<String>();
    obj.add("Swapnil");
    obj.add("Shelke");
    // System.out.println(obj);

    // LinkedList<String> obj1 = new LinkedList<String>();
    // obj1.add("1");
    // obj1.add("4");
    // obj1.add("2");
    // obj1.add("3");
    // System.out.println(obj1);

    // for(String x : obj1){
    //     System.out.println(x);
    // }
    // Iterator<String> it = obj1.iterator();
    //     while(it.hasNext()){
    //         System.out.println(it.next());
    //     }
        ListIterator<String> li = obj.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}