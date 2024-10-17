public class MinMax{
    public static int Min(int x,int y){
        return y^(x^y & -(x<y?1:0));
        
    }
    public static int Max(int x,int y){
        return x^(x^y & -(x<y?1:0));
        
    }
    public static void main(String args[]){
        System.out.println(Min(23,45));
        System.out.println(Max(23,45));
        
    }
}