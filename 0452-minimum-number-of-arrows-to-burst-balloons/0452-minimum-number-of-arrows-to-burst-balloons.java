import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        
        int answer = 0;
        int x = 0;
        
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                return Integer.compare(point1[1], point2[1]);
            }
        });
        
        for (int[] point : points) {
            if(x == 0 || x < point[0]) {
                answer++;
                x = point[1];
            }
        }
        
        return answer;
    }
}