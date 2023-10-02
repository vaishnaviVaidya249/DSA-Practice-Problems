public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area=0;
    switch(ch){
        case 1:
            area=a[0]*a[0]*Math.PI;
            break;

        case 2:
            area=a[0]*a[1];
            break;
        default:
            area=0;
            break;

        
    }
    return area;

    }
}