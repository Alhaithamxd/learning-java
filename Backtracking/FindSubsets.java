public class FindSubsets{
    public static void findsub(String str,String ans,int i){//time complexity O(n*2^n)
        //base case                                         //space complexity O(n)
        if(i==str.length()){
            System.out.println(ans);
            return;
        }


        //recursion
        //yes choice
        findsub(str,ans+str.charAt(i),i+1);
        //no choice
        findsub(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        findsub(str,"",0);
    }
}