package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setcol {
    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();
        h.add("3");
        h.add("1");
        h.add("4");
        h.add("2");
        System.out.println(h);

        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("3");
        lh.add("1");
        lh.add("4");
        lh.add("2");
        System.out.println(lh);

        TreeSet<String> th = new TreeSet<String>();
        th.add("a");
        th.add("3");
        th.add("1");
        th.add("4");
        th.add("2");
        th.add("A");
        th.add("b");
        th.add("c");
        System.out.println(th);

        for(String x : th){
            System.out.println(x);
        }

        Iterator<String> it = th.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}
