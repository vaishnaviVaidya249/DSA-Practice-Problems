public class Maximumsunsubarr {
    public static void main(String[] args) {
    int a[]={2,3,5};
        int k=5;
        int s=0;
       int c=0;
       int mc=0;
       for(int i=0;i<a.length;i++){
           if(a[i]<k){
               c=c+1;
               s=s+a[i];
               if(s==k){
                   mc=Math.max(mc,c);
                   s=0;
                   c=0;
               }else if(s>k){
                   s=0;
                   c=0;
               }
            }else{
                s=0;
                c=0;
                if(a[i]==k){
                    mc=Math.max(mc,1);

                }
            }
        }
        System.out.println(mc);
    }
}//only for positives
    
    

