// LeetCode 933 - Number of Recent Calls
// Approach: Store request times in a queue and remove times outside the 3000 ms range.

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.offer(t);

        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }
}

// Time Complexity: O(1) amortized per ping - each request is added and removed once.
// Space Complexity: O(n) - the queue stores requests in the current time window.
