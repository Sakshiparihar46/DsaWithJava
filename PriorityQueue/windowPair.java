package PriorityQueue;
import java.util.*;

public class windowPair {
    static class pair implements Comparable <pair>{
        int val;
        int indx;

        public pair(int val,int indx){
            this.val=val;
            this.indx=indx;
        }

        @Override
        public int compareTo(pair p2){
            //assending
            // return this.val-p2.val;

            //descending
            return p2.val-this.val;
        }


    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;//window size
        int res[]=new int[arr.length-k+1];

        PriorityQueue<pair> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i], i));
        }

        res[0]=pq.peek().val;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().indx<=(i-k)){
                pq.remove();
            }

            pq.add(new pair(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }

        //print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
