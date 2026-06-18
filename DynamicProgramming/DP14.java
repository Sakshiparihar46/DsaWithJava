package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DP14 {
    public static int catalanRec(int n,int arr[]){
        if(n==0 || n==1){
            return 1;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        int ans=0;
        for (int i = 0; i<n; i++) {
            ans+=catalanRec(i, arr)*catalanRec(n-i-1, arr);
        }
        arr[n]=ans;
        return arr[n];
    }
    public static void main(String[] args) {
        int n=4;
        int arr[]=new int[n+1];
        Arrays.fill(arr, -1);
        System.out.println(catalanRec(n,arr));
    }   
}
