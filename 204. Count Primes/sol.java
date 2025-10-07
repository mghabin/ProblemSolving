public class Solution {
    
    // Sieve of Eratosthenes algorithm.
    // Time Complexity: O(n log( log(n) )).
    // Space Complexity: O(n).
    /*
    public int countPrimes(int n) {
        if(n < 3) return 0;
        
        boolean[] prime = new boolean[n];
        //initialising notPrime with a value 1(counting "1" as not prime)
        int notPrime = 1;
        
        for(int i = 2 ; i * i < n ; i++){
            if(prime[i] == false){
                for(int j = i ; j * i < n ; j++){
                    if(prime[j*i] == false){
                        notPrime++;
                        prime[j*i] = true;
                    }
                }
            }
        }
        return n - notPrime - 1;
    }
    */
    

    
    // Opposite of Sieve of Eratosthenes algorithm,
    // Time Complexity: O(nlog (log n/2) /2)
    // Space Complexixty: O(n).
    
    /**
     * Count the number of prime numbers less than a non-negative number, n
     * @param n a non-negative integer
     * @return the number of primes less than n
     */
    public int countPrimes(int n) {
        
        /**
         * if n = 2, the prime 2 is not less than n,
         * so there are no primes less than n
         */
        if (n < 3) return 0;
        
        /** 
         * Start with the assumption that half the numbers below n are
         * prime candidates, since we know that half of them are even,
         * and so _in general_ aren't prime.
         * 
         * An exception to this is 2, which is the only even prime.
         * But also 1 is an odd which isn't prime.
         * These two exceptions (a prime even and a for-sure not-prime odd)
         * cancel each other out for n > 2, so our assumption holds.
         * 
         * We'll decrement count when we find an odd which isn't prime.
         *
         * If n = 3,  count = 1.
         * If n = 5,  count = 2.
         * If n = 10, count = 5.
         */
        int count = n / 2;
        
        /**
         * Java initializes boolean arrays to {false}.
         * In this method, we'll use truth to mark _composite_ numbers.
         */
        boolean[] s = new boolean[n];
        
        /**
         * Starting with an odd prime-candidate above 2, increment by two
         * to skip evens (which we know are not prime candidates).
         */
        for (int i = 3; i * i < n; i += 2) {
            if (s[i]) {
                // count has already been decremented for this composite odd
                continue;
            }
            
            /** 
             * For each prime i, iterate through the odd composites
             * we know we can form from i, and mark them as composite
             * if not already marked.
             * 
             * We know that i * i is composite.
             * We also know that i * i + i is composite, since they share
             * a common factor of i.
             * Thus, we also know that i * i + a*i is composite for all real a,
             * since they share a common factor of i.
             * 
             * Note, though, that i * i + i _must_ be composite for an
             * independent reason: it must be even.
             * (all i are odd, thus all i*i are odd,
             * thus all (odd + odd) are even).
             * 
             * Recall that, by initializing count to n/2, we already accounted for
             * all of the evens less than n being composite, and so marking
             * i * i + (odd)*i as composite is needless bookkeeping.
             * 
             * So, we can skip checking i * i + a*i for all odd a,
             * and just increment j by even multiples of i,
             * since all (odd + even) are odd.
             */
            for (int j = i * i; j < n; j += 2 * i) {
                if (!s[j]) {
                    count--;
                    s[j] = true;
                    }
                }
            }
        return count;
    }
}