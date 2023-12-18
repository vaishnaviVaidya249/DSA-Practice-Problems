import java.util.ArrayList;

public class SubsequenceSumOne {
    boolean subsequenceSum(int a[], int n, ArrayList<Integer> list, int s, int i, int sum) {

        if (i == n) {
            if (sum == s) {
                //condition satisfied
                System.out.println(list);
                return true;
            }else{
                return false;

            }
           
            
         }
       

        // Include the current element in the sum
        list.add(a[i]);
        sum=sum+a[i];
        if(subsequenceSum(a, n, list, s, i + 1, sum)==true){
            return true;

        };
        list.remove(list.size() - 1);
        sum=sum-a[i];

        // Exclude the current element from the sum
        if(subsequenceSum(a, n, list, s, i + 1, sum)==true){
            return true;
        };
        return false;
    }

    public static void main(String[] args) {
        SubsequenceSumOne si = new SubsequenceSumOne();
        int k = 2;
        int n = 3;
        int[] a = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        si.subsequenceSum(a, n, list, k, 0, 0);
    }
    
}
