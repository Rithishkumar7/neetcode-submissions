class Solution {
    public int jump(int[] nums) {
        int maxi=0;
        int n=nums.length;
        int currend=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            
            maxi=Math.max(maxi,i+nums[i]);
            if(i==currend){
                count++;
                 currend=maxi;
            }
           
        }
        return count;
        
    }
}
