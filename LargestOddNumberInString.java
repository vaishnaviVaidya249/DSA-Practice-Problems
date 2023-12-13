public class LargestOddNumberInString {
    for(int i=s.length()-1;i>=0;i--){
        char c=s.charAt(i);
        if(c%2==1){
            return s.substring(0,i+1);
        }
            
        }
        return "";
    
}
