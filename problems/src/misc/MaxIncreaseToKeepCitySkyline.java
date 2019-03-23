package misc;

public class MaxIncreaseToKeepCitySkyline {
    /*
    Created by danicanacionales on 20/03/2019

    807. Max Increase to Keep City Skyline

    What is the maximum total sum that the height of the buildings can be increased?

    Example 1:
        Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
        Output: 35
    */

    public static void main(String[] args) {
        MaxIncreaseToKeepCitySkyline maxIncrease = new MaxIncreaseToKeepCitySkyline();
        int [][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int sum = maxIncrease.maxIncreaseKeepingSkyline(grid);
        System.out.println(sum);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int length = grid.length;

        int [] top = getMaxInColumns(grid);
        int [] left = getMaxInRows(grid);

        int sum = 0;
        for(int row = 0; row < length; row++){
            for(int column = 0; column < length; column++){
                if(left[row] <= top[column]){
                    sum += left[row] - grid[row][column];
                }else{
                    sum += top[column] - grid[row][column];
                }
            }
        }

        return sum;
    }

    public int[] getMaxInColumns(int [][] grid){
        int length = grid.length;
        int [] top = new int[length];
        for(int column = 0; column < length; column++){
            int highest = grid[0][column];
            for(int row = 1; row < length; row++){
                int currentValue = grid[row][column];
                if(currentValue > highest)
                    highest = currentValue;
            }
            top[column] = highest;
        }
        return top;
    }

    public int[] getMaxInRows(int [][] grid){
        int length = grid.length;
        int [] left = new int[length];
        for(int row = 0; row < length; row++){
            int highest = grid[row][0];
            for(int column = 1; column < length; column++){
                int currentValue = grid[row][column];
                if(currentValue > highest)
                    highest = currentValue;
            }

            left[row] = highest;
        }
        return left;
    }
}
