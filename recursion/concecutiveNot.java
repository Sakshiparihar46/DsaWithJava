package recursion;

public class concecutiveNot {
    public static void notones(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        notones(n-1, 0,str+"0");
        if(lastplace==0){
            notones(n-1,1, str+"1");
        }
    }
    public static void main(String[] args) {
        String str="";
        notones(3, 0,str);
    }
}
