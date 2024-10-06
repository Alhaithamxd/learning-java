public class Factorial{
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
        /*int f=1; //mine code
        if (n==0){
            return 1;
            
        }
        f*=n*fact(n-1);
        return f;*/
    }
    public static void main(String args[]){
        System.out.print(fact(5));
    }
}