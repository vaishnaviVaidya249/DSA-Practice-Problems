import java.util.*;
public class PalindromeusingRecursion {

    boolean palindrome(String name, int i,int n){
        if(i>=n/2){
            return true;
        }
        if(name.charAt(i)!=name.charAt(n-i-1)){
            return false;

        }
        return palindrome(name,i+1,n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        PalindromeusingRecursion s=new PalindromeusingRecursion();
        boolean r=s.palindrome(name.toLowerCase(),0,name.length());
        if(r==true){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");

        }
        
    }
    
}
