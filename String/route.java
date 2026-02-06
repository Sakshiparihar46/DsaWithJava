package String;

public class route {
    public static float shortest(String str){
        float x=0;
        float y=0;
        for (int i= 0; i< str.length(); i++) {
            
            if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
            
        }
        float n=x*x+y*y;
        float shortest=(float)(Math.sqrt(n));
        return shortest;
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortest(str));
    }
}
