public class sumof2row{
    public static int SUM(int matrix[][]){
        int i =1;
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[i][j];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{4,6,7,8},{9,10,11,12}};
        System.out.print(SUM(matrix));
    }
}