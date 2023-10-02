class Solution {
    public String reverseWords(String s) {
        s.trim();

        String[] res=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=res.length-1;i>=0;i--){
              sb.append(res[i]);
              sb.append(" ");
        }
        return sb.toString().trim();


        
    }
}