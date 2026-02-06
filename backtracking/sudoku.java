public class sudoku {
    public static boolean issafe(int sudo[][],int row,int col,int digit){
        //row
        for(int i=0;i<9;i++){
        if(sudo[i][col]==digit){
            return false;
        }}
        //col
        for(int i=0;i<9;i++){
        if(sudo[row][i]==digit){
            return false;
        }}
        //grid
        int sc=(col/3)*3;
        int sr=(row/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudo[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudosolver(int sudo[][],int row ,int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion 
        int nextcol=col+1;
        int nextrow=row;

        if(nextcol==9){
            nextrow+=1;
            nextcol=0;
        }
        if(sudo[row][col]!=0){
            return sudosolver(sudo, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudo, row,col, digit)){
                sudo[row][col]=digit;
                if(sudosolver(sudo, nextrow, nextcol)){
                return true;}
                sudo[row][col]=0;
            }
        }
        return false;
    }
    public static void printsudo(int sudo[][]){
        if(sudosolver(sudo, 0, 0)){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print( sudo[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int sudo[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
        printsudo(sudo);

    }
}
