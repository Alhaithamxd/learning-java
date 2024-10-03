public class interfaces {
    public static void main(String args[]){
        Queen q =new Queen();
        q.moves();
    }

}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left,right,diaogonally");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down, left , right");
    } 
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left,right,diaogonally,(by 1 step)");
    }
}