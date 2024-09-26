public class updateBit{
    public static int ubit(int n, int i,int k){
        int maskbit=1<<i;
        return (n & ~maskbit) | (k<<i) ;

    }
    public static void main(String args[]){
        System.out.print(ubit(7,3,1));
    }
}