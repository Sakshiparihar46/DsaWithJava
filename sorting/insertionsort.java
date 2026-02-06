package sorting;

public class insertionsort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort(arr);
    }
}
