class Solution {
public:
    int findKOr(vector<int>& nums, int k) {
        int n=nums.size();
        int ans=0;
        for(int j=0;j<=31;j++)
        {
                        int u=0;
        for(int i=0;i<n;i++)
        {
            if(((1<<j)&nums[i])!=0)
            {
               u++;
            }
            
        }
            if(u>=k)
            {
                ans+=1<<j;
            }
        }
       
        return ans;
        
    }
};
