abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
 public void walk(){
    System.out.println("he can walk on 4legs");
 }
}

class sanku extends Animal{
 public void walk(){
    System.out.println("he can walk on 2legs");
 }
}

public class Encapsulation {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
    }
}
