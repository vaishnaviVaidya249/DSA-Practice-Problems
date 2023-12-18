// public class ReverseArrayusingRecursion {
//     void print(int l,int r,int[] a){
//         if(l>=r){
//             return;
//         }
//         int temp=a[l];
//         a[l]=a[r];
//         a[r]=temp;
//         print(l+1,r-1,a);

//     }
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//         ReverseArrayusingRecursion r=new ReverseArrayusingRecursion();
//         r.print(0,a.length-1,a);
//         System.out.println("Reversed array");
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
        
        
//     }
    
// }


public class ReverseArrayusingRecursion {
    void print(int i,int[] a,int n){
        if(i>=n/2){
            return;
        }
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
        print(i+1,a,n);

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        ReverseArrayusingRecursion r=new ReverseArrayusingRecursion();
        r.print(0,a,a.length);
        System.out.println("Reversed array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        
    }
    
}

