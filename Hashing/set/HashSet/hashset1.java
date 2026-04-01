package Hashing.set.HashSet;

import java.util.HashSet;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        //set conttains
        System.out.println(set.contains(2));

        //set remove
        set.remove(2);
        System.out.println(set);
    }
}
