class Solution {
     public String longestPalindrome(String s) {
         int start=0,end=0;
         for(int i=0;i<s.length();i++){
             int odd=expand(s,i,i);
             int even=expand(s,i,i+1);

             int len=Math.max(odd,even);
             if(len>end-start){
                 start=i-(len-1)/2;
                 end=i+len/2;
             }
         }
         return s.substring(start,end+1);


//         String res="";
//         int ml=0;
//         String f="";
//         if(s.length()==1){
//             return s;
//         }
//         for(int i=0;i<s.length();i++){
//             for(int j=s.length()-1;j>i;j--){
//                 StringBuilder sb=new StringBuilder();
//                 sb.append(s.substring(i,j));
//                 sb.reverse();
//                 if(s.substring(i,j).equals(sb.toString())){
//                     res=s.substring(i,j);
//                     if(res.length()>f.length()){
//                         f=res;
//                     }
                   
                    
//                 }
                

//             }
//         }
//         return f;


        
     }
     int expand(String s,int left,int right){
         while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
             left--;
             right++;

         }
         return right-left-1;
     }
 }
