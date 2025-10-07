/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Binary Search appoach
        // Time Complexity: O(logn).
        // Space Complexity: O(1).
        int left = 1, right = n;
        int answer = -1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(!isBadVersion(mid)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
                answer = mid;
            }
        }
        
        return answer;
    }
}