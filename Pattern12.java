
class Solution {

    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            // To print the first set of numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // To print the spaces
            for (int j = 1; j <=((n*2)-(2*i))*2; j++) {
                System.out.print(" ");
            }
            // To print the second set of numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line for the next row
            System.out.println();
        }


    
       
    
       
    }
}

