class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->Integer.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1]));
        for(int p[]:points){
            pq.offer(p);
            if(pq.size()>k){
                pq.poll();

            }
            
        }
        int i=0;
        int [][]res=new int[k][2];
        while(!pq.isEmpty()){
            res[i++]=pq.poll();
            
        }
        return res;

    }
}
