class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longest=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            longest=Math.max(longest,sum);
            if(nums[right]==0)sum=0;
            
        }
        return longest;
        
    }
}