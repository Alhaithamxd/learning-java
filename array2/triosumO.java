public class triosumO{
    public static void trios(int numbers[]){//time complexity of this is certainly high its O(n^3)
        int n = numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                        System.out.print("("+numbers[i]+" ,"+numbers[j]+" ,"+numbers[k]+")");
                    }
                }

            }
        }
        //return -1;
    }
    public static void main(String args[]){
        int [] numbers={1,-1,1,3,4,6,-2};
        trios(numbers);
    }
}