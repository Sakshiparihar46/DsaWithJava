package Queue;
import java.util.*; 
public class QueueJ {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(1);
        d.addLast(4);

        while(!d.isEmpty()){
            System.out.println(d.getFirst());
            d.removeFirst();
        }
    }
}
