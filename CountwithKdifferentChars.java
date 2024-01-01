public class CountwithKdifferentChars {
    public static int countSubStrings(String str, int k) {
        // Write your code here.
        int res=0;
       
        int n=str.length();
        
        for(int i=0;i<n;i++){
            int distinct_cnt=0;
             int[] cnt=new int[26];
            for(int j=i;j<n;j++){
                if(cnt[str.charAt(j)-'a']==0){
                    distinct_cnt++;
                    cnt[str.charAt(j)-'a']++;
                }
               
                if(distinct_cnt==k){
                    res++;
                }else if(distinct_cnt>k){
                    break;

                }
                
            }

        }
        return res;

    }
    
}
