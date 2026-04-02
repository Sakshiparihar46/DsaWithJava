package Hashing.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashset2 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");

        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
