
class fibonacci {
    static int[] fibSeries(int n) {
        int[] dp = new int[n + 1];
        if (n >= 0)
            dp[0] = 0;
        if (n >= 1)
            dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp;
    }
    
    public static void main(String[] args) {
        int n = 10;
        int[] fib = fibSeries(n);
        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}