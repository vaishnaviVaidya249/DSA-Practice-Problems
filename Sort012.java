import java.util.Arrays;

public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        //sol 1
        Arrays.sort(arr);

        //sol 2
        int zero=0;
        int one=0;
        int two=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        for(int j=0;j<zero;j++){
            arr[j]=0;

        }
        for(int k=zero;k<zero+one;k++){
            arr[k]=1;

        }
        for(int l=zero+one;l<zero+one+two;l++){
            arr[l]=2;
        }

        //sol 3 dutch national flag algorithm

        int mid=0;
        int low=0;
        int high=arr.length-1;
        
        if(mid==0){
            int temp=arr[mid];
            arr[mid]=arr[low];
            arr[low]=temp;
           
            mid++;
            low++;
        }else if(mid==1){
            mid++;
        }else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            
            high--;
        }



        
       

       

    }

    
}
