import java.util.*;
public class R2 {
    void print(int n){
        if(n<=0){
            return;

        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        R2 o2=new R2();
        o2.print(n);

    }
    
}
