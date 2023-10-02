import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n=arr.length;
		int[] left=new int[n];
		int[] right=new int[n];
        left[0]=0;
		for(int i=1;i<n;i++){
			
			left[i]=left[i-1]+arr[i-1];
		}

		right[n-1]=0;
		for(int j=n-2;j>=0;j--){
			
			right[j]=right[j+1]+arr[j+1];
		}
		for(int k=0;k<n;k++){
			if(left[k]==right[k]){
				return k;
			}
		}
		return -1;


		

		
		// for(int i=0;i<n;i++){
		// 	int ls=0,rs=0;
		// 	for(int l=0;l<i;l++){
		// 		ls=ls+arr[l];
		// 	}
		// 	for(int r=i+1;r<n;r++){
		// 		rs=rs+arr[r];

		// 	}
		// 	if(ls==rs){
		// 		return i;
		// 	}

		// }
		// return -1;
	
		
		
	}
}
