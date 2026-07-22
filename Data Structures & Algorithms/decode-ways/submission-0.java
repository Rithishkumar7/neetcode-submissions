class Solution {
    public int numDecodings(String s) {
    if(s==null||s.length()==0)
    return 0;
    int prev=1;
    int n=s.length();
    int curr=s.charAt(0)!='0'?1:0;
    for(int i=2;i<=n;i++){
        int temp=0;
        if(s.charAt(i-1)!='0')
        temp+=curr;
        int twodigit=Integer.parseInt(s.substring (i-2,i));
        if(twodigit>=10 && twodigit<=26)
        temp+=prev;
        prev=curr;
        curr=temp;



    }
return curr;

        
    }
}
