public class Inheritance{
    public static void main(String args[]){
        Fish shark= new Fish();
        shark.eat();
        shark.Fins();

    }

}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");

    }
    void Breath(){
        System.out.println("breaths");
    }
}
class Fish extends Animal{
    void Fins(){
        System.out.print("fins");
    }
}