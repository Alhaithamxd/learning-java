import java.util.*;
public class BinarySearch{
    public static int BinSearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparison
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={1,343,32,5,6,778,86,24};
        int key=778;
        System.out.print("index for key is "+ BinSearch(numbers,key));
    }
}