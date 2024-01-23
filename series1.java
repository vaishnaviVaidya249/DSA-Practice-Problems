public class series1 {
    public static void main(String[] args) {
        int i=1;
        int t=1;
        System.out.print((t)+" ");
       
        int n=1002;
        while(i>0 && t<n){
            
            int res=i*i;
            if(res%3!=0){
                t=res+t;
                System.out.print((t)+" ");
                
                
            }
            i++;
            
            
        }
        
    }
    
}
