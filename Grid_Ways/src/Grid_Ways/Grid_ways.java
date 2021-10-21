package Grid_Ways;

public class Grid_ways {
    public int grid_ways(int row, int column){
        int[][] grid = new int[row][column];

        for(int i=0; i<row; i++){
            grid[i][0]=1;
        }
        for(int j=0; j<column; j++){
            grid[0][j]=1;
        }

        for(int i=1; i<row; i++){
            for(int j=1; j<column; j++){
                grid[i][j] = grid[i-1][j] +grid[i][j-1];
            }
        }
        return grid[row-1][column-1];
    }
}

