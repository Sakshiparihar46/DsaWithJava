import java.util.Scanner;

public class palindrom {
    public static int reverse(int n){

        int digit=0;
      while(n!=0){
        digit=n%10+digit*(int)Math.pow(10,1);
        n=n/10;
      }
      return digit;
    } 
    public static boolean pd(int n){
       if(n==reverse(n)){
        return true;
       }
       else{return false;}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ispalindrom=pd(n);
        System.out.println(ispalindrom);
    }
    
}
