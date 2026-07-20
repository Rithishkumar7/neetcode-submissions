class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> temp=new ArrayList<>();
        helper(s,0,temp);
        return res;


        
    }
    private void helper(String s,int ind,List<String> temp){
        if(ind==s.length())
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<s.length();i++){
            if(valid(s,ind,i)){
                temp.add(s.substring(ind,i+1));

            
            helper(s,i+1,temp);
            temp.remove(temp.size()-1);
            }

        }
    }
    private  boolean valid(String s,int l,int r){
        while(l<=r){
            
            if(s.charAt(l++)!=s.charAt(r--))
            return false;

        }
        return true;
    }
}
