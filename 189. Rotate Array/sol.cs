public class Solution {
    public void Rotate(int[] nums, int k) {
        // Reverse the Array, then Reverse first k elements and reverse n-k elements
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        k = k % nums.Length;
        Reverse(nums, 0, nums.Length - 1);
        Reverse(nums, 0, k - 1);
        Reverse(nums, k, nums.Length - 1);
        

        // Using another array to store rotated array by calculating new positions
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }  
        *
    }

    public void Reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}