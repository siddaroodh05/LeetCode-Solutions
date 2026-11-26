class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),ans,0);
        return ans;

        
    }
    void backtrack(int[] nums,List<Integer> curr,List<List<Integer>> ans,int idx){
        ans.add(new ArrayList<>(curr));
        
        if(idx==nums.length)return;


        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,curr,ans,i+1);
            curr.remove(curr.size()-1);
        }
    }
}