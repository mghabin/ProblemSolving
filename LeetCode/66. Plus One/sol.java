class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length-1;
        int i;
        boolean isDone = false;
        for(i = length ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                isDone = true;
                break;
            }
            else{
                digits[i] = 0;
            }
        }
        
        if(isDone){
            return digits;
        }
        
        int[] newDigits = new int[length + 2];
        
        newDigits[0] = 1;
        
        for(i = 1 ; i < newDigits.length ; i++){
            newDigits[i] = 0;
        }
        
        return newDigits;
        
    }
}