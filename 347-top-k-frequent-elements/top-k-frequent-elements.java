class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (int i =0; i< nums.length ; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        pq.addAll(map.entrySet());

        for(int i = 0; i < k; i++)
        {
            Map.Entry<Integer, Integer> max = pq.poll();
            arr[i] = max.getKey();
        }
        return arr;
        
    }
}