public class grid {
    public static int countways(int grid[][],int i,int j){
        //base case
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        else if(i==grid.length || j==grid[0].length){
            return 0;
        }
        int ways=countways(grid, i+1, j)+countways(grid, i, j+1);
        return ways;
    }
    public static void main(String[] args) {
        int grid[][]=new int[3][4];
        int n=countways(grid, 0, 0);
        System.out.println(n);
    }
}
// formula 
// n=factorial of total no of character/factorial of repeated character
//n=(n-1+m-1)!/(n-1)!(m-1)!
