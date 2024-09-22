public class Search{
    public static boolean search(int matrix[][],int key){
        int row =matrix.length-1,col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.print("found key at index "+row+" "+col);
                return true;
            }
            else if(key<matrix[row][col]){
                row--;

            }
            else{
                col++;
            }

        }
        System.out.print("key not found");
        return false;
        /*int row =0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("found key at index "+row+" "+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;

            }
            else{
                row++;
            }

        }
        System.out.print("key not found");
        return false;*/
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16;
        search(matrix,key);
        

    }
    
    
}