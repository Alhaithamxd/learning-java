public class MergeSort{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void MergeS(int arr[], int si, int ei){//time complexity O(nlogn), space O(n)
        //base case
        if(si>=ei){
            return;
        }
        //work
        int mid=si + (ei-si)/2;//(si+ei)/2
        MergeS(arr,si,mid);//left part
        MergeS(arr,mid+1,ei);//right part
        merge(arr, si,mid,ei);

    }
    public static void merge(int arr[],int si , int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;

            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for left over case
        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy them to original arraay
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


    }
    public static void main(String args[]){
        int arr[]={1,4,657,4,2,436,7,3,58,423,8,6743,2};
        MergeS(arr,0,arr.length-1);
        printarr(arr);
    }
}