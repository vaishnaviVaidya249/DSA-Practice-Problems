import java.util.*;
public class Maximumsunsubarr {
    public static void main(String[] args) {
//     int a[]={2,3,5};
//         int k=5;
//         int s=0;
//        int c=0;
//        int mc=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]<k){
//                c=c+1;
//                s=s+a[i];
//                if(s==k){
//                    mc=Math.max(mc,c);
//                    s=0;
//                    c=0;
//                }else if(s>k){
//                    s=0;
//                    c=0;
//                }
//             }else{
//                 s=0;
//                 c=0;
//                 if(a[i]==k){
//                     mc=Math.max(mc,1);

//                 }
//             }
//         }
//         System.out.println(mc);
//     }
// }//only for positives



    public static int longestSubarrayWithSumK(int []a, long k) {
        Map<Long,Integer> map=new HashMap<>();
        long sum=0;
        int maxlen=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];

            if(sum==k){
                maxlen=Math.max(maxlen,i+1);

            }
            long rem=sum-k;

            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxlen=Math.max(maxlen,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxlen;
    }
}



        // int left = 0, right = 0;

        // int n = a.length, ansMax = 0;

        // long curSum = 0L;

        // while(right < n){

        //     curSum += a[right];

        //     while(left < right && curSum > k){

        //         curSum -= a[left];

        //         left++;

        //     }

        //     if(curSum == k){

        //         ansMax = Math.max(ansMax, right-left+1);

        //     }

        //     right++;

            

        // }

        // return ansMax;
        
       
    //    int s=0;
    //    int c=0;
    //    int mc=0;
    //    for(int i=0;i<a.length;i++){
    //        if(a[i]<k){
    //            c=c+1;
    //            s=s+a[i];
    //            if(s==k){
    //                mc=Math.max(mc,c);
    //                s=0;
    //                c=0;
    //            }else if(s>k){
    //                s=0;
    //                c=0;
    //            }
    //         }else{
    //             s=0;
    //             c=0;
    //             if(a[i]==k){
    //                 mc=Math.max(mc,1);

    //             }
    //         }
    //     }
    // //     return mc;
    // }

    
    

