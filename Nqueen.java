import java.util.*;
class Nqueen{
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int c=0;c<board.length;c++){
            if(board[row][c]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
       int  r=row;
        for(int c=col;c>=0 && r>=0 ;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
        r=row;
        for(int c=col;c<board.length && r>=0; c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }

        }


        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length; c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }

        }

        //lower right
        r=row;
        for(int c=col;c<board.length && r<board.length; c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }

        }
        return true;

    }

    public void saveBoard(List<List<String>> allBoards, char[][] board){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
                
            }
            newBoard.add(row);
            
            
            
        }
        allBoards.add(newBoard);
       


    }

    public void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(allBoards,board);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        List<List<String>> allBoards=new ArrayList<>();
        Nqueen s=new Nqueen();
        s.helper(board,allBoards,0);
        System.out.println(allBoards);

    }
}