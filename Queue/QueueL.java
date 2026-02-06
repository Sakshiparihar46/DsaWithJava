package Queue;
import java.util.*;

public class QueueL {
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();

        //push
        public void add(int data){
            deque.addLast(data);
        }

        //pop
        public int remove(){
            return deque.removeFirst();
        }

        // peek
        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(6);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
