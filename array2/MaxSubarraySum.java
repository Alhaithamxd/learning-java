public class MaxSubarraySum{
    public static void printSub(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int i=0,j=numbers.length;
        for(i=0;i<j;i++){
            //System.out.print("("+numbers[i]+" )");
            for(int l=i;l<j;l++){
                currSum=0;
                
                for(int k=i;k<=l;k++){
                   // System.out.print(+numbers[k]+" ");
                   currSum +=numbers[k];
                    
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                
               
                
            }
            
        }
        System.out.println("max sum : "+maxSum);
       
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9};
        printSub(numbers);
    }

}