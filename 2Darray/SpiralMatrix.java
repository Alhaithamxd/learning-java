public class SpiralMatrix{
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j = startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int k= startRow+1;k<=endRow;k++){
                System.out.print(matrix[k][endCol]+" ");
            }
            //bottom
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");

            }
            //left
            for(int l=endRow-1;l>startRow;l--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[l][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);

    }
}