package ArrayList;
import java.util.ArrayList;

public class pairsum {
    public static void pair(ArrayList<Integer>list,int target){
        int lp=1;
        int rp=list.size();
        while(lp!=rp){
            if((lp+rp)==target){
                System.out.println(lp+","+rp);
                lp++;
            }
            else{rp--;}
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        pair(list,5);
    }
}
