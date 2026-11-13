class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int ml=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            target-=nums[right];
             while(target+nums[left]<=0){
                target+=nums[left];
                left++;
               
            }
            if(target<=0) ml=Math.min(ml,right-left+1);
           
        }   

        return ml==Integer.MAX_VALUE? 0 : ml;
    }
}