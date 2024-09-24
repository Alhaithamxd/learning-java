public class insertionSort{
    public static void insSort(int numbers[]){
        //Time complexity O(n^2)
        int n= numbers.length;
        for(int i=1;i<n;i++){
            int curr=numbers[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            //insertion
            numbers[prev+1]=curr;
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+ numbers[i]);
        }

    }
    public static void main(String args[]){
        int[] numbers={1,5,3,6,3,8,2};
        insSort(numbers);

    }
}