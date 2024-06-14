package collection_framework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class maptree {
    public static void main(String[] args) {
        TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
        tree.put("a",100);
        tree.put("c",300);
        tree.put("b",200);
        tree.put("d",400);
        Set<Map.Entry<String,Integer>> set = tree.entrySet();
        for(Map.Entry<String,Integer> map:set){
            System.out.print(map.getKey() + " : ");
            System.out.println(map.getValue());
        }
    }
}