import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean areIsomorphic(String str1, String str2) {
        // Write your code here.
        if(str1.length()!=str2.length()){
            return false;
        }

        Map<Character,Integer> h1=new HashMap<>();
        Map<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if (!h1.containsKey(str1.charAt(i))) {
                h1.put(str1.charAt(i), 1);
            } else {
                h1.put(str1.charAt(i), h1.get(str1.charAt(i)) + 1);
            }

            if (!h2.containsKey(str2.charAt(i))) {
                h2.put(str2.charAt(i), 1);
            } else {
                h2.put(str2.charAt(i), h2.get(str2.charAt(i)) + 1);
            }
            
        }

        if(h1.size()!=h2.size()){
            return false;
        }

        return true;
    
        // int c1=0,c2=0;
        // char arr1[] = str1.toCharArray();
        // char arr2[] = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for(int i=0;i<arr1.length-1;i++){
        //     if(arr1[i]!=arr1[i+1]){
        //         c1+=1;

        //     }
            
        //     if(arr2[i]!=arr2[i+1]){
        //         c2+=1;
        //     }
        // }

        // if(c1==c2){
        //     return true;
        // }else{
        //     return false;
        // }
    
   

    }
    
}
