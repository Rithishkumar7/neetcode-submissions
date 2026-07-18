class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,target,candidates,temp,res);
        return res;        
    }
    private void helper(int ind,int target,int []candidates,List<Integer>temp,List<List<Integer>> res){
    if(target==0)
    res.add(new ArrayList<>(temp));
    

for(int i=ind;i<candidates.length;i++){
    if(target<0)
    return;
    if( i>ind&&candidates[i]==candidates[i-1])
    continue;
    temp.add(candidates[i]);
    helper(i+1,target-candidates[i],candidates,temp,res);
    temp.remove(temp.size()-1);
}
    }
}
