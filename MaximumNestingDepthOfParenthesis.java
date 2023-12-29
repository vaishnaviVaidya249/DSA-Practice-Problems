public class MaximumNestingDepthOfParenthesis {
    public int maxDepth(String s) {
        int max_count=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count+=1;
                max_count=Math.max(count,max_count);

            }else if(s.charAt(i) == ')'){
                count-=1;
            }
        }
        return max_count;
        
    }
    
}
