
public class PrintNto1
{
    static int i=0;
    public static void print(int x,int[] arr){
       if(i==x) return;
       arr[i]=x-i;
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
