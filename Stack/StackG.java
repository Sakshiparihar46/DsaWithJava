package Stack;
import java.util.*;

public class StackG {

    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           //closing
           if(ch==')'){
            int count=0;
            while(s.pop()!='('){
                count++;
            } if(count<1){
                return true;//duplicate
            }
           }else{
            //opening
            s.push(ch);
           }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str1="(a-b)";
        System.out.println();
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str));
    }    
}
