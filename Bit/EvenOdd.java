import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        //int bitmask=1;
        if((num & 1)==0){
            System.out.print("even number");
        }else{
            System.out.print("odd number");
        }

    }
}