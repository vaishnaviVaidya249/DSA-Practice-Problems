import java.util.*;
public class R4Sum {
    
    int sum(int n,int s){
        if(n<=0){
            return s;
        }
        return sum(n-1,s+n);
        

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        R4Sum o=new R4Sum();
        int value=o.sum(n,0);
        System.out.println(value);

        
    }
    
}
