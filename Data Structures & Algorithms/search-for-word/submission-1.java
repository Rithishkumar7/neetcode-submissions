class Solution {
    boolean [][]visited;
    public boolean exist(char[][] board, String word) { 
        
        int m=board.length;
        int n=board[0].length;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(i,j,0,board,word))
                return true;
            }
        }
        return false;
    }
    private boolean dfs(int row,int col,int ind,char[][]board,String word){
        if( ind==word.length())
        return true;
        if(row<0||col<0||col>=board[0].length||row>=board.length||board[row][col]!=word.charAt(ind)||visited[row][col])
return false;
    visited[row][col]=true;
  boolean res=dfs(row+1,col,ind+1,board,word)||dfs(row,col+1,ind+1,board,word)||dfs(row-1,col,ind+1,board,word)||dfs(row,col-1,ind+1,board,word);
  
  visited[row][col]=false;
    return res;
}
}
