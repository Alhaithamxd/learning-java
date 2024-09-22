public class palindrome{
    public static boolean plad(String str){
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){//condition for not  a palindrome
            System.out.print("not a palindrome");
            return false;
        }
    }
    System.out.print(str +" is a palindrome");
    return true;

    }
    public static void main(String args[]){
        String str="madam";
        plad(str);
    }
}