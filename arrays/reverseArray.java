public class reverseArray{
    public static void revArray(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
        
    }



    public static void main(String args[]){
        int numbers[]={1,23,43,56,67,78};
        revArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}