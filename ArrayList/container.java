package ArrayList;

import java.util.ArrayList;

//1,8,6,2,5,4,8,3,7
//pairsum 5\ 1,2,3,4,5,6
//rotated 11,15,6,8,9,10 target16
//lp=lp+1%n   rp=n-rp-1)%n
public class container {
    //brute force
    // public static int count(ArrayList<Integer> list){
    //     int maxarea=0;
    //     for(int i=0;i<list.size();i++){
    //         int width=1;
    //         for(int j=i+1;j<list.size();j++){
    //             int height=Math.min(list.get(i),list.get(j));
    //             int area=height*width;
    //             maxarea=Math.max(area,maxarea);
    //             width++;
    //         }
    //     }
    //     return maxarea;
    // }

    //two pointer
    public static int countarea(ArrayList<Integer>list,int lp,int rp){
        int maxarea=0;
        while(lp!=rp){
            int width=rp-lp;
            int height=Math.min(list.get(lp),list.get(rp));
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            int area=width*height;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(8);
        System.out.println(countarea(list,0,list.size()-1));

    }
}
