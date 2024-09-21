public class diagonalSum{
    public static int diagSum(int matrix[][]){//optimised code as time complexity is O(n)
        int m=0,n=0;
        for(int i=0;i<matrix.length;i++){
            m+=matrix[i][i];
            if(i!=matrix.length-1-i){
                n+=matrix[i][matrix.length-1-i];

            }
                        
        }
        /*for(int j=0;j<matrix.length;j++){
            n+=matrix[j][matrix.length-1-j];
        }*/
        int sum=m+n;
        return sum;

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print("diagonal sum = "+diagSum(matrix));

    }
  
}