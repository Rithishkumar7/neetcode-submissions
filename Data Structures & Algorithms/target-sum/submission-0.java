class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         return helper(nums,0,0,target);

        
    }
    public int  helper(int nums[],int total,int ind,int target){
       if(ind==nums.length)
            return total==target? 1:0;
            

        
        return helper(nums,total-nums[ind],ind+1,target)+helper(nums,total+nums[ind],ind+1,target);
    }

}
