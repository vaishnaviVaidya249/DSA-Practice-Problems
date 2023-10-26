import java.util.ArrayList;

public class RemoveDuplicates {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		for(int i=n-1;i>0;i--){
			if(arr.get(i).equals(arr.get(i-1))){
			    arr.remove(i);
		    }

		}
		return arr.size();
		

    }
    
}
