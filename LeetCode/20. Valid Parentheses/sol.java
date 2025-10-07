class Solution {
    public boolean isValid(String s) {
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < length ; i++){
            char c = s.charAt(i);
            if(c =='(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || c != stack.pop())
                return false;
        }
        
        return stack.isEmpty();
    }
}