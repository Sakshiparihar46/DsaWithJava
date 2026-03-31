package Hashing.HashMap;
import java.util.*;
public class hashmap1{
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //insert
        hm.put("Tea",20);
        hm.put("burger",70);

        System.out.println(hm);

        //get
        int val=hm.get("Tea");
        System.out.println(val);

        //containsKey  
        System.out.println(hm.containsKey("india"));

        //remove
        System.out.println(hm.remove("Tea"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());


        //isEmpty and clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
