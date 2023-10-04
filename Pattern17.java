class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
          
          // for printing the spaces.
          for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
          }
          
          // for printing the characters.
          char ch = 'A';
          int breakpoint = (2*i+1)/2;
          for(int j=1;j<=2*i+1;j++){
              
              System.out.print(ch);
              if(j <= breakpoint) ch++;
              else ch--;
          }
          
          // for printing the spaces again.
        //   for(int j=0;j<n-i-1;j++){
        //       System.out.print(" ");
        //   }
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
        }
          

        
        
    }
}