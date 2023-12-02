public class Sumtwo {
    public static String read(int n, int []book, int target){
        // Write your code here.
        int s=0;
        for(int i=0;i<book.length;i++){
            if(book[i]==target){
                return "NO";
            }else if(book[i]<target){
                s+=book[i];
                if(s==target){
                    break;
                }

            }

           

        }
        return "YES";
        
    }
    
}
