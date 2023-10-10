 public class Print1ton {
    
    static int i=0;
    public static void print(int x,int[] arr){
        if(i==x) return;
        
        arr[i]=i+1;
        i++;
        print(x,arr);
    }

        
     
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr=new int[x];
        print(x,arr);
        return arr;
        
        
        

        

    
        
        
    }
}
