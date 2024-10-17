public class ComputeSign{
    public static int Sign(int n){
        return (n!=0?1:0) | -(n>>(Integer.SIZE - 1));

    }
    public static void main(String args[]){
        System.out.print(Sign(-123));
    }
}