public class SumN{
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int snm1=sum(n-1);
        int total=n+sum(n-1);
        return total;
        /*if (n==0){
            return 0;
        }
        int total=n;
        total+=sum(n-1);
        return total;*/
        
    }
    public static void main(String args[]){
        System.out.print(sum(5));

    }

}