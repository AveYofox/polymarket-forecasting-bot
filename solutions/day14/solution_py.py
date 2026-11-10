class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        heapify(pq:=[-x for x in nums])
        score=0
        for i in range(k):
            x=-heappop(pq)
            score+=x
            if x==1:
                score+=k-1-i
                break
            heappush(pq, -((x+2)//3))
        return score
