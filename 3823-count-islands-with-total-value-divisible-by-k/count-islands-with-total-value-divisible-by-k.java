class Solution {
    public int countIslands(int[][] grid, int k) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    long sum = clear(grid, i, j);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    long clear(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        long value = grid[r][c];
        grid[r][c] = 0;

        value += clear(grid, r - 1, c);
        value += clear(grid, r + 1, c);
        value += clear(grid, r, c - 1);
        value += clear(grid, r, c + 1);

        return value;
    }
}