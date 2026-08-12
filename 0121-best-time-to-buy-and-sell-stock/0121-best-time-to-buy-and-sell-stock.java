class Solution {
    public int maxProfit(int[] prices) {


        int n = prices.length;


        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i<n; i++){

            if(prices[i] < min){

                min = prices[i];
            }

            int profit = prices[i] - min;


            ans = Math.max(ans,profit);

        }

        return ans;



        
    }
}