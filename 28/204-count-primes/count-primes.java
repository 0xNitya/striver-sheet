class Solution {
    public int countPrimes(int n) {
        boolean isPrime[]=new boolean[n];
        Arrays.fill(isPrime,true);

        int c=0;
        for(int i=2;i<n;i++)
        {
            if(isPrime[i]){c++;}
            for(int j=i*2;j<n ;j+=i)
            {isPrime[j]=false;}
        }
        return c;
    }


}