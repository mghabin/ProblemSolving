public class Solution {
    public int MajorityElement(int[] nums) {
        // Using Boyer–Moore majority vote algorithm
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int candidate = 0, count = 0;
        for(int i = 0 ; i < nums.Length ; i++)
        {
            if(count == 0)
            {
                candidate = nums[i];
                count = 1;
            }
            else
            {
                if(nums[i] == candidate)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }

        count = 0;
        for(int i = 0 ; i < nums.Length ; i++)
        {
            if(candidate == nums[i])
            {
                count++;
            }
        }

        if(count > (nums.Length / 2))
        {
            return candidate;
        }

        return -1;

        
        // Using HashMap/Dictionary
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        int n = nums.Length;
        var dict = new Dictionary<int, int>();

        int maxOccuranceCount = 0, maxItemKey = nums[0];
        for(int i = 0 ; i < n ; i++)
        {
            if(dict.TryGetValue(nums[i], out int value))
            {
                dict.Remove(nums[i]);
                dict.Add(nums[i], value+1);
                if(value+1 > maxOccuranceCount)
                {
                    maxItemKey = nums[i];
                    maxOccuranceCount = value+1;
                }
            }
            else
            {
                dict.Add(nums[i], 1);
            }
        }

        return maxItemKey;
        */
    }
}