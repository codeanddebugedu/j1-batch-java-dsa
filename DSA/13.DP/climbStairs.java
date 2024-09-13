
class ClimbStair {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        if(n==0 || n==1 || n==2)
            return n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        int i;
        for(i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}