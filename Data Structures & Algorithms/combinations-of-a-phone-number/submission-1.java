class Solution {
    final String map[];
    public Solution(){
        map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)
        return res;
        helper(digits,"",0,res);
        return res;
        


        
    }
    void helper(String digits,String curr,int index,List<String> temp){
        if(index==digits.length()){
        temp.add(curr);
        return;}
        String s=map[digits.charAt(index)-'0'];
        for(int i=0;i<s.length();i++){
            helper(digits,curr+s.charAt(i),index+1,temp);
            
        }

    }

}
