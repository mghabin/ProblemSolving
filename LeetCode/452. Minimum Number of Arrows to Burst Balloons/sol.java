class Solution {
    public int findMinArrowShots(int[][] points) {
        // Sort the array of balloons by their ending position. and then
        // we can shoot as much possible by checking the end of each ballon.
        // Time Complexity: O(nlogn).
        // Space Complexity: O(1).
        
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int arrowCount = 0, arrowPosition = 0;
        for (int i = 0; i < points.length; i++) {
            if (arrowCount == 0 || points[i][0] > arrowPosition) {
                arrowCount ++;
                arrowPosition = points[i][1];
            }
        }
        return arrowCount;
    }
}