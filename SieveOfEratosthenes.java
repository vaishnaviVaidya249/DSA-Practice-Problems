public class SieveOfEratosthenes {
    public static void main(String[] args) {
        // int n=7; brute force
        // for(int i=1;i<=n;i++){
        //     int flag=1;
        //     if(i==0 || i==1){
        //         continue;
        //     }
        //     for(int j=2;j<=i/2;j++){
        //         if(i%j==0){
        //             flag=0;
        //         }
        //     }
        //     if(flag==1){
        //         System.out.print(i+" ");
            
        //     }
        // }
        
        //using sieve Eratosthenes algorithm
        int n=50;
        boolean[] prime=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
                
            }
            
        }
        
        //tc:O(sqrt(n)log(log(n))) sc:O(n)
    }
    
}
