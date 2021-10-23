package Grid_Ways;

/*This class is the implementation class.
The maximum number of ways to get to the final 2d array place can be calculated by the sum of each row - 1 element and the column -1 element. */

public class Grid_ways {
    public int grid_ways(int row, int column){
        int[][] grid = new int[row][column]; //Initialization of the new 2d array for calculating the number of ways to get to the final place.
        
        for(int i=0; i<row; i++){ //First, we store one into all the first row.
            grid[i][0]=1;
        }
        for(int j=0; j<column; j++){ //Likewise, we stord one into all the first column.
            grid[0][j]=1;
        }

        for(int i=1; i<row; i++){ //After storing one, then the elements (row - 1) + (column - 1) should be added in order to get the maximum number of ways to the final place.
            for(int j=1; j<column; j++){
                grid[i][j] = grid[i-1][j] +grid[i][j-1];
            }
        }
        return grid[row-1][column-1]; //Return the 2d row and column final place.
    }
}

