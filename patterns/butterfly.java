public class butterfly{
    public static void butterFly(int n){
        //first half
        for(int i=1;i<=n/2;i++){
            //intial stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //space
            for(int j=1;j<=n-(2*i);j++){
                System.out.print(" ");
            }
            //end stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half more effective
         for(int i=n/2;i>=1;i--){
            //intial stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //space
            for(int j=1;j<=n-(2*i);j++){
                System.out.print(" ");
            }
            //end stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half less effective
       /* for(int i=0;i<=n/2;i++){
            //initail star
            for(int j=1;j<=(n/2)-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            //end stars
            for(int j=1;j<=(n/2)-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
    public static void main(String args[]){
        butterFly(10);
    }
}