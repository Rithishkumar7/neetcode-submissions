class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return res;
    }
    void helper(int []nums,int ind,List<Integer>temp){
        if(temp.size()==nums.length){
        res.add(new ArrayList<>(temp));
        return;
        }
        for(int i=0;i<nums.length;i++){
if(temp.contains(nums[i]))      
      continue;
            temp.add(nums[i]);
            helper(nums,i,temp);
            temp.remove(temp.size()-1);

        }
    }
}

