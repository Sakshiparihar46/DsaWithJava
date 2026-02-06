import java.util.*;
class prime{
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
        }
    }
    return true;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(  System.in );
        int n=sc.nextInt();
        boolean a=isprime(n);
        System.out.println(a);
    }
}