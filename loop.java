import java.util.*;
public class loop {
    public static void main(String args[]){
        //while loop
        int counter = 0;
        /*while(counter<100){
            counter +=1;
            System.out.println(counter);
        }*/
        int sum = 0;
        while(counter<100){
            counter+=1;
            sum=sum + counter ;
            
        }
        System.out.println(sum);
        //for loop
        for (int z=1;z<=10;z++){
            System.out.println("hello world");
        }
        //check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num=sc.nextInt();
        if (num==2){
            System.out.print("num is prime");
        }else{
            boolean isPrime=true;
        for (int k=2;k<=num-1;k++){
            if(num%k==0){
                isPrime=false;

            }
        }
        if (isPrime==true){
            System.out.print("num is prime"
            );
        }else{
            System.out.print("num is composite");
        }
        }
        



        

    }
}
