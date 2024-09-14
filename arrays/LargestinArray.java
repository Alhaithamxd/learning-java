import java.util.*;
public class LargestinArray{
    public static int getLarge(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
            
        }
        System.out.println("smallest number in array is : "+ smallest);
        return largest;

    }
    public static void main(String args[]){
        int numbers[]={1,2,5,6,78,34};
        System.out.print("largest value in our array is : "+ getLarge(numbers));
    }
}