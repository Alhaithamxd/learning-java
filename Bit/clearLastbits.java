public class clearLastBits{
    public static int Lclear(int n, int i){
        int bitmask=-1<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.print(Lclear(15,2));
    }
}