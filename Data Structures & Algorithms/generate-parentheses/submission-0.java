class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        helper(0,0,n,s,res);
return res;
        
    }
    private void helper( int open,int closed,int n,StringBuilder s,List<String> res){
        if(open==closed &&open==n){
            res.add(s.toString());
            return ;
        }
        if(open<n){
            s.append('(');
            helper(open+1,closed,n,s,res);
            s.deleteCharAt(s.length()-1);
        
        }
        if(closed<open){
            s.append(')');
            helper(open,closed+1,n,s,res);
            s.deleteCharAt(s.length()-1);
                    }

    }
}
