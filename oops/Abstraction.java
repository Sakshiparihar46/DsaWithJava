//pure abstraction
interface Animal{
    public void walk();
    
}


interface herbivore{

}
class Horse implements Animal,herbivore{
    public void walk(){
        System.out.println("walks on 4legs");
    } 
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
    }
}
