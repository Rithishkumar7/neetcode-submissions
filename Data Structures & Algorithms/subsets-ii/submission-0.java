class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,temp,res);
        return res;

        
    }
    private void helper(int ind,int[]nums,List<Integer>temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
       for(int i=ind;i<nums.length;i++){
        if(i>ind&&nums[i]==nums[i-1])
        continue;
        temp.add(nums[i]);
        helper(i+1,nums,temp,res);
temp.remove(temp.size()-1);
       } 
        
    }
}
