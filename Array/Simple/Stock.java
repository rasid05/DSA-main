class Stock{
    public static int maxProfit(int[] p) {

        // Solution 1 - Space O(N)
        // int[] aux = new int[p.length];
        // aux[p.length - 1] = p[p.length - 1];
        // for (int i = p.length - 2; i >= 0; i--) {
        //     if (p[i]>aux[i+1]){
        //         aux[i]=p[i];
        //     }else {
        //         aux[i]=aux[i+1];
        //     }
        // }
        // int ans = 0;
        // for (int i=0;i<p.length;i++){
        //     if (aux[i]-p[i]>ans){
        //         ans=aux[i]-p[i];
        //     }
        // }
        // return ans;

// Solution 2 - Time/Space  O(N)/O(1)
        int minTillNow = p[0];
        int maxProfit = 0;
        for (int i = 1; i < p.length; i++) {
            minTillNow = Math.min(p[i], minTillNow);
            maxProfit = Math.max(maxProfit, p[i] - minTillNow);
        }
        return maxProfit;
    }
    public static void main(String[] args) {

    }
}


