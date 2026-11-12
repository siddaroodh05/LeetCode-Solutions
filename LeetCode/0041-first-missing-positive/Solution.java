class Solution {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> set=new HashSet<>(); 
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
            set.add(num);
        }

        for(int i=1;i<=max;i++){
            if(!set.contains(i))return i;
        }

        return max+1;
    }


}