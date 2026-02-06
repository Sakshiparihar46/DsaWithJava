package devideAndConquer;
import java.util.*;

public class mergesort {
    public static void merge(int arr[],int si,int end,int mid){
        int i =si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[end-si+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;     
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=end) {
            temp[k++]=arr[j++];
        }
         for( i=si,k=0;k<=temp.length-1;i++,k++){
            arr[i]=temp[k];
        }
            
    }
    public static void sort(int arr[],int si,int end){
        if(si>=end){
            return;
        }
        int mid=si+(end-si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,end);
        merge(arr,si,end,mid);
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,2,10,6};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
