import java.util.*;
public class string{
    public static void main(String args[]){
        char arr[]={'q','w','e','r'};
        String str="qwer";
        String str2=new String("xyz");
        System.out.println(str+" "+str2);
        // strings are immutable
        Scanner sc= new Scanner(System.in);//input for string
        String name;
        name=sc.nextLine();
        System.out.println(name);
        //concatenation
        String firstname="tony";
        String lastname="stark";
        String fullname=firstname+" "+lastname;//+ is used for concatenation in java
        System.out.print(fullname.charAt(5));//charAt is used to get that index char

    }
}