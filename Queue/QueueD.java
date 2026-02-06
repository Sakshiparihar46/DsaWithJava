package Queue;
//impleneted by javaframework
import java.util.*;

public class QueueD {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

 
//queue is a interface so it is implemented by two classes 
        //1.LinkedList
        //2.ArrayDeque