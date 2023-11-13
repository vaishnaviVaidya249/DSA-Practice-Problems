public class Longestsubsequence {
    
        public static void main(String[] args) {
            int a[]={1,0,1,1,1,1,2,2,2,2,2};
            int s=0;
            int e=0;
            int i=0;
            int j=1;
            while(j<=a.length-1 && i<=a.length-2){
                
                    if(a[i]==a[j]){
                        s=i;
                        e=j;
                        j++;
                    }else{
                        i++;
                        j++;
                    }
                    
                
               
            }
            System.out.println((e-s)+1);
        }
    }
    

