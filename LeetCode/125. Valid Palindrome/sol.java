class Solution {
    public boolean isPalindrome(String s) {
        // filter string
        char[] arr = new char[s.length()];
        int j = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr[j] = Character.toLowerCase(s.charAt(i));
                j++;
            }
        }
        int right = j-1;
        for(int left = 0 ; left <= right ; left++, right--){
            if(arr[left] != arr[right]){
                return false;
            }
                
        }
        
        return true;
    }
}