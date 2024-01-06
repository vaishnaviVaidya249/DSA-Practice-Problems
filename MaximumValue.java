public class MaximumValue {
    public static void main(String[] args){
        int max_value=Integer.MIN_VALUE;
        int[] arr={2,3,1,4,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int n=(arr[i]-arr[j])+(i-j);
                int value=Math.abs(n);
                if(value>max_value){
                    max_value=value;
                }

                
            }
        }
        System.out.println(max_value);
    }
    
}
