
public class trappedwater {
    public static int water(int arr[]){
        int n=arr.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        //calculate leftmax
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //calculate rightmax
        rightmax[n-1]=arr[n-1];
        for(int j=n-2; j>=0;j--){
            rightmax[j]=Math.max(arr[j],rightmax[j+1]);
        }
        //calculate min
        int watertrap=0;
        for(int i=0;i<arr.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            watertrap+=waterlevel-arr[i];
        }
        return watertrap;
    }
    
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(water(height));

    }
}
