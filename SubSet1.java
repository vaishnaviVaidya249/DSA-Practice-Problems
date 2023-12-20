import java.util.*;
public class SubSet1 {

    void calculateSum(int index,int[] arr,int sum,ArrayList<Integer> list ){
        if(index==arr.length){
            list.add(sum);
            return;
        }
        calculateSum(index+1,arr,sum+arr[index],list);
        calculateSum(index+1,arr,sum,list);


    }
    public static void main(String[] args) {
        SubSet1 s=new SubSet1();
        int[] arr={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();
        s.calculateSum(0,arr,0,list);
        Collections.sort(list);
        System.out.println(list);
        

        
    }
    
}
