import java.util.*;
public class functions{
    public static void printhello(){
        System.out.print("hello world");
    }
    /*public static void main(String args[]){
        printhello();//calling function


    }*/
    //function with parameter
    public static int calculateSum(int num1,int num2){//parameters or formal parameters are paased during function defining 
        int sum = num1+num2;
        return sum;
    }
     
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);//the value passed here is called arguments or actual parameters
        System.out.print("sum is "+ sum);

    }
}