public class DetectOppSign{
    public static boolean opp(int x,int y){
        return (x^y)<0;
    }
    public static void main(String args[]){
        System.out.print(opp(2,-3));
    }
}