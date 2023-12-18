

public class SubsequenceCount {
    int subsequenceSum(int a[], int n, int s, int i, int sum) {

        if (i == n) {
            if (sum == s) {
                //condition satisfied
              
             
                return 1;
            }else{
                return 0;

            }
           
            
         }
       

        // Include the current element in the sum
        
        sum=sum+a[i];
        int l=subsequenceSum(a, n, s, i + 1, sum);
        
        sum=sum-a[i];

        // Exclude the current element from the sum
        int r=subsequenceSum(a, n, s, i + 1, sum);
        return (l+r);
    }

    public static void main(String[] args) {
        SubsequenceCount si = new SubsequenceCount();
        int k = 2;
        int n = 3;
        int[] a = {1, 2, 1};
       System.out.println(si.subsequenceSum(a, n, k, 0, 0));
    }
    
}
