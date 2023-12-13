public class Longestcommonprefixinarray {
    Arrays.sort(arr);
    String res="";

    char[] first=arr[0].toCharArray();
    char[] last=arr[arr.length-1].toCharArray();

    for(int i=0;i<first.length;i++){
        if(first[i]==last[i]){
            res+=first[i];
            
        }else{
            break;
        }
        

    }
    if(res!=""){
        return res;
    }else{
        return "-1";


    
}
