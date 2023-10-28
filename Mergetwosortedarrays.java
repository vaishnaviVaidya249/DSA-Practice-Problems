import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mergetwosortedarrays {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        // Set<Integer> unique=new HashSet<>();

        // for(int e:a){
        //     unique.add(e);
        // }
        // for(int e:b){
        //     unique.add(e);
        // }
        // List<Integer> res=new ArrayList<>(unique);
        // Collections.sort(res);
        // for(int i = 1 ; i < res.size() ; i++){

        //     if(res.get(i-1) >= res.get(i)){

        //         res.remove(res.get(i-1));

        //         i--;

        //     }

        // }

    
        // return res;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(!res.contains(a[i])){
                res.add(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(!res.contains(b[i])){
                res.add(b[i]);
            }
        }
        Collections.sort(res);
        for(int i = 1 ; i < res.size() ; i++){

            if(res.get(i-1) >= res.get(i)){

                res.remove(res.get(i-1));

                i--;

            }

        }
        return res;
    }

    
}
// import java.util.*;
// class HelloWorld {
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,6};
//         int[] b={2,3,5};
//         int n=a.length;
//         int m=b.length;
//         int i=n-1;
//         int j=0;
//         while(i>=0 && j<m){
//             if(a[i]>b[j]){
//                 int temp=a[i];
//                 a[i]=b[j];
//                 b[j]=temp;
//                 i--;
//                 j++;
//             }else{
//                 break;
//             }
//         }
//         Arrays.sort(a);
//         Arrays.sort(b);
//          LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//          for(int k=0;k<n;k++){
//              set.add(a[k]);
             
//          }
//          for(int l=0;l<m;l++){
//              set.add(b[l]);
             
//          }
//            System.out.println(set);
         
        
        
       
//         // for(int k=0;k<n;k++){
//         //     System.out.println(a[k]);
//         // }
        
//         // for(int l=0;l<m;l++){
//         //     System.out.println(b[l]);
//         // }
//     }
// }
