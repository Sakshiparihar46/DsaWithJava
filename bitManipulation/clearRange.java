package bitManipulation;

public class clearRange {
    public static void main(String[] args) {
        int n=15;
        int startbit=0;
        int endbit=2;
        int a=(~0)<<(endbit+1);
        int b=(1<<startbit)-1;
        int bitmask=a|b;
        int ans=n&bitmask;
        System.out.println(ans);
    }
}
