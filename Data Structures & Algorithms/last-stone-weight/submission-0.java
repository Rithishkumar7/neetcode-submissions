class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int s:stones)
    pq.offer(-s);
    while(pq.size()>1){
        int a=pq.poll();
        int b=pq.poll();
        int diff=a-b;
        if(b>a){
            pq.offer(diff);
        }
    }
    pq.offer(0);
        return Math.abs(pq.peek());
            }
}
