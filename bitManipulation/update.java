package bitManipulation;

public class update {
    public static int clear(int n,int bit){
        int bitmask=~(1<<bit);
        int set=n&bitmask;
        return set;
    }
    public static void main(String[] args) {
        int n=7;
        int bit=1;
        int newbit=0;
        int a=(clear(n,bit));
        int bitmask=newbit<<bit;
        System.out.println(a|bitmask);
        
    
    }
}
