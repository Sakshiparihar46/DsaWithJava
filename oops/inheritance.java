class Shape{
    String color;
}
//single level inheritance
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

//multiple inheritance
class Equileteral extends Triangle{
    public void area(int a){
        System.out.println(Math.sqrt(3)/4*a);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.color="red";
    }
}
