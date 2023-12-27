public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length()){
            String r=s+s;
            if(r.contains(goal)){
                return true;
            }
            

        }
        return false;
        
        
    }
    
}
