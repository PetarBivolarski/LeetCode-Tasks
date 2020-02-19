package com.company;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int countIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '1') {
                    continue;
                }
                move(grid, i, j);
                countIslands++;
            }
        }
        return countIslands;
    }

    private static boolean gridIsOutOfEdge(char[][] grid, int row, int col) {
        return row < 0 || col < 0 || row >= grid.length || col >= grid[row].length;
    }

    private static void move(char[][] grid, int row, int col) {
        if (gridIsOutOfEdge(grid, row, col)) {
            return;
        }
        if (grid[row][col] != '1') {
            return;
        }
        grid[row][col] = 'v';
        move(grid, row + 1, col);
        move(grid, row - 1, col);
        move(grid, row, col + 1);
        move(grid, row, col - 1);
    }

}