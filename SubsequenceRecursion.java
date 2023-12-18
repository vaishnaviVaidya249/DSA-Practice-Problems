import java.util.*;
public class SubsequenceRecursion {

    void subsequence(int i,int n,int[] a,ArrayList<Integer> list){
        if(i>=n){
            System.out.println(list);
            return;
            
        }
        list.add(a[i]);
        subsequence(i+1,n,a,list);
        list.remove(list.size()-1);
        subsequence(i+1,n,a,list);


    }
    public static void main(String[] args) {
         SubsequenceRecursion s=new  SubsequenceRecursion();
        //  Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter the array size");
        //  int n=sc.nextInt();
        //  int[] a=new int[n];
        //   System.out.println("Enter the elements into the array");
        //  for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        //  }
        int[] a={1,2,3};
        int n=a.length;
         ArrayList<Integer> list=new ArrayList<>();
         s.subsequence(0,n,a,list);
    
    }
}
