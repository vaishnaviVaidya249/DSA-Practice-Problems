public class Maximumnesteddepth {
    int c=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            c+=1;
            max=Math.max(max,c);
        }else if(s.charAt(i)==')'){
            c-=1;
            max=Math.max(max,c);
        }
    }
    return max;
    
}
