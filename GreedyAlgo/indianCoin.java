package GreedyAlgo;
import java.util.*;
public class indianCoin {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=200987876;
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(amount>=coins[i]){
                    count++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
                
            }
        }
        
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }

    }
}
