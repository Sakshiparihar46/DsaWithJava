package Hashing.LinkedHashMap;
import java.util.*;
public class map1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("china",100);
        lhm.put("india",120);
        lhm.put("bhutan",23);
        lhm.put("nepal",50);

        System.out.println(lhm);

    }
}
