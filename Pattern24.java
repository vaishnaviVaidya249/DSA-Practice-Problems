public class Pattern24 {
    public static void main(String[] args){



        // for(int i=0;i<=4;i++){

        //     for(int j=4;j>=i;j--){
        //         System.out.print("  ");
        //     }
        //      for(int j=1;j<=(2*i)+1;j++){
        //          System.out.print("* ");
        //      }
        //      System.out.println();
            
        // }

        int y=1;
        for(int i=0;i<5;i++){
            int z=y;
            for(int j=0;j<=i;j++){
                System.out.print(z+" ");

                if(j%2==0){
                    z=z+2*(5-i)-1;
                }else{
                    z=z+2*(i-j);
                }
            }
            y=y+1;
            System.out.println();
        }

    }
    
}
