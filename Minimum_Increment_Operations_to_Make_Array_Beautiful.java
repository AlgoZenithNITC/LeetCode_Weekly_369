class Solution {
    int n; 
    List<Long> dp;
    
    long solve(int ind, List<Integer> nums, int k) {
        if (ind > n - 3)
            return 0;
        
        if (dp.get(ind) != -1)
            return dp.get(ind);
        
        long op1 = Math.max(0, k - nums.get(ind)) + solve(ind + 1, nums, k);
        long op2 = Math.max(0, k - nums.get(ind + 1)) + solve(ind + 2, nums, k);
        long op3 = Math.max(0, k - nums.get(ind + 2)) + solve(ind + 3, nums, k);
        
        return dp.set(ind, Math.min(op1, Math.min(op2, op3)));
    }
    
    long minIncrementOperations(List<Integer> nums, int k) {
        n = nums.size();
        dp = new ArrayList<>(Collections.nCopies(n, -1L));
        return solve(0, nums, k);
    }
}
