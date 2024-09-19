public class bubblesort{
    public static void Bsort(int numbers[]){
        //Time complexity is O(n^2)
        int n=numbers.length;
        int swap=0;
        for(int i=0;i<=n-2;i++){
            swap+=1;

            for(int j=0;j<=n-2-i;j++){
                swap+=1;
                
                if(numbers[j]>numbers[j+1]){
                    //swap+=1;
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println(swap);
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        
        
        
    }
    public static void main(String args[]){
        int[] numbers={1,2,3,4,5,6};
        Bsort(numbers);
    }
}