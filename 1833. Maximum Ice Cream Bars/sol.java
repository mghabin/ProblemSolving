class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Use quick sort.
        // Time Complexity: O(nlogn).
        // Space Complexity: O(1).
        Arrays.sort(costs);
        int count = 0;
        for(int i = 0 ; i < costs.length; i++){
            if(coins < costs[i]){
                break;
            }
            coins -= costs[i];
            count++;
        }

        return count;
    }
}