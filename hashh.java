import java.util.*;
public class hashh {
    public static void main(String[] args){
        int[] arr={8,1,2,7,4,7,7,6};
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }else{
                map.put(arr[i],1);
            }

        }
        

        // int[] arr=new int[256];
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)]+=1;


        // }

        // for(int i=0;i<s.length();i++){
        //     System.out.println(arr[s.charAt(i)]);
            

        // }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
          }
    }
    
}
