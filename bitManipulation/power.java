package bitManipulation;
public class power{
    public static boolean check(int n){
        //property n&(n-1)==0
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(check(n));
    }
}
