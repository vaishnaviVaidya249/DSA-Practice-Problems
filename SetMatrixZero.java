public class SetMatrixZero {
    int[] col=new int[m];
    int[] row=new int[n];//tc:o(2*(n*m)) sc:o(n)+o(m)

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix.get(i).get(j)==0){
                col[j]=-1;
                row[i]=-1;
            }
        }
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(col[j]==-1 || row[i]==-1){
                matrix.get(i).set(j,0);
            }
        }
    }
    return matrix;
    
}
