public class MethodOverriding{
    public static void main(String args[]){
        Deer dr= new Deer();
        dr.eats();
    }

}

class Animal{
    void eats(){
        System.out.print("eats anything");
    }

    
}
class Deer extends Animal{
    void eats(){
        System.out.print("eats grass");
    }
}