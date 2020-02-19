package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[][] ocean = {
                { '1', '1', '0', '0', '0'},
                { '1', '1', '0', '0', '0'},
                { '0', '0', '1', '0', '0'},
                { '0', '0', '0', '1', '1'}
        };
        Solution solution = new Solution();
        System.out.println(solution.numIslands(ocean));

    }
}
