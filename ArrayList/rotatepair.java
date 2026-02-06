package ArrayList;
import java.util.*;
public class rotatepair{
    public static void pair(ArrayList<Integer>list,int target,int n){
        int max=-1;
         for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                max=i;
                break;
            }
         }
         int lp=max+1;
         int rp=max;

        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                System.out.println(list.get(lp)+","+list.get(rp));
                return;
            }
            if((list.get(lp)+list.get(rp))<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(rp-1+n)%n;
            }
            
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        pair(list,16,list.size());
    }
}