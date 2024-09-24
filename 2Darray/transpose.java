public class transpose{
    public static void tran(int matrix[][],int trap[][]){
        //int trap[][]= new int[matrix.length][matrix.length];//time complexity is O(n^2) better solution needed 
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                trap[i][j]=matrix[j][i];
            }
        }
        /*for(int i=0;i<trap.length;i++){
            for(int j=0;j<trap.length;j++){
                System.out.print(trap[i][j]+" ");
            }
            System.out.println();
        }*/
        
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int trap[][]= new int[matrix.length][matrix.length];

        tran(matrix,trap);
        for(int i=0;i<trap.length;i++){
            for(int j=0;j<trap.length;j++){
                System.out.print(trap[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}