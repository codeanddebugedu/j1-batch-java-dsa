
class Fibo {
    int memo[]=new int[31];
    public int fib(int n) 
    {
        // Base cases
        if (n <= 1)
            return n;
        
        // If the value is already computed, return it
        if (memo[n] != 0) {
            return memo[n];
        }

        // Compute the Fibonacci number and store it in the array for future reference
        memo[n] = fib(n - 1) + fib(n - 2);

        return memo[n];
    }
}