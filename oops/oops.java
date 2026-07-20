class pen{
    String color;
    String type;

    //method 
    public void writer(){
        System.out.println("writing something");
    } 
    //cpy constructure
    pen(){

    }
    pen(pen s2){
        this.color=s2.color;
        this.type=s2.type;
    }
}
public class oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="red";
        pen1.writer();
        pen p2=new pen(pen1);
        System.out.println(p2.color);
        System.out.println(p2.type);
    }
}
