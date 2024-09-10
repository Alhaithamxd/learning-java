public class primenumber {
   /* public static boolean isPrime(int n){
        boolean isPrime= true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;

            }
            
        }
        return isPrime;

    }
    public static void main(String args[]){
        System.out.print(isPrime(4));
    }*/
    public static boolean isPrime(int n){//helper code
        if(n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
    public static void PrimeInRange(int n){//prime number in range
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
       // System.out.print(isPrime(24));
       PrimeInRange(1000);
    }
}