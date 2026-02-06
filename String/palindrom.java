package String;

public class palindrom {
    public static void main(String[] args) {
        String s="racecare";
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(0)!=s.charAt(s.length()-1)){
                System.out.println("not a palindrom");
                break;
            }
        }
        
        
    }
}
