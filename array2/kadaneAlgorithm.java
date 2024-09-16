public class kadaneAlgorithm{
    public static void Algo(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum>=0){
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }else{
                currSum=0;
            }
            
        }
        System.out.print("max sum : "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[]={1,2,4,-5,-4,5,7};
        Algo(numbers);
    }
}