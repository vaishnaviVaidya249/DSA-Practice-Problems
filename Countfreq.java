public class Countfreq {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]-1<n){
                arr[nums[i]-1]++;

            }
        
           
        }
        return arr;

    }
    
}
