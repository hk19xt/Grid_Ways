package Grid_Ways;

public class Main {
    public static void main(String[] args){
        Grid_ways gw = new Grid_ways();
        int row = 4;
        int column = 6;
        int outcome = 0;
        outcome = gw.grid_ways(row, column);
        System.out.println(outcome);
    }
}
