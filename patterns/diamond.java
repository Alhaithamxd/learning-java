public class diamond{
    public static void diamondPat(int n){
        //for first half
        for(int i =1;i<=n/2;i++){
            //spaces
            for(int j=1;j<=(n/2)-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        //for second half
        for(int k =n/2;k>=1;k--){
            //spaces
            for(int j=1;j<=(n/2)-k;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*k)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        } 
        
    }
    public static void main(String args[]){
        diamondPat(10);
    }
}