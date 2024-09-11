public class factorial{
    public static int factorial1(int fact){
        int f =1;
        for(int i=1;i<=fact;i++){
            f*=i;
        }
     
     
        return f; 
    }
    //binomial coeff.
    public static int BinCoeff(int n,int r){
        int nfact=factorial1(n);
        int rfact=factorial1(r);
        int nrfact=factorial1(n-r);
        int coeff=nfact/(rfact*nrfact);
        return coeff;
    }
    public static void main(String args[]){
       // System.out.println(factorial(8));
        System.out.print(BinCoeff(8,2));

    }
}