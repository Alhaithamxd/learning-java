import java.util.*;
public class maxprofit{
    //best time complexity i.e O(n)
    public static int maxpro1(int prices[]){
        int minval=prices[0];
        int n = prices.length;
        int res=0;
        for(int i=0;i<n;i++){
            minval=Math.min(minval,prices[i]);
            res=Math.max(res,prices[i]-minval);
            
        }
        return res;


    }
    public static int maxpro(int prices[]){
        /*time complexity for this is pretty high i.e O(n^2)
        we have got better aternatives*/
        int n = prices.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res,prices[j]-prices[i]);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] prices={9,2,4,5,7};
        System.out.println(maxpro(prices));
        System.out.print("max profit = "+maxpro1(prices));

    }
}