package Hashing.set.LinkedHashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedhashset1 {
    public static void main(String[] args) {
         HashSet<String> cities=new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru"); 
        System.out.println(lhs);
    }
}
