public class binarytodecimal{
    public static void binToDec(int binNum){//binary to decimal
        int mynum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        System.out.print("decimal of "+ mynum+" = "+decNum);

    }
    public static void decToBin(int decNum){//decimal to binary
        int myNum=decNum;
        int pow =0;
        int binNum=0;

        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum/=2;

        }
        System.out.print("binary form of "+ myNum +" = "+binNum);

        
        
    }
    public static void main(String args[]){
       // binToDec(101);
        decToBin(15);
    }

    
}