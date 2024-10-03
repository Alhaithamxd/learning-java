class Student {
    static String name;
    int marks;
    static void roll(int a){
        System.out.println("your roll no is "+ a);
    }

}
public class practice{
    public static void main(String args[]){
        Student s= new Student();
        Student.name="aman";//name is static 
        Student.roll(10);//roll function is static
        //Student.marks=4; error: class cannot be accessed directly unless its a static variable or function
        System.out.print(s.name);
    }
}