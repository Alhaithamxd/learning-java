public class selectionSort{
    public static void selSort(int numbers[]){
        int n= numbers.length;
        int i,j;
        //time complexity O(n^2)
        for(i=0;i<n-1;i++){
            int minPos=i;
            for(j=i+1;j<n;j++){
                if(numbers[minPos]>numbers[j]){
                    minPos=j;
                }

            }
            //swap
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;



        }
        for(i=0;i<n;i++){
            System.out.print(" "+numbers[i]);
        }
    }
    public static void main(String args[]){
        int []numbers={1,5,3,7,3,8,9};
        selSort(numbers);

    }
}