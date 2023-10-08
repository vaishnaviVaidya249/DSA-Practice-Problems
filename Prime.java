import java.util.*;
public class Prime {

    public static void main(String[] args) {
        //Your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c=1;
            }

        }
        if(c==1){
            System.out.println("false");
        }else{
            System.out.println("true");

        }
    }

}
