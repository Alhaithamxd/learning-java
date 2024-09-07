import java.util.*;
public class javabasics {
    public static void main(String args[]){
        //if else and else if 
        if(3>2){
            System.out.println("fuck off");

        }
        else {
            System.out.println("fuck you");
        } 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        if (a>b){
            System.out.println("first number is grater than second");
        }
        else if(b>a) {
            System.out.println("second number is greater than first");

        }
        else {
            System.out.print("both are equal");
        }
        //ternanry operator
        int larger = (a>b)?a:b;
        System.out.println(larger + " is greater");
        //switch statement
        switch (a){
            case 80 :
                System.out.print("shit man");
                        break;        
            case 70:
                System.out.print("not really");
                        break;
            case 90:
                System.out.print("equally fucked");
                        break;
            default:

        
        
        
        }
        

    }
}
