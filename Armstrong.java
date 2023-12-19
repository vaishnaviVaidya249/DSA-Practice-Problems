import java.util.*;

public class Armstrong {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int s=0;
		int r=0;
		// if(n<10){
		// 	System.out.println("true");
		// }
		
		int l=String.valueOf(n).length();
		while(n>0){
			r=n%10;
			
			s+=Math.pow(r,l);
			n=n/10;
        }
		
		
		
		if(s==org && n<10){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		

	}
}
