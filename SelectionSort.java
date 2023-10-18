public class SelectionSort {
    public static void main(String[] args){
        int arr[]={7,5,9,3,0,1};
        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int temp=arr[s];
            arr[s]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
