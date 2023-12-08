import java.util.Arrays;

public class LongestConsecutive {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
         if (a.length == 0) {//tc:o(nlogn) sc:o(1)
            return 0;
        }

        Arrays.sort(a);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                currentCount++;
            } else if (a[i] != a[i - 1]) {
                currentCount = 1;
            }

            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
        
    
    
}
