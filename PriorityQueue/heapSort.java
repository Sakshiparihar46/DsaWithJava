package PriorityQueue;
import java.util.*;
public class heapSort {

    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIndx=i;

        if(left<size && arr[left]>arr[maxIndx]){
            maxIndx=left;
        }
        if(right<size && arr[right]>arr[maxIndx]){
            maxIndx=right;
        }

        if(maxIndx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIndx];
            arr[maxIndx]=temp;
            heapify(arr, maxIndx, size);    
        }
    }
    public static void sort(int arr[]){
        int n=arr.length;
        //step 1- build maxheap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        //step2-push largest at end
        for(int i=n-1;i>0;i--){
            //swap (largest-first with last)
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
