package Chapter1_3.Ex2;

public class GridScanner {
    public static void main(String[] args){
        char[][]grid = {
                {'.', '.', '#', '.'},

                {'a', '#', 'b', '2'},

                {'.', '.', '.', '.'}
        };
        String digits = "0123456789";
        OUTERLOOP: for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '#'){
                    continue;
                }
                if (digits.indexOf(grid[i][j]) != -1){
                    System.out.printf("found digit %s at (row=%d,column=%d)%n", grid[i][j], i, j);
                    //System.out.println("found digit " + grid[i][j] + " at (row=" + i + ",column=" + j + ")");
                    break OUTERLOOP;
                }

            }
        }
    }
}

