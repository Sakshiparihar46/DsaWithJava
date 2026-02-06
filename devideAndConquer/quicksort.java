package devideAndConquer;
public class quicksort {
        public static int quick(int arr[],int si,int ei){
            int i=si-1;
            int pivot=arr[ei];
            for(int j=si;j<ei;j++){                
                if(arr[j]<=pivot){
                    i++;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            i++;
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;
        }
        public static void sort(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int part=quick(arr,si,ei);
            sort(arr,si,part-1);
            sort(arr,part+1,ei);
        }
        public static void main(String[] args) {
            int arr[]={6,3,4,8,9,5};
            sort(arr,0,arr.length-1);
             for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }

}
