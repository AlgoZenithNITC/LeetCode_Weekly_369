class Solution:
    def minIncrementOperations(self, nums: List[int], k: int) -> int:
        n = len(nums)
        dp = [-1] * n
        
        def solve(ind: int, nums: List[int], k: int) -> int:
            if ind > n - 3:
                return 0
            if dp[ind] != -1:
                return dp[ind]
            
            op1 = max(0, k - nums[ind]) + solve(ind + 1, nums, k)
            op2 = max(0, k - nums[ind + 1]) + solve(ind + 2, nums, k)
            op3 = max(0, k - nums[ind + 2]) + solve(ind + 3, nums, k)
            
            dp[ind] = min(op1, min(op2, op3))
            return dp[ind]
        
        return solve(0, nums, k)
