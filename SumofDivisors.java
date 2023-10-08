
class SumpofDivisors {
    public static void main(String[] args) {
        int n=5;
        int s=0;
        //third approach
        for(int i=1;i<=n;i++){
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    //System.out.print(j+" ");
                    s=s+j;
                    if(j!=i/j){
                        //System.out.print(i/j+" ");
                        s=s+i/j;
                    }
                }
            }
            //System.out.println();
            
        }
        System.out.println(s);
        
        
        //second approach
        // int n=8;
        // int s=0;
        // for(int i=1;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         s+=i;;
        //         if(i!=n/i){
        //             s+=n/i;
        //         }
        //     }
        // }
        // 
        
        
        
        //first approach
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        
    }
}
