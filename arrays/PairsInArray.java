public class PairsInArray{
    public static void printPairs(int numbers[]){//time complexity O(n^2)
        int tp=0;
        for (int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=1+i;j<numbers.length;j++){
                System.out.print("("+curr+","+j+")"+" ");
                tp++;
            }
            System.out.println();
        }//total number of pairs = n(n-1)/2
        System.out.print("total number of pairs: "+tp);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9};
        printPairs(numbers);
    }
}