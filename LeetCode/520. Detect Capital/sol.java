class Solution {
    public boolean detectCapitalUse(String word) {
        //Let's look at the first 2 character, if we have first 2 character there are 4 ways of writing it :- UU, UL, LU, LL
        // So, if we have UU like :- AB____ then remaing one has to be uppercase
        // If we have UL like :- Ab_____ then remaining one has to be lowercase
        // If we have LU like :- aB then straight away we know that it's invalid
        // If we have LL like :- ab_____ then remaining one has to be lowercase
        
        // Iterative approach.
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        if(word.length() < 2) return true;

        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))) return false;
            }
        }
        else{
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
}