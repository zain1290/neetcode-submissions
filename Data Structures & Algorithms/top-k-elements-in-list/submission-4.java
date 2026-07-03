class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }

        return res;
    }
}
