public class queens {
    public static boolean issafe(char board[][],int row,int col){
        //verticle
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //right
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //left
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return  true;
    }
    public static void putqueens(char board[][],int row){
        if(row==board.length){
            printboard(board);
            return;
        }
        //column
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)==true){
            board[row][j]='Q';
            putqueens(board, row+1);
            board[row][j]='X';
        }
        }

    }
    public static void printboard(char board[][]){
        System.out.println("....chess board.....");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char board[][]=new char[4][4];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }}
        putqueens(board, 0);
    }
}
