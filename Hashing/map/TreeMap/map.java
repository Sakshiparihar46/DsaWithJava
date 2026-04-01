package Hashing.map.TreeMap;
import java.util.TreeMap;

public class map {
     public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("china",100);
        tm.put("india",120);
        tm.put("bhutan",23);
        tm.put("nepal",50);

        System.out.println(tm);

    }
}
