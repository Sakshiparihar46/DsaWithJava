package bitManipulation;

import java.util.Scanner;

public class get {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bit=sc.nextInt();
        int bitmask=1<<bit;
        if((n&bitmask)==0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("1 bit");
        }
    }
}
