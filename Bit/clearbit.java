public class clearbit{
    public static int clearBit(int n,int i){
        int bitmask=1<<i;
        return n & (~bitmask);
    }
    public static void main(String args[]){
        System.out.print(clearBit(10,1));
    }
}