public class QuickSort{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void QSort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        //pivot = last index
        int pInd=partition(arr,si,ei);
        QSort(arr, si,pInd-1);//left
        QSort(arr,pInd+1,ei);//right
    }


    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i=si-1;//to make place for elements smaller than pivot

        for(int j=si;j<=ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        /*i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;*/
        return i;

    }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1,-4532};
        QSort(arr,0,arr.length-1);
        printarr(arr);
    }
}