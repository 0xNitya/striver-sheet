class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minp=Integer.MAX_VALUE;
        int maxp=0;

        for(int price:prices)
        {
            if(price<minp){minp=price;}
            int profit=price-minp;
            maxp=Math.max(profit,maxp);
        }
        return maxp;
        
    }
}