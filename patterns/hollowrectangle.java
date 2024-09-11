public class hollowrectangle{
    public static void hollow_rect(int noRows,int noColm){
        for(int i=1;i<=noRows;i++){
            for(int j=1;j<=noColm;j++){
                if(i==1||i==noRows||j==1||j==noColm){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rect(11,8);
    }

}