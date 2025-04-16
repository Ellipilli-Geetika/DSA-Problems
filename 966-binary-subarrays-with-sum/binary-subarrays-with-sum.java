class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int sum = 0;
        int count = 0;
        for(int i= 0 ;i < nums.length;i++)
        {
            sum = sum + nums[i];
            if(sum == goal)
            {
                count += 1;
            }

            int rem = sum - goal;
            if(map.containsKey(rem))
            {
                count += map.get(rem);
            }
            if(map.containsKey(sum))
            {
                map.put(sum,map.get(sum)+1);
            }else
            {
                map.put(sum,1);
            }

        }
        return count;
        
    }
}