public class FibanacciusingRecursion {

    int fibanacci(int n){
        if(n<=1){
            return n;
        }
        return fibanacci(n-1)+fibanacci(n-2);
    }
    public static void main(String[] args) {
        FibanacciusingRecursion r=new FibanacciusingRecursion();
        int v=r.fibanacci(4);
        System.out.println(v);

        
    }
    
}
