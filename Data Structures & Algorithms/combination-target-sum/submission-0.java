class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        helper(new ArrayList<>(),0,nums,target);
        return res;
        
    }
    private void helper(List<Integer> temp,int ind,int []nums,int target){
        if(target<0)
        return ;
        if(target==0)
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            temp.add(nums[i]);
            helper(temp,i,nums,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}
