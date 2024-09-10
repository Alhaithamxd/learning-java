public class patterns{
    public static void main(String args[]){
        int i = 1;
        for(i=1;i<=5;i++){//outer loop runs the number of lines in patterns
            int j=1;
            for (j=1;j<=i;j++){//nested loop is for no. of chars
                System.out.print(j);//use any pattern instead of j if we want
            }
            System.out.println();
        }
    }

}