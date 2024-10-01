public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen();//created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.print(p1.getTip());
        BankAccount myAcc=new BankAccount();
        myAcc.username="nomann";
        myAcc.setPassword("shit");

    }

}
class BankAccount{
    public String username;
    private String password;
    protected void setPassword(String pwd){
        password=pwd;
    }

}







class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percetage;
    
}