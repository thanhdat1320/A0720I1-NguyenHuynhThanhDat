package _12_java_collection_framework.practise.use_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        hashMap.put("Cook", 20);
        System.out.println(hashMap);

        System.out.println("====================");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        System.out.println("====================");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
    }
}
