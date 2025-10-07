class Solution {
    public List<String> fizzBuzz(int n) {
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        List<String> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if((i%3 == 0) && (i%5 == 0))
                list.add("FizzBuzz");
            else if(i%3 == 0)
                list.add("Fizz");
            else if(i%5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }
        
        return list;
        */
        
        
        // String Concatenation
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        List<String> list = new ArrayList<>();
        
        for (int i = 1 ; i <= n ; i++){
            boolean divisibleBy3 = (i%3 == 0);
            boolean divisibleBy5 = (i%5 == 0);
            
            String ansStr = "";
            if(divisibleBy3)
                ansStr += "Fizz";
            
            if(divisibleBy5)
                ansStr += "Buzz";
            
            if(ansStr == "")
                ansStr += Integer.toString(i);
            
            list.add(ansStr);
        }
        
        return list;
        */
        
        
        // Use hashing in case we have a lot of mapping.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        List<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>(){
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
            
        };
        
        // List of divisors which we will iterate over.
        List<Integer> divisors = new ArrayList<>(Arrays.asList(3, 5));

        for (int i = 1; i <= n; i++) {

            String ansStr = "";

            for (Integer key : divisors) {

                // If the num is divisible by key,
                // then add the corresponding string mapping to current ansStr
                if (i % key == 0) {
                    ansStr += map.get(key);
                }
            }

            if (ansStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                ansStr += Integer.toString(i);
            }

            // Append the current answer str to the ans list
            list.add(ansStr);
        }
        
        return list;
    }
}