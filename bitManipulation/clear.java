package bitManipulation;

import java.util.Scanner;

public class clear {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bit=sc.nextInt();
        int bitmask=~(1<<bit);
        int set=n&bitmask;
        System.out.println(set);
    }
}
