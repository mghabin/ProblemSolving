class Solution {
    public List<Integer> getRow(int rowIndex) {
        /*
                        1
                       1 1
                      1 2 1
                     1 3 3 1
                    1 4 6 4 1
                  1 5 10 10 5 1
                 1 6 15 20 15 6 1
        
        */
        
        // Using formula: 
        // nCr = n*(n-1)*(n-2)...(r terms) / 1*2*..........*(r-2)*(r-1)*r
        // n is the row, r is column.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long temp = 1;
        
        for(int down = 1, up = rowIndex ; down <= rowIndex ; up--, down++){
            temp = temp * up / down;
            list.add((int)temp);
        }
        
        return list;
        
        
    }
}