public class PrintSubarray{
    public static void printSub(int numbers[]){
        int ts=0;
        int start=0,end=numbers.length;
        for(start=0;start<end;start++){
            //System.out.print("("+numbers[start]+" )");
            for(int j=start;j<end;j++){
                System.out.print("(");
                int sum =0;
                for(int k=start;k<=j;k++){
                    //System.out.print(+numbers[k]+" ");
                    //int sum=0;
                    sum=sum+numbers[k];

                                        

                }
                
                System.out.print(sum);
                System.out.print(") ");
                ts++;
                
            }
            System.out.println();
        }
        System.out.print("total subarray :"+ ts);//n(n+1)/2
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9};
        printSub(numbers);
    }

}