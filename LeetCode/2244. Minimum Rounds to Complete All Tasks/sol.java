class Solution {
    public int minimumRounds(int[] tasks) {
        // Using HashMap.
        // Time Complexity: O(n) where n is the number of tasks.
        // Space Complexity: O(n).
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < tasks.length ; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        
        int count = 0;
        for(int value : map.values()){
            if(value == 1)
                return -1;
            
            count += value / 3;

            if(value % 3 != 0)
                count++;
        }

        return count;
        */

        // Use Dual-Pivot Quicksort.
        // Time Complexity: O(nlogn) where n is the number of tasks.
        // Space Complexity: O(1).
        
        Arrays.sort(tasks);
        int count = 0, result = 0;;
        for(int i = 0 ; i < tasks.length ; i++){
            count++;
            if(i == tasks.length - 1 || tasks[i] != tasks[i+1]){
                if(count == 1)
                    return -1;
                
                result += count / 3;

                if(count % 3 != 0)
                    result++;
                
                count = 0;
            }
        }

        return result;
    }
}