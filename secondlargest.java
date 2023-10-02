import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int res=0;
		Arrays.sort(arr);
		// if(arr[n-1]==arr[0]){
		// 	return -1;
		// }
		// else
		// {
			for(int i=n-1;i>0;i--){
				if(arr[i]!=arr[i-1]){
					return arr[i-1];
				}
			}
			return -1;
			//inside the function but outside the wahtever the loop we use
			//we have to mention the return 
			//statement if the function return value is int or anything.

		// }








	}
}