public class Consecutiveones {
    public static void main(String[] args) {
        int a[]={1, 0, 1, 1, 0, 1};
        int c=0;
        int mc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                c++;
                mc=Math.max(c,mc);
            }else{
                c=0;
            }
        }
        System.out.println(mc);
        
    }
    
}
