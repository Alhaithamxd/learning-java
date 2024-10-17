//Brian Kernigham's
public class CountingBits2{
    public static int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n&=n-1;
        }
        return c;
    }
    public static void main(String args[]){
        System.out.print(count(1023));
    }
}