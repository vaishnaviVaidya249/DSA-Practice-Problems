import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutations {
    public static void main(String [] args){
 

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n=permutation.size();
		int index=-1;
		for(int i=n-2;i>=0;i--){
			if(permutation.get(i)<permutation.get(i+1)){
				index=i;
				break;

			}
		}

			if(index==-1){
				Collections.reverse(permutation);
				return permutation;

			}

			for(int i=n-1;i>index;i--){
				if(permutation.get(i)>permutation.get(index)){
					int temp=permutation.get(i);
					permutation.set(i,permutation.get(index));
					permutation.set(index,temp);
					break;
				}
			}

			List<Integer> l=permutation.subList(index+1,n);
			Collections.reverse(l);

			// return permutation;


		
		return permutation;


	}
}

    }
    

