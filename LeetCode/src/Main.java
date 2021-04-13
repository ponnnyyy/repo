public class Main {
    public static   void main(String[] args) {
           int a[]=new int[6];
           a[0]=7;
           a[1]=1;
           a[2]=5;
           a[3]=3;
           a[4]=6;
           a[5]=4;
           int r=maxProfit(a);
            System.out.println(r);

    }
    public static int maxProfit(int[] prices) {
     if(prices.length==1){
            return  0;
        }
        int res=0;
        int   dp[]=new int[prices.length];
        dp[0]=0;
        int min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            min=Math.min(min,prices[i]);
            res=Math.max(res,dp[i]);
        }
        return  res;
    }
}
