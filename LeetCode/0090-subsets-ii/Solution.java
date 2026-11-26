class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,new ArrayList<>(),res,nums);
        return res;  
    }
    void backtrack(int index,List<Integer> subarray,List<List<Integer>> res,int[] nums){
        res.add(new ArrayList<>(subarray));

        for(int i=index;i<nums.length;i++){
         if (i > index && nums[i] == nums[i - 1]) continue;
          subarray.add(nums[i]);
          backtrack(i+1,subarray,res,nums);
          subarray.remove(subarray.size()-1);
        }
    }
}