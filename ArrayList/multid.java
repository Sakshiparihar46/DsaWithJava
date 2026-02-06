package ArrayList;
import java.util.*;
public class multid {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>>list=new ArrayList<>(); 
       ArrayList<Integer>list1=new ArrayList<>();
       ArrayList<Integer>list2=new ArrayList<>();
       list1.add(9);
       list1.add(12);
       list1.add(6);
       list2.add(32);
       list2.add(15);
       list2.add(3);
       list.add(list1);
       list.add(list2);
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
    }
}
