import java.util.*;
public class FibonacciUsingarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] numbers=new int[n+1];
        numbers[0]=0;
        numbers[1]=1;
        System.out.print(numbers[0]+", "+numbers[1]);
        
        for(int i=2;i<numbers.length;i++){
            numbers[i]=numbers[i-1]+numbers[i-2];
            System.out.print(", "+numbers[i]);
        }
    }
}
