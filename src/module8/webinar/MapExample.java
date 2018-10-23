package module8.webinar;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
//        for example:
//        List<String> list = new ArrayList<>();

//            KEY  - VALUE
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);
        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("May", 31);
        map.put("Jun", 30);
        map.put("Jul", 31);
        map.put("Aug", 31);
        map.put("Sep", 30);
        map.put("Oct", 31);
        map.put("Nov", 30);
        map.put("Dec", 31);
        System.out.println(map);

        System.out.println(map.get("Feb"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String,Integer> treeMap=new TreeMap<>();
        treeMap.putAll(map);
        System.out.println(treeMap);


    }
}
