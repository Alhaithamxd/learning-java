public class TrappingRainwater{
    public static int trapWater(int height[]){
        int n = height.length;
        //calculate left max boundary in form of array
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary in form of array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
            //waterlevel =min(left max, right max)
            //trapped water=water level-height[i]
        int trappedWater =0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterlevel-height[i];
            //System.out.println(trappedWater);
            
            
            
        }
        
        
        return trappedWater;
        
    }
    public static void main(String arags[]){
        int [] height={4,2,0,6,3,2,5};
        System.out.print(trapWater(height));
        
    }
    

}