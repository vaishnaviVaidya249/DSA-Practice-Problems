import java.util.* ;
import java.io.*; 
class Solution {

	public static void main(String args[]) {

		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();

		for(int j=0;j<k;j++){
			int r=0;
		    r=arr[0];
		    for(int i=0;i<arr.length-1;i++){
			    arr[i]=arr[i+1];

		    }
			arr[n-1]=r;

		}
		for(int a=0;a<arr.length;a++){
			System.out.print(arr[a]+" ");
		}





	}
}