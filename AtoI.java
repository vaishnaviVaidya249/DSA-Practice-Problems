public class AtoI {
    public int myAtoi(String s) {
        
        s = s.trim();// removing spaces

       if(s.length()==0)
       return 0;

       int si=1;
       int i=0;
       if(s.charAt(0)=='-'||s.charAt(0)=='+')// to indicate the sign
       {
       si = s.charAt(0)=='-'?-1:1;
       i++;
       }

       long r=0;
       
       while(i<s.length()&& Character.isDigit(s.charAt(i)))
       {
           r = r*10 + Character.getNumericValue(s.charAt(i));//adding numbers to the result varible from string using Character.getNumericValue(s.charAt(i))

           if (r * si > Integer.MAX_VALUE) {
               return Integer.MAX_VALUE;
           } else if (r * si < Integer.MIN_VALUE) {
               return Integer.MIN_VALUE;
           }

           i++;
       }
       r*=si;//adding sign

           return (int) r;

      
   }
    
}
