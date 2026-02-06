public class sum {
    public static int summation(int n){
        int sum=0;
        while(n!=0){
             sum=(n%10)+sum;
             n=n/10;
        }
        return sum;
    }
    public static void main(String [] args){
        int sum=summation(123456789);
        System.out.println(sum);
    }
}
