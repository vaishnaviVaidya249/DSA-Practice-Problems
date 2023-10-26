public class Fibseries {
    public static int[] generateFibonacciNumbers(int n) {
        int temp[]=new int[n];
        fib(n,0,temp);
        return temp;
       
        
        


    }
    public static void fib(int n,int i ,int temp[]){
        if(i==n){
            return;
        }else if(i==0){
            temp[i]=0;
        }else if(i==1){
            temp[i]=1;
        }else{
            temp[i]=temp[i-1]+temp[i-2];
        }
        fib(n,i+1,temp);
    }
    
}
