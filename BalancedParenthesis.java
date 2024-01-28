import java.util.*;
class BalancedParenthesis{

    boolean isValidParenthesis(String s) {
        // Write your code here.

        //using stack

        Stack<Character> l=new Stack<>();


        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                l.push(x);
                continue;
            }

            if(l.isEmpty())
              return false;

            char poppedEle=l.pop();
            if(x==')' && poppedEle!='(')
                return false;
            if(x==']' && poppedEle!='[')
                return false; 
            if( x=='}' && poppedEle!='{' )
                return false;
                
        }
        return true;

    }
    public static void main(String[] args) {
        String s="[()]{}{[()()]()}";
        BalancedParenthesis b=new BalancedParenthesis();

        boolean ans=b.isValidParenthesis(s);
        if(ans==true){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");

        }
        
    
    
            
            // while(true){//tc:o(n) sc:o(1)
            //     int originalLength=s.length();
            //     s=s.replace("()","");
            //     s=s.replace("[]","");
            //     s=s.replace("{}","");
    
            //     int newLength=s.length();
    
            //     if(newLength==originalLength)
            //        break;
            
    
    
    
    
            // }
            // if(s.length()==0){
            //     return true;
    
            // }
            // return false;
        
    }
}