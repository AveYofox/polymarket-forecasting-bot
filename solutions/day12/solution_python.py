from typing import List

class Solution:
    def minGroups(self, intervals: List[List[int]]) -> int:
        # Use seperate start and end time lists to keep track of the intervals
        start_times = sorted(interval[0] for interval in intervals)
        end_times = sorted(interval[1] for interval in intervals)
        
        # Use pointers to keep track of the current interval being processed
        start_pointer, end_pointer = 0, 0
        current_groups = 0
        max_groups = 0
        
        # Process the intervals by comparing start and end times
        while start_pointer < len(intervals):
            if start_times[start_pointer] <= end_times[end_pointer]:
                # When a new interval starts, increment the group count
                current_groups += 1
                start_pointer += 1
            else:
                # AWhen an interval ends, decrement the group count
                current_groups -= 1
                end_pointer += 1
            
            # Keep track of the maximum number of overlapping intervals
            max_groups = max(max_groups, current_groups)
        
        return max_groups



