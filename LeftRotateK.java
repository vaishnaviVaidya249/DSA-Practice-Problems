public class LeftRotateK {
    public static void main(String[] args) {
        int[] arr={5,6,7,8};
       
        int k=3;
        int n=arr.length;
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=1;j<=n-1;j++){
                arr[j-1]=arr[j];
                
            }
            arr[n-1]=temp;
        }
        //
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
