import java.util.*;
public class R3BackTrack {

    void print(int i,int n){
        if(i>n){
            return;
        }
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        R3BackTrack o=new R3BackTrack();
        o.print(1,n);

    }
    
}
