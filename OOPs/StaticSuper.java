public class StaticSuper{
    public static void main(String args[]){
        //Student s1 = new Student();
        //s1.school="DPS";
        //Student s2 = new Student();
        //System.out.print(s2.school);//school is static for every object ists same
        Address a1= new Address();
        System.out.println(a1.name);
        
    }

}
class Student{
    Student(){
        System.out.println("main function constructor is called ");
    }
    static String school;
    String name;
    
   

}
class Address extends Student{
    Address(){
        super.name="jeffery";
        
        System.out.println("derieved class constructor is called ");
        
    }
    
    

    
    


}