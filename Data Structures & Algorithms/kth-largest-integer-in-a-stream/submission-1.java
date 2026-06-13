class KthLargest {
    private PriorityQueue<Integer> minheap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minheap=new PriorityQueue<>();
        for(int i:nums){

              minheap.offer(i);
        if(minheap.size()>k)
        minheap.poll();
        }
    
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size()>k)
        minheap.poll();
        return minheap.peek();
        
    }
}
