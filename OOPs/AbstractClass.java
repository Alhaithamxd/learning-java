public class AbstractClass{
    public static void main(String args[]){
        Horse h = new Horse();

        h.eat();
        h.walk();
        h.changecolor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

    }

}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}
class Horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on four leg");
    }
}
class Chicken extends Animal{
    void changecolor(){
        color="whilte";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}