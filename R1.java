import java.util.*;
public class R1 {
    
    void printName(int c,int n){
        if(c==n){
            return;
        }
        System.out.println("Vaishnavi");
        printName(c+1,n);
    }
    public static void main(String[] args) {
        R1 obj=new R1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        obj.printName(0,n);
        
    }
    
}
