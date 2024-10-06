public class NthFiboNum{
    public static int Fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        //int fnm2=Fibo(n-2);
        //int fnm1=Fibo(n-1);
        int fn =Fibo(n-1)+Fibo(n-2); 
        return fn;
    }
    public static void main(String args[]){
        System.out.print(Fibo(25));
    }

}