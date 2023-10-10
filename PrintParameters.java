class PrintParameters {
    public static void func(int i,int n){
           if(i==n) return;
           System.out.print(i+" ");
           func(i+1,n);
       }
    public static void main(String[] args) {
       
       func(0,8);
    }
}