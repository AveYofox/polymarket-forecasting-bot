class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int targetFriendStartTime = times[targetFriend][0];
        int seatNo = 0;
        Queue<Integer> availableSeats = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableSeats.add(i);
        }
        List<Triplet> timeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (times[i][0] <= targetFriendStartTime) {
                timeList.add(new Triplet(i, times[i][0], true));
                if (times[i][1] <= targetFriendStartTime) {
                    timeList.add(new Triplet(i, times[i][1], false));
                }
            }
        }
        Collections.sort(timeList, (t1, t2) -> t1.time != t2.time ? t1.time - t2.time : t1.isStart ? 1 : -1);
        int[] seats = new int[n];

        for (int i = 0; i < timeList.size(); i++) {
            if (timeList.get(i).isStart == true) {
                seats[timeList.get(i).index] = availableSeats.poll();
            } else {
                availableSeats.add(seats[timeList.get(i).index]);
            }
        }
        return seats[targetFriend];
    }
}

class Triplet {
    int index;
    int time;
    boolean isStart;

    Triplet(int index, int time, boolean isStart) {
        this.index = index;
        this.time = time;
        this.isStart = isStart;
    }
}
