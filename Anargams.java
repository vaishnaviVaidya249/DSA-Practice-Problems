import java.util.HashMap;
import java.util.Map;

public class Anargams {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }

        Map<Character,Integer> h1=new HashMap<>();
        Map<Character,Integer> h2=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            h1.put(str1.charAt(i), h1.getOrDefault(str1.charAt(i), 0) + 1);

            h2.put(str2.charAt(i), h2.getOrDefault(str2.charAt(i), 0) + 1);

        }

        for(int i=0;i<str1.length();i++){
            if(h2.containsKey(str1.charAt(i))){
                if(h1.get(str1.charAt(i))!=h2.get(str1.charAt(i))){
                    return false;
                }
            }else{
                return false;
            }
            
        }
         return true;


        //Your code goes here
        // if(str1.length()==str2.length()){
        //     char[] arr1=str1.toCharArray();
        //     char[] arr2=str2.toCharArray();

        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);

        //     String r1=new String(arr1);
        //     String r2=new String(arr2);

        //    if(r1.equals(r2)){
        //        return true;
        //    }
           
            
        // }
        // return false;
    }
    
}
