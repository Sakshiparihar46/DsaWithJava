package bitManipulation;
import java.util.*;
public class even {
    public static void check(int n){
          if((n&1)==0){
            System.out.println("even");
        }
         else{
            System.out.println("odd number");
         }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       check(n);

    }    
}
