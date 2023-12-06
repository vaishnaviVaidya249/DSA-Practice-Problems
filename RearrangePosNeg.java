import java.util.ArrayList;
import java.util.Arrays;

public class RearrangePosNeg {
    public static void main(String [] args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
        // ArrayList<Integer> ans = RearrangebySign(A, n);
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        for(int i=0;i<a.size();i++){
            if(a.get(i)>0){
                pos.add(a.get(i));
            }else{
                neg.add(a.get(i));
                
            }
        }
        
        if(pos.size()>neg.size()){
            for(int j=0;j<neg.size();j++){
                a.set(2*j,pos.get(j));
                a.set(2*j+1,neg.get(j));
                
            }
            int index=neg.size()*2;
            for(int k=neg.size();k<pos.size();k++){
                a.set(index,pos.get(k));
                index++;
            }
            
        }else{
            for(int j=0;j<pos.size();j++){
                a.set(2*j,pos.get(j));
                a.set(2*j+1,neg.get(j));
                
            }
            int index=pos.size()*2;
            for(int k=pos.size();k<neg.size();k++){
                a.set(index,neg.get(k));
                index++;
            }
            
        }
        for(int v=0;v<a.size();v++){
            System.out.println(a.get(v));//tc:o(2n) sc:o(n)
        }
        

        // int posindx=0;
        // int negindx=1;
        // int n=a.length;
        // int[] res=new int[n];

        // for(int i=0;i<n;i++){
        //    if(a[i]>0){
        //        res[posindx]=a[i];
        //        posindx=posindx+2;
        //    }else{
        //        res[negindx]=a[i];
        //        negindx=negindx+2;
        //    }
            
        // }
        // return res; tc:o(n),sc:o(n)
        
        
        
        
    }

    }
    
}
