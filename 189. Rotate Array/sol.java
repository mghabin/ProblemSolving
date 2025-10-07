class Solution {
    public void rotate(int[] nums, int k) {
        int i, length = nums.length;
        k %= length;
        int[] temp = new int [length - k];
        
        for(i = 0 ; i < temp.length ; i++){
            temp[i] = nums[i];
            System.out.print(temp[i]);
        }
        
        for(i = 0 ; i <  k ; i++){
            nums[i] = nums[length - k + i];
            System.out.print(nums[i]);
        }
        
        for(i = k ; i < length ; i++){
            nums[i] = temp[i-k];
            System.out.print(nums[i]);
        }
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        rotateRight(nums, k, nums.length);
    }
    
    public void rotateRight(int arr[], int d, int n){
        // To use as left rotation
        d %= n;
        d = n - d;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
 
        for (i = 0; i < g_c_d; i++) {
 
            // Moving i-th values of blocks
            temp = arr[i];
            j = i;
 
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    
    public int gcd(int a, int b)
    {
 
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}