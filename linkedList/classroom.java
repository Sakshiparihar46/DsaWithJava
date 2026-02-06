package linkedList;
import java.util.LinkedList;

public class classroom {
    public static void main(String[] args) {
        
    
    //create
    LinkedList<Integer> li=new LinkedList<>();

    //add
    li.addFirst(1);
    li.addFirst(2);
    li.addLast(3);
        System.out.println(li);
    //remove
        li.removeLast();
        System.out.println(li);
    }
}
