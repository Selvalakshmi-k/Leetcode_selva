import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        int[][] ans = new int[rows * cols][2];
        int index = 0;

        // Store every cell
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                ans[index][0] = r;
                ans[index][1] = c;
                index++;
            }
        }

        // Sort based on Manhattan distance
        Arrays.sort(ans, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);

            return distA - distB;
        });

        return ans;
    }
}