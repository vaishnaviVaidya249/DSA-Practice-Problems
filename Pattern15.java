
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<n-i;j++){
                System.out.print(c);
                c++;
            }
            System.out.print("\n");
        }
    }
}
