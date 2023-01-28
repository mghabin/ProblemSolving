class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Brute force approach.
        // Time Complexity: O(n^2).
        // Space Complexity: O(1).
        /*
        int n = gas.length;
        for(int i = 0 ; i < n ; i++){
            int totalFuel = 0, stopCount = 0;
            int j = i;
            while(stopCount < n){
                totalFuel += gas[j % n] - cost[j % n];
                if(totalFuel < 0) break;
                stopCount++;
                j++;
            }
            if(stopCount == n && totalFuel >= 0) 
                return i;
        }

        return -1;
        */

        // Iterative Approach.
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        int n = gas.length;
        int surplus = 0, totalSurplus = 0, start = 0;
        for(int i = 0 ; i < n ; i++){
            totalSurplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i+1;
            }
        }

        return (totalSurplus < 0) ? -1 : start;
    }
}