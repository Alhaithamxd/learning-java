public class repeat{
    public static boolean repeated(int numbers[]){
        int n= numbers.length;
        boolean rep=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                    //break;
                }
            }
        }
        return rep;
    }
    public static void main(String args[]){
        int [] numbers={1,2,3,9,6,4,5,};
        System.out.print(repeated(numbers));

    }
}