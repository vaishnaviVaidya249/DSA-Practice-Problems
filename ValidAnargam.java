class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        char b[]=t.toCharArray();
        Arrays.sort(b);
        String a1=new String(a);
        String a2=new String(b);
        if(a1.equals(a2)){
            return true;
        }else{
            return false;
        }
        
    }
}