

public class Printntimes {
   
    public static void printNtimes(int n){
        // Write your code here.
        if(n==0){
            return;
        }
        System.out.print("Coding Ninjas"+" ");
        printNtimes(n-1);
        
    
    }
}
