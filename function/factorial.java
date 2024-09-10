public class factorial{
    public static int factorial(int fact){
        int f =1;
        for(int i=1;i<=fact;i++){
            f*=i;
        }
        return f; 
    }
    public static void main(String args[]){
        System.out.print(factorial(8));
    }
}