class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Time complexity : O(S), where S is the sum of all characters in all strings.
        //Space complexity : O(1).
        if (strs == null || strs.length == 0) 
            return "";
        
        String commonPrefix = strs[0];
        int i;
        for(i = 1 ; i < strs.length ; i++){
            while(strs[i].indexOf(commonPrefix) != 0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if(commonPrefix.isEmpty())
                    return commonPrefix;
            }
        }
        return commonPrefix;
    }
}