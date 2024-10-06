public class FirstOcuurence{
    public static int Ocuur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return Ocuur(arr,key,i+1);

    }
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6,5,6,7,8,6};
        int key = 10;
        
        System.out.print(Ocuur(arr,key,0));
    }
}