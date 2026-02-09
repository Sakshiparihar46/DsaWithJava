package GreedyAlgo;
import java.util.*;
public class PairSum{
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);

        int minAbsoluteValue=0;
        for(int i=0;i<a.length;i++){
            minAbsoluteValue+=Math.abs(a[i]-b[i]);
        }
        System.out.println(minAbsoluteValue);
    }
}