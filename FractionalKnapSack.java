import java.util.*;
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
        double r1=(double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;
        
        
    }
    
}
public class FractionalKnapSack {
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new itemComparator());
        
        int currentWeight=0;
        double finalValue=0.0;
        
        for(int i=0;i<n;i++){
            if(currentWeight+arr[i].weight<=W){
                currentWeight+=arr[i].weight;
                finalValue+=arr[i].value;
                
            }else{
                int remain=W-currentWeight;
                finalValue+=((double)arr[i].value/(double)arr[i].weight)*(double)remain;
                break;
            }
        }
        return finalValue;
    }
    
}
