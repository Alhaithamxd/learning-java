//the naive way
public class CountingBits1{
    public static int count(int n){
        int c=0;
        while(n!=0){
            c+=n&1;//so that we don't count 0
            n>>>=1;
        }
        return c;

    }
    public static void main(String args[]){
        System.out.print(count(17));
    }

}
