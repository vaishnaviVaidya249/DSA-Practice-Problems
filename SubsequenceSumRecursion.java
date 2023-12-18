import java.util.ArrayList;

public class SubsequenceSumRecursion {

    void subsequenceSum(int a[], int n, ArrayList<Integer> list, int s, int i, int sum) {

        if (i == n) {
            if (sum == s) {
                System.out.println(list);
            }
            return;
            
         }
       

        // Include the current element in the sum
        list.add(a[i]);
        sum=sum+a[i];
        subsequenceSum(a, n, list, s, i + 1, sum);
        list.remove(list.size() - 1);
        sum=sum-a[i];

        // Exclude the current element from the sum
        subsequenceSum(a, n, list, s, i + 1, sum);
    }

    public static void main(String[] args) {
        SubsequenceSumRecursion si = new SubsequenceSumRecursion();
        int k = 2;
        int n = 3;
        int[] a = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        si.subsequenceSum(a, n, list, k, 0, 0);
    }
}





















