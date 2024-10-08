public class pairing{
    public static int FriendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        /*//choices
        int fnm1=FriendPair(n-1);//single

        int fnm2=FriendPair(n-2);//pair
        int pairways=(n-1)*fnm2;
        return fnm1 + pairways;*/
        return FriendPair(n-1) + FriendPair(n-2)*n-1 ;

    }
    public static void main(String args[]){
        System.out.print(FriendPair(3));
    }
}