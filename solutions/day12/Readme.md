# Divide Intervals into Minimum Number of Groups 🧩

## Problem Statement

In a given a list of intervals, where each interval is represented as `[start, end]`. Your task is to group these intervals so that no two intervals in the same group overlap. Return the `minimum number` of groups required.

## Function Description
**Function Name**: `minGroups(intervals)`

- Input: A list of intervals, where each interval is an array with inclusive start and end times.
- Output: The minimum number of groups required such that no intervals overlap within the same group.

## Explanation

1. **Sort the Intervals**: Separate the `start times` and `end times` of the intervals and sort both lists.
2. **Two-Pointer Technique**: Use two pointers to track the start and end times:
- One pointer tracks the current `starting` interval.
- The other pointer tracks the current `ending` interval.
3. **Count Overlaps**: As you iterate through the sorted lists:
- When a new interval starts before an existing one ends, increment the count of overlapping intervals.
- When an interval ends, decrement the count of overlapping intervals.
4. **Track Maximum Overlaps**: Maintain a variable to keep track of the maximum number of overlapping intervals at any point. This maximum will represent the minimum number of groups needed.

## Time Complexity ⏱️
Sorting the intervals takes `O(n log n)`, where n is the number of intervals.
The traversal using the two-pointer technique is `O(n)`.
Overall complexity: `O(n log n)`.

## Space Complexity 💾
The extra space used for storing start and end times is `O(n)`.
Overall space complexity: `O(n)`.

## Example
`Input: [[1, 5], [3, 7], [6, 10], [8, 12]]`
`Output: 2`

Explanation: 
- Group 1: [1, 5], [6, 10]
- Group 2: [3, 7], [8, 12]

## Conclusion
This solution efficiently divides intervals into the minimum number of non-overlapping groups by sorting the start and end times and utilizing a two-pointer approach to track overlaps. This approach provides an optimal and scalable solution for the problem, regardless of the programming language used.