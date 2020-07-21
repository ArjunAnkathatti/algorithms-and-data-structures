import java.util.ArrayDeque;

public class RadhaAmazonUpdateServers {

    public static void main(String[] args) {
        int[][] grid = {{0,1,1,0,1},{0,0,1,0,1},{0,0,0,1,0}, {1,1,0,0,0}};
        RadhaAmazonUpdateServers rm = new RadhaAmazonUpdateServers();
        int noOfDays = rm.getNoOfDays(grid);
        System.out.println("Total no of days to update all the server = " + noOfDays);
        
    }

    public int getNoOfDays(int[][] grid) {
        ArrayDeque<Loc> Q = new  ArrayDeque<Loc>();
        for(int i = 0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    Q.add(new Loc(i, j));
                }
            }
        }// end for loop

        int length = Q.size();
        int count = 0;

        System.out.println("length of the Q after 1st parsal = " + length);
        while (!Q.isEmpty()) {
            Loc curPos = Q.poll();
            length--;
            int i = curPos.i;
            int j = curPos.j;
            updateAdjacent(grid, i, j, Q);
            
            if (length == 0) {
                if(!Q.isEmpty()) count++;
                length = Q.size();
            }
        }
        return count;
    }

    public void updateAdjacent(int[][] grid, int i, int j, ArrayDeque<Loc> Q) {
        // update left, keeping i i.e row constant decrment j
        if (isValidPosition(grid, i, j-1)) {
            grid[i][j-1] = 1;
            Q.add(new Loc(i, j-1));
        }

        // update right, keepig i i.e row constant increment j
        if (isValidPosition(grid, i, j+1)) {
            grid[i][j+1] = 1;
            Q.add(new Loc(i, j+1));
        }

        // update top, keepig j i.e column constant increment i
        if (isValidPosition(grid, i+1, j)) {
            grid[i+1][j] = 1;
            Q.add(new Loc(i+1, j));
        }

        // update top, keepig j i.e column constant increment i
        if (isValidPosition(grid, i-1, j)) {
            grid[i-1][j] = 1;
            Q.add(new Loc(i-1, j));
        }
    }

    public boolean isValidPosition(int[][] grid, int i, int j) {
        if (i<0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j] == 1) {
            return false;
        }
        return true;
    }
}

class Loc {
    public int i;
    public int j;

    public Loc(int i , int j) {
        this.i = i;
        this.j = j;
    }
}