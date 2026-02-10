package GreedyAlgo;
import java.util.*;
public class Chocola{
public static void main(String[] args) {
    Integer costvar[] ={2,1,3,1,4};//m-1
    Integer costHor[]={4,1,2};//n-1

    Arrays.sort(costvar,Collections.reverseOrder());
    Arrays.sort(costHor,Collections.reverseOrder());

    int h=0,v=0;
    int hp=1,vp=1;
    int cost=0;
    while(h<costHor.length && v<costvar.length){
        //vertical cost<hor cost
        if(costvar[v]<=costHor[h]){
            //horizontal cut
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }else{//vertical cut
            cost+=(costvar[v]*hp);
            vp++;
            v++;
        }}
        //remainning cut
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costvar.length){
            cost+=(costvar[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts="+ cost);
    }
}
    

