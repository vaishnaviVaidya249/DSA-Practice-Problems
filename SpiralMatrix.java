import java.util.*;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
    
            int rowBegin=0;
            int rowEnd=matrix.length-1;
    
            int colBegin=0;
            int colEnd=matrix[0].length-1;
    
            ArrayList<Integer> a=new ArrayList<>();
    
            while(rowBegin<=rowEnd && colBegin<=colEnd){
    
                for(int j=colBegin;j<=colEnd;j++){
                    a.add(matrix[rowBegin][j]);
                }
                rowBegin++;
    
                for(int j=rowBegin;j<=rowEnd;j++){
                    a.add(matrix[j][colEnd]);
                }
                colEnd--;
    
                if(rowBegin<=rowEnd){
                    for(int j=colEnd;j>=colBegin;j--){
                        a.add(matrix[rowEnd][j]);
                    }
                    
    
                }
                rowEnd--;
                
    
                if(colBegin<=colEnd){
                    for(int j=rowEnd;j>=rowBegin;j--){
                        a.add(matrix[j][colBegin]);
                    }
                    
    
                }
                colBegin++;
    
                
    
            }
    
            return a;
            
        }
        
    }
    
}
