public class rhombus{
    // Function for Solid Rhombus
    static void solidRhombus(int rows)
    {
        int i, j;
        for (i=1; i<=rows; i++)
        {
            // Print trailing spaces
            for (j=1; j<=rows - i; j++)
                System.out.print(" ");
              
            // Print stars after spaces
            for (j=1; j<=rows; j++)
                System.out.print("*");

            System.out.println();
        }
    }
    // function for hollow rhombus
    static void hollowRhombus(int n){
        int i,j;
        for(i=1;i<=n;i++){
            //initial spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //hollow rectangle modified code
            for(j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
            
        }
    }
    public static void main(String args[]){
        //solidRhombus(10);
        hollowRhombus(20);
    }
}