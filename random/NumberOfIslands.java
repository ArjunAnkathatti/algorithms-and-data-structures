public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{1,0,0,1},{1,1,0,0}, {0,0,1,1}};
        NumberOfIslands n = new NumberOfIslands();
        System.out.println("no of islands in the given grid = " + n.getNoOfIslands(grid));
    }

    public int getNoOfIslands(char[][] grid) {
        int count = 0;
        for(int i =0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    traverseIsland(i, j, grid);
                    count++;
                }
            }
        }// outer for loop 
        return count;
    }// end of getNoOfIslands

    public void traverseIsland(int i, int j, char[][] grid) {
        grid[i][j] = 'X';
        if (isValid(i-1, j, grid)) {
            traverseIsland(i-1, j, grid);
        }
        if (isValid(i+1, j, grid)) {
            traverseIsland(i+1, j, grid);
        }
        if (isValid(i, j-1, grid)) {
            traverseIsland(i, j-1, grid);
        }
        if (isValid(i, j+1, grid)) {
            traverseIsland(i, j+1, grid);
        }
    }

    public static boolean isValid(int i, int j, char[][] grid) {
        if (i<0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j] == 0) {
            return false;
        }        
        return true;
    }
}