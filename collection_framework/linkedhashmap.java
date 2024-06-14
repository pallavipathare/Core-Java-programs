package collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedmap = new LinkedHashMap<String,Integer>();
        linkedmap.put("a",100);
        linkedmap.put("c",300);
        linkedmap.put("b",200);
        linkedmap.put("d",400);
        Set<Map.Entry<String,Integer>> set = linkedmap.entrySet();
        for(Map.Entry<String,Integer> map:set){
            System.out.print(map.getKey() + " : ");
            System.out.println(map.getValue());
        }
    }
}