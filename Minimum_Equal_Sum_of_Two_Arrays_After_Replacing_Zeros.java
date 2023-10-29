class Solution {
    public long minSum(List<Integer> A, List<Integer> B) {
        long asum = 0, bsum = 0, a0 = 0, b0 = 0;
        for (int a : A) {
            a0 += a == 0 ? 1 : 0;
            asum += Math.max(a, 1);
        }
        for (int b : B) {
            b0 += b == 0 ? 1 : 0;
            bsum += Math.max(b, 1);
        }
        if (asum < bsum && a0 == 0)
            return -1;
        if (asum > bsum && b0 == 0)
            return -1;
        return Math.max(asum, bsum);
    }
}
