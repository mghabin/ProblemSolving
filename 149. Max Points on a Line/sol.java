class Solution {
    public int maxPoints(int[][] points) {
        // Iterative & HashMap approach.
        // Time Complexity: O(n^2).
        // Space Complexity: O(n).
        int n = points.length;
        if(n < 3)
            return n;
        int ans = 2;
        
        for(int[] a : points){
            Map<Double, Integer> map = new HashMap<>();
            for(int[] b : points){
                if(a == b)
                    continue;
                double slope = 0;
                if(b[0] - a[0] == 0) 
                    slope = Double.POSITIVE_INFINITY;
                else 
                    slope = (b[1] - a[1]) / (double)(b[0] - a[0]);
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                ans = Math.max(ans, map.get(slope));
            }
        }

        return ans;
    }
}