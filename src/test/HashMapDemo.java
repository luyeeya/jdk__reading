package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 18);
        map.put("Jerry", 35);
        map.put("ZhangSan", 24);
        System.out.println(map.get("Tom"));
    }
}
