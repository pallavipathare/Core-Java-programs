package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapeg {
    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        hash.put("a",100);
        hash.put("b",200);
        hash.put("c",300);
        hash.put("d",400);
        Set<Map.Entry<String,Integer>> set = hash.entrySet();
        for(Map.Entry<String,Integer> map:set){
            System.out.print(map.getKey() + " : ");
            System.out.println(map.getValue());
        }
    }
}