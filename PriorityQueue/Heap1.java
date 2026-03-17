package PriorityQueue;
import java.util.*;
public class Heap1 {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){//O(logn)
            //add at last idx
            arr.add(data);

            int x=arr.size()-1;//x is my child indx
            int par=(x-1)/2;//parent indx

            while (arr.get(x)<arr.get(par)) {//O(logn)
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        
    }
}
