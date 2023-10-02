import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
       if(type.equals("Integer")||type.equals("Float")){
           return 4;
       }

       if(type.equals("Long")||type.equals("Double")){
           return 8;
       }

       if(type.equals("Character")){
           return 1;
       }
       return -1;
        
        
    }
}