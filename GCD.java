public class GCD {
    public static int calcGCD(int n, int m){
        // Write your code here.
        // int res=0;
        // int maxi=Math.max(m,n);
        // for(int i=1;i<=maxi;i++){
        //     if(n%i==0 && m%i==0){
        //         res=Math.max(res,i);
                

                

                
        //     }
        // }
        // return res;
        while(n>0 && m>0){
            if(n>m){
                n=n%m;
            }else{
                m=m%n;
            }
            

        }

        if(n==0){
            return m;
        }
        return n;
        
        



    }
}