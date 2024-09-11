import java.util.*;
public class palindrome{
    public static void paliD(int num){
        int mynum=num;
        int rev=0;
        while(num!=0){
            int lastdigit=num%10;
            rev= rev*10 + lastdigit;
            num/=10;
           // System.out.println(rev);
        }
        System.out.println(rev);
        if(rev==mynum){
            System.out.print(mynum+" is a palindrome");
        }else{
            System.out.print("not a palindrome");
        }

        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to check for palindrome");
        int palindrome = sc.nextInt();
        paliD(palindrome);
        



    }
}