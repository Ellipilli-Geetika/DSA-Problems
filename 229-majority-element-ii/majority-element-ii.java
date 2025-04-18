class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length/3;
        for(int i : map.keySet())
        {
            if(map.get(i)>n)
            {
                l.add(i);
            }
        }
        return l;
    }
}