public class LeftRoatateOne {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<=n-1;i++){
            arr[i-1]=arr[i];

        }
        
        arr[n-1]=temp;
        return arr;
    }
    
}
