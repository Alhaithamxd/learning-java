public class powerof2{
    public static boolean pow2(int n){
        if((n & (n-1))== 0){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.print(pow2(4));
    }
}