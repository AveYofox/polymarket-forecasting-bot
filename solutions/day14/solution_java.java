class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int num: nums) {
            pq.add(num);
        }
        int peek;
        while(k-- > 0) {
            peek = pq.poll();
            score += peek;
            pq.add((peek+2)/3);
        }
        return score;
    }
}
