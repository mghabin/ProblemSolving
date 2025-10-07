class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0, index = 0;

        while(i < haystack.length()){
	        if(haystack.charAt(i) == needle.charAt(j)){
		        if(j == needle.length()-1){
			        return index;
		        }
		        i++;
		        j++;
	        }
            else{
		        i = ++index;
		        j = 0;
	        }
        }

        return -1;
        
    }
}