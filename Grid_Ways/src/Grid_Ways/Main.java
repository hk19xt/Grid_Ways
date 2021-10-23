package Grid_Ways;

/*This class is the main class.
Users can change the column integer value and the row integer value in the hardcoded lines.
The maximum number of ways to get to the end of the 2D array will be calculated by the implementation class. 

Name: Hyejin Kim
Date: 10/22/2021 */

public class Main {
    public static void main(String[] args){
        Grid_ways gw = new Grid_ways();
        int row = 4; //Users can change the integer value of the row here.
        int column = 6; //Also, users can change the column value here.
        int outcome = 0; //Initialization of maximum output ways to get to the final 2d array place.
        outcome = gw.grid_ways(row, column);
        System.out.println(outcome);
    }
}
