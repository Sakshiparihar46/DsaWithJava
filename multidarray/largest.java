package multidarray;

public class largest {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{6,4,9},{7,8,0}};
        int max=Integer.MIN_VALUE;
        int target=8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(target==arr[i][j]){
                    System.out.println("true");
                }
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            
        }
        System.out.println(max);
    }
}
