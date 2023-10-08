public class PalindromeNumber {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int temp=n;
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==temp){
            return true;
        }else{
            return false;
        }

    }
}