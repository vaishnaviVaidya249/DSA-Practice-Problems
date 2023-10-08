public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int temp=n;
        int c=0;
        
        while(n!=0){
            int r=n%10;
            if(r!=0 && temp%r==0){
                c++;

                


            }
            n=n/10;

        }
        return c;

    }
}