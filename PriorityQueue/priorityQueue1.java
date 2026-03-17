package PriorityQueue;
import java.util.PriorityQueue;

public class priorityQueue1 {
    static class Student implements Comparable<Student>{//overriding
        String name;
        int rank;

        public Student (String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("sanku",3));
        pq.add(new Student("sakshi",1));
        pq.add(new Student("riya",4));
        pq.add(new Student("rajveer",2));
        
        while(!pq.isEmpty()){
            System.out.print(pq.peek().name+" "+pq.peek().rank+" ");
            pq.remove();
        }

    }
    
}
