class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlength=Integer.MAX_VALUE;
        int start=0;
        int sum=0;
        for(int end=0;end<n;end++){
             sum+=nums[end];
             while(sum>=target){
                minlength=Math.min(minlength,end-start+1);
                sum-=nums[start];
                start++;
             }
        }
        return (minlength==Integer.MAX_VALUE)? 0:minlength;
    }
}