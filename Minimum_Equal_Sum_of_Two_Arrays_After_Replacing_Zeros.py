class Solution:
    def minSum(self, A, B):
        asum = 0
        bsum = 0
        a0 = 0
        b0 = 0
        for a in A:
            a0 += a == 0
            asum += max(a, 1)
        for b in B:
            b0 += b == 0
            bsum += max(b, 1)
        if asum < bsum and a0 == 0:
            return -1
        if asum > bsum and b0 == 0:
            return -1
        return max(asum, bsum)
