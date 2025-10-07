class RandomizedSet {
    Set<Integer> hash;

    public RandomizedSet() {
        this.hash = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if(hash.contains(val)){
            return false;
        }
        
        hash.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hash.contains(val)){
            return false;
        }

        hash.remove(val);
        return true;
    }
    
    public int getRandom() {
        
        Random random = new Random();
  
        // Generate a random number using nextInt
        // method of the Random class.
        int randomNumber = random.nextInt(this.hash.size());
  
        Iterator<Integer> iterator = this.hash.iterator();
  
        int currentIndex = 0;
        Integer randomElement = null;
  
        // iterate the HashSet
        while (iterator.hasNext()) {
  
            randomElement = iterator.next();
  
            // if current index is equal to random number
            if (currentIndex == randomNumber)
                return randomElement;
  
            // increase the current index
            currentIndex++;
        }
  
        return randomElement;

        /*
        // Another approach using Array
        Integer[] arrayNumbers = this.hash.toArray(new Integer[this.hash.size()]);
        Random random = new Random();
  
        // this will generate a random number between 0 and HashSet.size - 1
        int randomNumber = random.nextInt(this.hash.size());

        return arrayNumbers[randomNumber];
        */
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */