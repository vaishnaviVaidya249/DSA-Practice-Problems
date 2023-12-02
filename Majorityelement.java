public class Majorityelement {
    public static int majorityElement(int []v) {
     // Write your code here
        // int l=v.length/2;
        // int c=0;
        // int me=0;
        // if(v.length==1){
        //     return v[0];
        // }
    
        
        // int e=0;
        // for(int i=0;i<v.length;i++){
        //     e=v[i];
        //     for(int j=0;j<v.length;j++){
        //         if(j!=i){
        //             if(v[j]==e){
        //                 c++;

        //             }
        //         }
        //     }
        //     if(c>l){
                
        //         me=e;
        //         break;
        //     }


        // }
        // return me;

        //sol 2 hashmap
        // int n=v.length;

        // Map<Integer,Integer> hm=new HashMap<>();
        // for(int i=0;i<v.length;i++){
        //     int res=hm.getOrDefault(v[i],0);
        //     hm.put(v[i],res+1);
        // }

        // for(Map.Entry<Integer,Integer> it:hm.entrySet()){
        //     if(it.getValue()>(n/2)){
        //         return it.getKey();
        //     }
        // }
        // return -1;

        //sol-3

        //mooves voting algorithm
        int c=0;
        int e=0;
        for(int i=0;i<v.length;i++){
            if(c==0){
                c=1;
                e=v[i];
            }else if(v[i]==e){
                c++;
            }else{
                c--;
            }
        }
        return e;
    
}
